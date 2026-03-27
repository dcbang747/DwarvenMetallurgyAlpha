package com.dwarvencraft.item;

import com.dwarvencraft.DwarvenCraft;
import com.dwarvencraft.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterials {
    private static RegistryKey<EquipmentAsset> key(String name) {
        return RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(DwarvenCraft.MOD_ID, name));
    }

    public static final int BRONZE_BASE_DURABILITY = 15;
    public static final RegistryKey<EquipmentAsset> BRONZE_EQUIPMENT_KEY = key("bronze");
    public static final ArmorMaterial BRONZE = new ArmorMaterial(BRONZE_BASE_DURABILITY,
            Map.of(EquipmentType.HELMET, 2, EquipmentType.CHESTPLATE, 5, EquipmentType.LEGGINGS, 4, EquipmentType.BOOTS, 1),
            10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ModTags.Items.BRONZE_REPAIR_MATERIALS, BRONZE_EQUIPMENT_KEY);

    public static final int STEEL_BASE_DURABILITY = 22;
    public static final RegistryKey<EquipmentAsset> STEEL_EQUIPMENT_KEY = key("steel");
    public static final ArmorMaterial STEEL = new ArmorMaterial(STEEL_BASE_DURABILITY,
            Map.of(EquipmentType.HELMET, 2, EquipmentType.CHESTPLATE, 6, EquipmentType.LEGGINGS, 5, EquipmentType.BOOTS, 2),
            9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ModTags.Items.STEEL_REPAIR_MATERIALS, STEEL_EQUIPMENT_KEY);

    public static final int SHANOR_BASE_DURABILITY = 26;
    public static final RegistryKey<EquipmentAsset> SHANOR_EQUIPMENT_KEY = key("shanor");
    public static final ArmorMaterial SHANOR = new ArmorMaterial(SHANOR_BASE_DURABILITY,
            Map.of(EquipmentType.HELMET, 3, EquipmentType.CHESTPLATE, 8, EquipmentType.LEGGINGS, 6, EquipmentType.BOOTS, 3),
            30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, ModTags.Items.SHANOR_REPAIR_MATERIALS, SHANOR_EQUIPMENT_KEY);

    public static final int KIDZUL_BASE_DURABILITY = 33;
    public static final RegistryKey<EquipmentAsset> KIDZUL_EQUIPMENT_KEY = key("kidzul");
    public static final ArmorMaterial KIDZUL = new ArmorMaterial(KIDZUL_BASE_DURABILITY,
            Map.of(EquipmentType.HELMET, 2, EquipmentType.CHESTPLATE, 7, EquipmentType.LEGGINGS, 6, EquipmentType.BOOTS, 3),
            10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, ModTags.Items.KIDZUL_REPAIR_MATERIALS, KIDZUL_EQUIPMENT_KEY);

    public static final int GABIL_BASE_DURABILITY = 39;
    public static final RegistryKey<EquipmentAsset> GABIL_EQUIPMENT_KEY = key("gabil");
    public static final ArmorMaterial GABIL = new ArmorMaterial(GABIL_BASE_DURABILITY,
            Map.of(EquipmentType.HELMET, 3, EquipmentType.CHESTPLATE, 8, EquipmentType.LEGGINGS, 6, EquipmentType.BOOTS, 3),
            10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, ModTags.Items.GABIL_REPAIR_MATERIALS, GABIL_EQUIPMENT_KEY);

    // Durinul: netherite equivalent (base 37, 3/8/6/3 armor, toughness 3, knockback resist 0.1)
    public static final int DURINUL_BASE_DURABILITY = 37;
    public static final RegistryKey<EquipmentAsset> DURINUL_EQUIPMENT_KEY = key("durinul");
    public static final ArmorMaterial DURINUL = new ArmorMaterial(DURINUL_BASE_DURABILITY,
            Map.of(EquipmentType.HELMET, 3, EquipmentType.CHESTPLATE, 8, EquipmentType.LEGGINGS, 6, EquipmentType.BOOTS, 3),
            15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ModTags.Items.DURINUL_REPAIR_MATERIALS, DURINUL_EQUIPMENT_KEY);
}
