package com.dwarvencraft;

import com.dwarvencraft.item.BronzeArmorItem;
import com.dwarvencraft.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class DwarvenCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.ANCIENT_FURNACE_SCREEN_HANDLER, AncientFurnaceScreen::new);
        HandledScreens.register(ModScreenHandlers.DURINUL_FURNACE_SCREEN_HANDLER, DurinulFurnaceScreen::new);

        BronzeArmorItem.RENDERER_FACTORY = BronzeArmorRenderer::new;
        ClientModelDebugReloadListener.register();
    }
}
