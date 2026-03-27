package com.dwarvencraft.block.entity;

import com.dwarvencraft.DwarvenCraft;
import com.dwarvencraft.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<AncientFurnaceBlockEntity> ANCIENT_FURNACE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(DwarvenCraft.MOD_ID, "ancient_furnace"),
                    FabricBlockEntityTypeBuilder.create(AncientFurnaceBlockEntity::new, ModBlocks.ANCIENT_FURNACE).build()
            );

    public static void initialize() {
    }
}
