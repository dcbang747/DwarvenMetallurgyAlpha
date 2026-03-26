package com.dwarvencraft.item;

import com.dwarvencraft.DwarvenCraft;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    // === PHASE 1: MATERIALS ===
    public static final Item STICK_BUNDLE = register("stick_bundle", Item::new, new Item.Settings());
    public static final Item FIRE_STARTER = register("fire_starter", FireStarterItem::new, new Item.Settings().maxDamage(1));
    public static final Item RAW_TIN = register("raw_tin", Item::new, new Item.Settings());
    public static final Item TIN_INGOT = register("tin_ingot", Item::new, new Item.Settings());
    public static final Item BRONZE_MIX = register("bronze_mix", Item::new, new Item.Settings());
    public static final Item BRONZE_INGOT = register("bronze_ingot", Item::new, new Item.Settings());

    // === PHASE 2: MATERIALS ===
    public static final Item COKE = register("coke", Item::new, new Item.Settings());
    public static final Item STEEL_INGOT = register("steel_ingot", Item::new, new Item.Settings());
    public static final Item RAW_SILVER = register("raw_silver", Item::new, new Item.Settings());
    public static final Item SILVER_INGOT = register("silver_ingot", Item::new, new Item.Settings());
    public static final Item RAW_SILVER_BITS = register("raw_silver_bits", Item::new, new Item.Settings());
    public static final Item RAW_GOLD_BITS = register("raw_gold_bits", Item::new, new Item.Settings());

    // === BRONZE TOOLS ===
    public static final Item BRONZE_SWORD = register("bronze_sword", Item::new,
            new Item.Settings().sword(ModToolMaterials.BRONZE, 3.0F, -2.4F));
    public static final Item BRONZE_PICKAXE = register("bronze_pickaxe", Item::new,
            new Item.Settings().pickaxe(ModToolMaterials.BRONZE, 1.0F, -2.8F));
    public static final Item BRONZE_AXE = register("bronze_axe", Item::new,
            new Item.Settings().axe(ModToolMaterials.BRONZE, 6.0F, -3.1F));
    public static final Item BRONZE_SHOVEL = register("bronze_shovel", Item::new,
            new Item.Settings().shovel(ModToolMaterials.BRONZE, 1.5F, -3.0F));
    public static final Item BRONZE_HOE = register("bronze_hoe", Item::new,
            new Item.Settings().hoe(ModToolMaterials.BRONZE, -1.0F, -2.0F));

    // === BRONZE ARMOR ===
    public static final Item BRONZE_HELMET = register("bronze_helmet", Item::new,
            new Item.Settings().armor(ModArmorMaterials.BRONZE, EquipmentType.HELMET)
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.BRONZE_BASE_DURABILITY)));
    public static final Item BRONZE_CHESTPLATE = register("bronze_chestplate", Item::new,
            new Item.Settings().armor(ModArmorMaterials.BRONZE, EquipmentType.CHESTPLATE)
                    .maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.BRONZE_BASE_DURABILITY)));
    public static final Item BRONZE_LEGGINGS = register("bronze_leggings", Item::new,
            new Item.Settings().armor(ModArmorMaterials.BRONZE, EquipmentType.LEGGINGS)
                    .maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.BRONZE_BASE_DURABILITY)));
    public static final Item BRONZE_BOOTS = register("bronze_boots", Item::new,
            new Item.Settings().armor(ModArmorMaterials.BRONZE, EquipmentType.BOOTS)
                    .maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.BRONZE_BASE_DURABILITY)));

    // === STEEL TOOLS ===
    public static final Item STEEL_SWORD = register("steel_sword", Item::new,
            new Item.Settings().sword(ModToolMaterials.STEEL, 3.0F, -2.4F));
    public static final Item STEEL_PICKAXE = register("steel_pickaxe", Item::new,
            new Item.Settings().pickaxe(ModToolMaterials.STEEL, 1.0F, -2.8F));
    public static final Item STEEL_AXE = register("steel_axe", Item::new,
            new Item.Settings().axe(ModToolMaterials.STEEL, 6.0F, -3.1F));
    public static final Item STEEL_SHOVEL = register("steel_shovel", Item::new,
            new Item.Settings().shovel(ModToolMaterials.STEEL, 1.5F, -3.0F));
    public static final Item STEEL_HOE = register("steel_hoe", Item::new,
            new Item.Settings().hoe(ModToolMaterials.STEEL, -1.0F, -2.0F));

    // === STEEL ARMOR ===
    public static final Item STEEL_HELMET = register("steel_helmet", Item::new,
            new Item.Settings().armor(ModArmorMaterials.STEEL, EquipmentType.HELMET)
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.STEEL_BASE_DURABILITY)));
    public static final Item STEEL_CHESTPLATE = register("steel_chestplate", Item::new,
            new Item.Settings().armor(ModArmorMaterials.STEEL, EquipmentType.CHESTPLATE)
                    .maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.STEEL_BASE_DURABILITY)));
    public static final Item STEEL_LEGGINGS = register("steel_leggings", Item::new,
            new Item.Settings().armor(ModArmorMaterials.STEEL, EquipmentType.LEGGINGS)
                    .maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.STEEL_BASE_DURABILITY)));
    public static final Item STEEL_BOOTS = register("steel_boots", Item::new,
            new Item.Settings().armor(ModArmorMaterials.STEEL, EquipmentType.BOOTS)
                    .maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.STEEL_BASE_DURABILITY)));

    // === REGISTRATION ===
    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DwarvenCraft.MOD_ID, name));
        return Items.register(key, factory, settings);
    }

    public static void initialize() {
    }
}
