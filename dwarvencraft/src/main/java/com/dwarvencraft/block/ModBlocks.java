package com.dwarvencraft.block;

import com.dwarvencraft.DwarvenCraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;

public class ModBlocks {

    public static final Block TIN_ORE = registerBlock("tin_ore",
            s -> new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), s),
            AbstractBlock.Settings.create().strength(3.0F, 3.0F).requiresTool().sounds(BlockSoundGroup.STONE));

    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            s -> new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), s),
            AbstractBlock.Settings.create().strength(4.5F, 3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            s -> new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), s),
            AbstractBlock.Settings.create().strength(3.0F, 3.0F).requiresTool().sounds(BlockSoundGroup.STONE));

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            s -> new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), s),
            AbstractBlock.Settings.create().strength(4.5F, 3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block ANCIENT_FURNACE = registerBlock("ancient_furnace",
            AncientFurnaceBlock::new,
            AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().luminance(state -> state.get(net.minecraft.block.AbstractFurnaceBlock.LIT) ? 13 : 0));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Identifier id = Identifier.of(DwarvenCraft.MOD_ID, name);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = Blocks.register(blockKey, factory, settings);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
        Items.register(itemKey, s -> new BlockItem(block, s), new Item.Settings().useBlockPrefixedTranslationKey());
        return block;
    }

    public static void initialize() {
    }
}
