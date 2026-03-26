package com.dwarvencraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = of("incorrect_for_bronze_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = of("incorrect_for_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_SHANOR_TOOL = of("incorrect_for_shanor_tool");
        public static final TagKey<Block> INCORRECT_FOR_KIDZUL_TOOL = of("incorrect_for_kidzul_tool");
        public static final TagKey<Block> INCORRECT_FOR_GABIL_TOOL = of("incorrect_for_gabil_tool");
        public static final TagKey<Block> INCORRECT_FOR_DURINUL_TOOL = of("incorrect_for_durinul_tool");
        public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOL = of("incorrect_for_mithril_tool");

        private static TagKey<Block> of(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(DwarvenCraft.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BRONZE_REPAIR_MATERIALS = of("bronze_repair_materials");
        public static final TagKey<Item> STEEL_REPAIR_MATERIALS = of("steel_repair_materials");

        private static TagKey<Item> of(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(DwarvenCraft.MOD_ID, name));
        }
    }
}
