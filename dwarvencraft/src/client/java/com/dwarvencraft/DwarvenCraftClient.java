package com.dwarvencraft;

import com.dwarvencraft.item.ModItems;
import com.dwarvencraft.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class DwarvenCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.ANCIENT_FURNACE_SCREEN_HANDLER, AncientFurnaceScreen::new);
        HandledScreens.register(ModScreenHandlers.DURINUL_FURNACE_SCREEN_HANDLER, DurinulFurnaceScreen::new);

        ArmorRenderer.register(new BronzeArmorRenderer("helmet"), ModItems.BRONZE_HELMET);
        ArmorRenderer.register(new BronzeArmorRenderer("chestplate"), ModItems.BRONZE_CHESTPLATE);
        ArmorRenderer.register(new BronzeArmorRenderer("leggings"), ModItems.BRONZE_LEGGINGS);
        ArmorRenderer.register(new BronzeArmorRenderer("boots"), ModItems.BRONZE_BOOTS);
    }
}
