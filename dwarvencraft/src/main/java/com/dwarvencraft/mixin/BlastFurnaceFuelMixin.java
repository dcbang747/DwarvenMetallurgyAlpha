package com.dwarvencraft.mixin;

import com.dwarvencraft.block.entity.AncientFurnaceBlockEntity;
import com.dwarvencraft.item.ModItems;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlastFurnaceBlockEntity;
import net.minecraft.item.FuelRegistry;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFurnaceBlockEntity.class)
public class BlastFurnaceFuelMixin {

    @Inject(method = "getFuelTime", at = @At("HEAD"), cancellable = true)
    private void dwarvencraft$restrictFurnaceFuel(FuelRegistry fuelRegistry, ItemStack stack, CallbackInfoReturnable<Integer> cir) {
        // Blast furnace and ancient furnace: coke only
        if ((Object) this instanceof BlastFurnaceBlockEntity || (Object) this instanceof AncientFurnaceBlockEntity) {
            if (!stack.isOf(ModItems.COKE)) {
                cir.setReturnValue(0);
            }
        }
    }
}
