package com.dwarvencraft.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class DiamondNerfMixin {

    @Unique
    private static boolean dwarvencraft$isDiamondItem(Item item) {
        Identifier id = Registries.ITEM.getId(item);
        if (id == null) return false;
        String path = id.getPath();
        return path.startsWith("diamond_") && (
                path.contains("sword") || path.contains("pickaxe") || path.contains("axe")
                || path.contains("shovel") || path.contains("hoe") || path.contains("spear")
                || path.contains("helmet") || path.contains("chestplate")
                || path.contains("leggings") || path.contains("boots")
        );
    }

    @Inject(method = "getMaxDamage", at = @At("HEAD"), cancellable = true)
    private void dwarvencraft$nerfDiamondDurability(CallbackInfoReturnable<Integer> cir) {
        ItemStack self = (ItemStack) (Object) this;
        Item item = self.getItem();

        if (!dwarvencraft$isDiamondItem(item)) return;

        Identifier id = Registries.ITEM.getId(item);
        String path = id.getPath();

        // Diamond tools -> gold tool durability (32)
        if (path.contains("sword") || path.contains("pickaxe") || path.contains("axe")
                || path.contains("shovel") || path.contains("hoe") || path.contains("spear")) {
            cir.setReturnValue(32);
        }
        // Diamond armor -> gold armor base durability (7)
        if (path.contains("helmet")) cir.setReturnValue(77);
        if (path.contains("chestplate")) cir.setReturnValue(112);
        if (path.contains("leggings")) cir.setReturnValue(105);
        if (path.contains("boots")) cir.setReturnValue(91);
    }
}
