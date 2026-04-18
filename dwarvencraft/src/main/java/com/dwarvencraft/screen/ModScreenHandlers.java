package com.dwarvencraft.screen;

import com.dwarvencraft.DwarvenCraft;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

    public static final ScreenHandlerType<AncientFurnaceScreenHandler> ANCIENT_FURNACE_SCREEN_HANDLER =
            Registry.register(
                    Registries.SCREEN_HANDLER,
                    Identifier.of(DwarvenCraft.MOD_ID, "ancient_furnace"),
                    new ScreenHandlerType<>(AncientFurnaceScreenHandler::new, net.minecraft.resource.featuretoggle.FeatureFlags.VANILLA_FEATURES)
            );

    public static final ScreenHandlerType<DurinulFurnaceScreenHandler> DURINUL_FURNACE_SCREEN_HANDLER =
            Registry.register(
                    Registries.SCREEN_HANDLER,
                    Identifier.of(DwarvenCraft.MOD_ID, "durinul_furnace"),
                    new ScreenHandlerType<>(DurinulFurnaceScreenHandler::new, net.minecraft.resource.featuretoggle.FeatureFlags.VANILLA_FEATURES)
            );

    public static void initialize() {
    }
}
