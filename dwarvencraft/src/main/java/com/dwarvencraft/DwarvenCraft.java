package com.dwarvencraft;

import com.dwarvencraft.block.ModBlocks;
import com.dwarvencraft.block.entity.ModBlockEntities;
import com.dwarvencraft.effect.MithrilArmorEffect;
import com.dwarvencraft.item.ModItemGroups;
import com.dwarvencraft.item.ModItems;
import com.dwarvencraft.recipe.ModRecipes;
import com.dwarvencraft.screen.ModScreenHandlers;
import com.dwarvencraft.world.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenCraft implements ModInitializer {
    public static final String MOD_ID = "dwarvencraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModRecipes.initialize();
        ModBlocks.initialize();
        ModItems.initialize();
        ModItemGroups.initialize();
        ModBlockEntities.initialize();
        ModScreenHandlers.initialize();
        ModWorldGeneration.initialize();

        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.COKE, 1600);
        });

        MithrilArmorEffect.register();

        LOGGER.info("Dwarven Craft initialized - The forges are lit!");
    }
}
