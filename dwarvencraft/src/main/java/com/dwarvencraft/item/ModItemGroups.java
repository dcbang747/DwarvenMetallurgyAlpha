package com.dwarvencraft.item;

import com.dwarvencraft.DwarvenCraft;
import com.dwarvencraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> DWARVENCRAFT_KEY =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(DwarvenCraft.MOD_ID, "dwarvencraft_group"));

    public static final ItemGroup DWARVENCRAFT_TAB = Registry.register(
            Registries.ITEM_GROUP, DWARVENCRAFT_KEY,
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.dwarvencraft"))
                    .icon(() -> new ItemStack(ModItems.GABIL_INGOT))
                    .entries((ctx, e) -> {
                        // Materials
                        e.add(ModItems.STICK_BUNDLE); e.add(ModItems.FIRE_STARTER);
                        e.add(ModItems.RAW_TIN); e.add(ModItems.TIN_INGOT);
                        e.add(ModItems.BRONZE_MIX); e.add(ModItems.BRONZE_INGOT);
                        e.add(ModItems.COKE); e.add(ModItems.STEEL_INGOT);
                        e.add(ModItems.RAW_SILVER_BITS); e.add(ModItems.RAW_GOLD_BITS);
                        e.add(ModItems.RAW_SILVER); e.add(ModItems.SILVER_INGOT);
                        e.add(ModItems.SHANOR_MIX); e.add(ModItems.SHANOR_INGOT);
                        e.add(ModItems.KIDZUL_MIX); e.add(ModItems.KIDZUL_INGOT);
                        e.add(ModItems.GABIL_MIX); e.add(ModItems.GABIL_INGOT);
                        e.add(ModItems.GABIL_PLATE);
                        // Blocks
                        e.add(ModBlocks.TIN_ORE); e.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        e.add(ModBlocks.SILVER_ORE); e.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        // Bronze
                        e.add(ModItems.BRONZE_SWORD); e.add(ModItems.BRONZE_PICKAXE); e.add(ModItems.BRONZE_AXE);
                        e.add(ModItems.BRONZE_SHOVEL); e.add(ModItems.BRONZE_HOE); e.add(ModItems.BRONZE_SPEAR);
                        e.add(ModItems.BRONZE_HELMET); e.add(ModItems.BRONZE_CHESTPLATE);
                        e.add(ModItems.BRONZE_LEGGINGS); e.add(ModItems.BRONZE_BOOTS);
                        // Steel
                        e.add(ModItems.STEEL_SWORD); e.add(ModItems.STEEL_PICKAXE); e.add(ModItems.STEEL_AXE);
                        e.add(ModItems.STEEL_SHOVEL); e.add(ModItems.STEEL_HOE); e.add(ModItems.STEEL_SPEAR);
                        e.add(ModItems.STEEL_HELMET); e.add(ModItems.STEEL_CHESTPLATE);
                        e.add(ModItems.STEEL_LEGGINGS); e.add(ModItems.STEEL_BOOTS);
                        // Shanor
                        e.add(ModItems.SHANOR_SWORD); e.add(ModItems.SHANOR_PICKAXE); e.add(ModItems.SHANOR_AXE);
                        e.add(ModItems.SHANOR_SHOVEL); e.add(ModItems.SHANOR_HOE); e.add(ModItems.SHANOR_SPEAR);
                        e.add(ModItems.SHANOR_HELMET); e.add(ModItems.SHANOR_CHESTPLATE);
                        e.add(ModItems.SHANOR_LEGGINGS); e.add(ModItems.SHANOR_BOOTS);
                        // Kidzul
                        e.add(ModItems.KIDZUL_SWORD); e.add(ModItems.KIDZUL_PICKAXE); e.add(ModItems.KIDZUL_AXE);
                        e.add(ModItems.KIDZUL_SHOVEL); e.add(ModItems.KIDZUL_HOE); e.add(ModItems.KIDZUL_SPEAR);
                        e.add(ModItems.KIDZUL_HELMET); e.add(ModItems.KIDZUL_CHESTPLATE);
                        e.add(ModItems.KIDZUL_LEGGINGS); e.add(ModItems.KIDZUL_BOOTS);
                        // Gabil
                        e.add(ModItems.GABIL_SWORD); e.add(ModItems.GABIL_PICKAXE); e.add(ModItems.GABIL_AXE);
                        e.add(ModItems.GABIL_SHOVEL); e.add(ModItems.GABIL_HOE); e.add(ModItems.GABIL_SPEAR);
                        e.add(ModItems.GABIL_HELMET); e.add(ModItems.GABIL_CHESTPLATE);
                        e.add(ModItems.GABIL_LEGGINGS); e.add(ModItems.GABIL_BOOTS);
                        // Durinul
                        e.add(ModItems.DURINUL_MIX); e.add(ModItems.DURINUL_INGOT);
                        e.add(ModBlocks.ANCIENT_FURNACE);
                        e.add(ModItems.DURINUL_SWORD); e.add(ModItems.DURINUL_PICKAXE); e.add(ModItems.DURINUL_AXE);
                        e.add(ModItems.DURINUL_SHOVEL); e.add(ModItems.DURINUL_HOE); e.add(ModItems.DURINUL_SPEAR);
                        e.add(ModItems.DURINUL_HELMET); e.add(ModItems.DURINUL_CHESTPLATE);
                        e.add(ModItems.DURINUL_LEGGINGS); e.add(ModItems.DURINUL_BOOTS);
                    }).build()
    );

    public static void initialize() {}
}
