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

    // === MATERIALS ===
    public static final Item STICK_BUNDLE = register("stick_bundle", Item::new, new Item.Settings());
    public static final Item FIRE_STARTER = register("fire_starter", FireStarterItem::new, new Item.Settings().maxDamage(1));
    public static final Item RAW_TIN = register("raw_tin", Item::new, new Item.Settings());
    public static final Item TIN_INGOT = register("tin_ingot", Item::new, new Item.Settings());
    public static final Item BRONZE_MIX = register("bronze_mix", Item::new, new Item.Settings());
    public static final Item BRONZE_INGOT = register("bronze_ingot", Item::new, new Item.Settings());
    public static final Item COKE = register("coke", Item::new, new Item.Settings());
    public static final Item STEEL_INGOT = register("steel_ingot", Item::new, new Item.Settings());
    public static final Item RAW_SILVER = register("raw_silver", Item::new, new Item.Settings());
    public static final Item SILVER_INGOT = register("silver_ingot", Item::new, new Item.Settings());
    public static final Item RAW_SILVER_BITS = register("raw_silver_bits", Item::new, new Item.Settings());
    public static final Item RAW_GOLD_BITS = register("raw_gold_bits", Item::new, new Item.Settings());
    public static final Item SHANOR_MIX = register("shanor_mix", Item::new, new Item.Settings());
    public static final Item SHANOR_INGOT = register("shanor_ingot", Item::new, new Item.Settings());
    public static final Item KIDZUL_MIX = register("kidzul_mix", Item::new, new Item.Settings());
    public static final Item KIDZUL_INGOT = register("kidzul_ingot", Item::new, new Item.Settings());
    public static final Item GABIL_MIX = register("gabil_mix", Item::new, new Item.Settings());
    public static final Item GABIL_INGOT = register("gabil_ingot", Item::new, new Item.Settings());
    public static final Item GABIL_PLATE = register("gabil_plate", Item::new, new Item.Settings());

    // === BRONZE TOOLS & ARMOR ===
    public static final Item BRONZE_SWORD = register("bronze_sword", Item::new, new Item.Settings().sword(ModToolMaterials.BRONZE, 3.0F, -2.4F));
    public static final Item BRONZE_PICKAXE = register("bronze_pickaxe", Item::new, new Item.Settings().pickaxe(ModToolMaterials.BRONZE, 1.0F, -2.8F));
    public static final Item BRONZE_AXE = register("bronze_axe", Item::new, new Item.Settings().axe(ModToolMaterials.BRONZE, 6.0F, -3.1F));
    public static final Item BRONZE_SHOVEL = register("bronze_shovel", Item::new, new Item.Settings().shovel(ModToolMaterials.BRONZE, 1.5F, -3.0F));
    public static final Item BRONZE_HOE = register("bronze_hoe", Item::new, new Item.Settings().hoe(ModToolMaterials.BRONZE, -1.0F, -2.0F));
    public static final Item BRONZE_SPEAR = register("bronze_spear", Item::new, new Item.Settings().spear(ModToolMaterials.BRONZE, 3.0F, -3.5F, 0.8F, 0.8F, 0.8F, 0.5F, 3.0F, 2.0F, 2.0F));
    public static final Item BRONZE_HELMET = register("bronze_helmet", Item::new, new Item.Settings().armor(ModArmorMaterials.BRONZE, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.BRONZE_BASE_DURABILITY)));
    public static final Item BRONZE_CHESTPLATE = register("bronze_chestplate", Item::new, new Item.Settings().armor(ModArmorMaterials.BRONZE, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.BRONZE_BASE_DURABILITY)));
    public static final Item BRONZE_LEGGINGS = register("bronze_leggings", Item::new, new Item.Settings().armor(ModArmorMaterials.BRONZE, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.BRONZE_BASE_DURABILITY)));
    public static final Item BRONZE_BOOTS = register("bronze_boots", Item::new, new Item.Settings().armor(ModArmorMaterials.BRONZE, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.BRONZE_BASE_DURABILITY)));

    // === STEEL TOOLS & ARMOR ===
    public static final Item STEEL_SWORD = register("steel_sword", Item::new, new Item.Settings().sword(ModToolMaterials.STEEL, 3.0F, -2.4F));
    public static final Item STEEL_PICKAXE = register("steel_pickaxe", Item::new, new Item.Settings().pickaxe(ModToolMaterials.STEEL, 1.0F, -2.8F));
    public static final Item STEEL_AXE = register("steel_axe", Item::new, new Item.Settings().axe(ModToolMaterials.STEEL, 6.0F, -3.1F));
    public static final Item STEEL_SHOVEL = register("steel_shovel", Item::new, new Item.Settings().shovel(ModToolMaterials.STEEL, 1.5F, -3.0F));
    public static final Item STEEL_HOE = register("steel_hoe", Item::new, new Item.Settings().hoe(ModToolMaterials.STEEL, -1.0F, -2.0F));
    public static final Item STEEL_SPEAR = register("steel_spear", Item::new, new Item.Settings().spear(ModToolMaterials.STEEL, 3.5F, -3.8F, 0.9F, 0.9F, 0.9F, 0.45F, 2.8F, 1.8F, 1.8F));
    public static final Item STEEL_HELMET = register("steel_helmet", Item::new, new Item.Settings().armor(ModArmorMaterials.STEEL, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.STEEL_BASE_DURABILITY)));
    public static final Item STEEL_CHESTPLATE = register("steel_chestplate", Item::new, new Item.Settings().armor(ModArmorMaterials.STEEL, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.STEEL_BASE_DURABILITY)));
    public static final Item STEEL_LEGGINGS = register("steel_leggings", Item::new, new Item.Settings().armor(ModArmorMaterials.STEEL, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.STEEL_BASE_DURABILITY)));
    public static final Item STEEL_BOOTS = register("steel_boots", Item::new, new Item.Settings().armor(ModArmorMaterials.STEEL, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.STEEL_BASE_DURABILITY)));

    // === SHANOR TOOLS & ARMOR ===
    public static final Item SHANOR_SWORD = register("shanor_sword", Item::new, new Item.Settings().sword(ModToolMaterials.SHANOR, 3.0F, -2.4F));
    public static final Item SHANOR_PICKAXE = register("shanor_pickaxe", Item::new, new Item.Settings().pickaxe(ModToolMaterials.SHANOR, 1.0F, -2.8F));
    public static final Item SHANOR_AXE = register("shanor_axe", Item::new, new Item.Settings().axe(ModToolMaterials.SHANOR, 6.0F, -3.1F));
    public static final Item SHANOR_SHOVEL = register("shanor_shovel", Item::new, new Item.Settings().shovel(ModToolMaterials.SHANOR, 1.5F, -3.0F));
    public static final Item SHANOR_HOE = register("shanor_hoe", Item::new, new Item.Settings().hoe(ModToolMaterials.SHANOR, -1.0F, -2.0F));
    public static final Item SHANOR_SPEAR = register("shanor_spear", Item::new, new Item.Settings().spear(ModToolMaterials.SHANOR, 4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.4F, 2.5F, 1.5F, 1.5F));
    public static final Item SHANOR_HELMET = register("shanor_helmet", Item::new, new Item.Settings().armor(ModArmorMaterials.SHANOR, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.SHANOR_BASE_DURABILITY)));
    public static final Item SHANOR_CHESTPLATE = register("shanor_chestplate", Item::new, new Item.Settings().armor(ModArmorMaterials.SHANOR, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.SHANOR_BASE_DURABILITY)));
    public static final Item SHANOR_LEGGINGS = register("shanor_leggings", Item::new, new Item.Settings().armor(ModArmorMaterials.SHANOR, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.SHANOR_BASE_DURABILITY)));
    public static final Item SHANOR_BOOTS = register("shanor_boots", Item::new, new Item.Settings().armor(ModArmorMaterials.SHANOR, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.SHANOR_BASE_DURABILITY)));

    // === KIDZUL TOOLS & ARMOR ===
    public static final Item KIDZUL_SWORD = register("kidzul_sword", Item::new, new Item.Settings().sword(ModToolMaterials.KIDZUL, 3.0F, -2.4F));
    public static final Item KIDZUL_PICKAXE = register("kidzul_pickaxe", Item::new, new Item.Settings().pickaxe(ModToolMaterials.KIDZUL, 1.0F, -2.8F));
    public static final Item KIDZUL_AXE = register("kidzul_axe", Item::new, new Item.Settings().axe(ModToolMaterials.KIDZUL, 6.0F, -3.1F));
    public static final Item KIDZUL_SHOVEL = register("kidzul_shovel", Item::new, new Item.Settings().shovel(ModToolMaterials.KIDZUL, 1.5F, -3.0F));
    public static final Item KIDZUL_HOE = register("kidzul_hoe", Item::new, new Item.Settings().hoe(ModToolMaterials.KIDZUL, -1.0F, -2.0F));
    public static final Item KIDZUL_SPEAR = register("kidzul_spear", Item::new, new Item.Settings().spear(ModToolMaterials.KIDZUL, 4.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.4F, 2.5F, 1.5F, 1.5F));
    public static final Item KIDZUL_HELMET = register("kidzul_helmet", Item::new, new Item.Settings().armor(ModArmorMaterials.KIDZUL, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.KIDZUL_BASE_DURABILITY)));
    public static final Item KIDZUL_CHESTPLATE = register("kidzul_chestplate", Item::new, new Item.Settings().armor(ModArmorMaterials.KIDZUL, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.KIDZUL_BASE_DURABILITY)));
    public static final Item KIDZUL_LEGGINGS = register("kidzul_leggings", Item::new, new Item.Settings().armor(ModArmorMaterials.KIDZUL, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.KIDZUL_BASE_DURABILITY)));
    public static final Item KIDZUL_BOOTS = register("kidzul_boots", Item::new, new Item.Settings().armor(ModArmorMaterials.KIDZUL, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.KIDZUL_BASE_DURABILITY)));

    // === GABIL TOOLS & ARMOR ===
    public static final Item GABIL_SWORD = register("gabil_sword", Item::new, new Item.Settings().sword(ModToolMaterials.GABIL, 3.0F, -2.4F));
    public static final Item GABIL_PICKAXE = register("gabil_pickaxe", Item::new, new Item.Settings().pickaxe(ModToolMaterials.GABIL, 1.0F, -2.8F));
    public static final Item GABIL_AXE = register("gabil_axe", Item::new, new Item.Settings().axe(ModToolMaterials.GABIL, 6.0F, -3.1F));
    public static final Item GABIL_SHOVEL = register("gabil_shovel", Item::new, new Item.Settings().shovel(ModToolMaterials.GABIL, 1.5F, -3.0F));
    public static final Item GABIL_HOE = register("gabil_hoe", Item::new, new Item.Settings().hoe(ModToolMaterials.GABIL, -1.0F, -2.0F));
    public static final Item GABIL_SPEAR = register("gabil_spear", Item::new, new Item.Settings().spear(ModToolMaterials.GABIL, 4.5F, -4.05F, 1.1F, 1.1F, 1.1F, 0.35F, 2.3F, 1.3F, 1.3F));
    public static final Item GABIL_HELMET = register("gabil_helmet", Item::new, new Item.Settings().armor(ModArmorMaterials.GABIL, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.GABIL_BASE_DURABILITY)));
    public static final Item GABIL_CHESTPLATE = register("gabil_chestplate", Item::new, new Item.Settings().armor(ModArmorMaterials.GABIL, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.GABIL_BASE_DURABILITY)));
    public static final Item GABIL_LEGGINGS = register("gabil_leggings", Item::new, new Item.Settings().armor(ModArmorMaterials.GABIL, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.GABIL_BASE_DURABILITY)));
    public static final Item GABIL_BOOTS = register("gabil_boots", Item::new, new Item.Settings().armor(ModArmorMaterials.GABIL, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.GABIL_BASE_DURABILITY)));

    // === DURINUL TOOLS & ARMOR ===
    public static final Item DURINUL_MIX = register("durinul_mix", Item::new, new Item.Settings());
    public static final Item DURINUL_INGOT = register("durinul_ingot", Item::new, new Item.Settings().fireproof());
    public static final Item DURINUL_SWORD = register("durinul_sword", Item::new, new Item.Settings().fireproof().sword(ModToolMaterials.DURINUL, 3.0F, -2.4F));
    public static final Item DURINUL_PICKAXE = register("durinul_pickaxe", Item::new, new Item.Settings().fireproof().pickaxe(ModToolMaterials.DURINUL, 1.0F, -2.8F));
    public static final Item DURINUL_AXE = register("durinul_axe", Item::new, new Item.Settings().fireproof().axe(ModToolMaterials.DURINUL, 5.0F, -3.0F));
    public static final Item DURINUL_SHOVEL = register("durinul_shovel", Item::new, new Item.Settings().fireproof().shovel(ModToolMaterials.DURINUL, 1.5F, -3.0F));
    public static final Item DURINUL_HOE = register("durinul_hoe", Item::new, new Item.Settings().fireproof().hoe(ModToolMaterials.DURINUL, -4.0F, 0.0F));
    public static final Item DURINUL_SPEAR = register("durinul_spear", Item::new, new Item.Settings().fireproof().spear(ModToolMaterials.DURINUL, 5.0F, -4.1F, 1.2F, 1.2F, 1.2F, 0.3F, 2.0F, 1.0F, 1.0F));
    public static final Item DURINUL_HELMET = register("durinul_helmet", Item::new, new Item.Settings().fireproof().armor(ModArmorMaterials.DURINUL, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.DURINUL_BASE_DURABILITY)));
    public static final Item DURINUL_CHESTPLATE = register("durinul_chestplate", Item::new, new Item.Settings().fireproof().armor(ModArmorMaterials.DURINUL, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.DURINUL_BASE_DURABILITY)));
    public static final Item DURINUL_LEGGINGS = register("durinul_leggings", Item::new, new Item.Settings().fireproof().armor(ModArmorMaterials.DURINUL, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.DURINUL_BASE_DURABILITY)));
    public static final Item DURINUL_BOOTS = register("durinul_boots", Item::new, new Item.Settings().fireproof().armor(ModArmorMaterials.DURINUL, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.DURINUL_BASE_DURABILITY)));

    // === MITHRIL TOOLS & ARMOR ===
    public static final Item RAW_MITHRIL = register("raw_mithril", Item::new, new Item.Settings());
    public static final Item MITHRIL_INGOT = register("mithril_ingot", Item::new, new Item.Settings().fireproof());
    public static final Item MITHRIL_SWORD = register("mithril_sword", Item::new, new Item.Settings().fireproof().sword(ModToolMaterials.MITHRIL, 3.0F, -2.4F));
    public static final Item MITHRIL_PICKAXE = register("mithril_pickaxe", Item::new, new Item.Settings().fireproof().pickaxe(ModToolMaterials.MITHRIL, 1.0F, -2.8F));
    public static final Item MITHRIL_AXE = register("mithril_axe", Item::new, new Item.Settings().fireproof().axe(ModToolMaterials.MITHRIL, 5.0F, -3.0F));
    public static final Item MITHRIL_SHOVEL = register("mithril_shovel", Item::new, new Item.Settings().fireproof().shovel(ModToolMaterials.MITHRIL, 1.5F, -3.0F));
    public static final Item MITHRIL_HOE = register("mithril_hoe", Item::new, new Item.Settings().fireproof().hoe(ModToolMaterials.MITHRIL, -4.0F, 0.0F));
    public static final Item MITHRIL_SPEAR = register("mithril_spear", Item::new, new Item.Settings().fireproof().spear(ModToolMaterials.MITHRIL, 5.5F, -4.1F, 1.3F, 1.3F, 1.3F, 0.25F, 1.8F, 0.8F, 0.8F));
    public static final Item MITHRIL_HELMET = register("mithril_helmet", Item::new, new Item.Settings().fireproof().armor(ModArmorMaterials.MITHRIL, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.MITHRIL_BASE_DURABILITY)));
    public static final Item MITHRIL_CHESTPLATE = register("mithril_chestplate", Item::new, new Item.Settings().fireproof().armor(ModArmorMaterials.MITHRIL, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.MITHRIL_BASE_DURABILITY)));
    public static final Item MITHRIL_LEGGINGS = register("mithril_leggings", Item::new, new Item.Settings().fireproof().armor(ModArmorMaterials.MITHRIL, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.MITHRIL_BASE_DURABILITY)));
    public static final Item MITHRIL_BOOTS = register("mithril_boots", Item::new, new Item.Settings().fireproof().armor(ModArmorMaterials.MITHRIL, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.MITHRIL_BASE_DURABILITY)));

    // === REGISTRATION ===
    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DwarvenCraft.MOD_ID, name));
        return Items.register(key, factory, settings);
    }

    public static void initialize() {
    }
}
