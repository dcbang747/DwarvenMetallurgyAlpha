package com.dwarvencraft.effect;

import com.dwarvencraft.item.ModItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

public final class MithrilArmorEffect {
    private MithrilArmorEffect() {}

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                if (hasFullMithrilSet(player)) {
                    // amplifier 0 = Resistance I, refreshed every tick so it's effectively permanent while worn
                    player.addStatusEffect(new StatusEffectInstance(
                            StatusEffects.RESISTANCE, 40, 0, true, false, true));
                }
            }
        });
    }

    private static boolean hasFullMithrilSet(ServerPlayerEntity p) {
        ItemStack head = p.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chest = p.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack legs = p.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack feet = p.getEquippedStack(EquipmentSlot.FEET);
        return head.isOf(ModItems.MITHRIL_HELMET)
                && chest.isOf(ModItems.MITHRIL_CHESTPLATE)
                && legs.isOf(ModItems.MITHRIL_LEGGINGS)
                && feet.isOf(ModItems.MITHRIL_BOOTS);
    }
}
