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

    public static final int BRONZE_BASE_DURABILITY = 15;
    public static final RegistryKey<EquipmentAsset> BRONZE_EQUIPMENT_KEY =
            RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(DwarvenCraft.MOD_ID, "bronze"));
    public static final ArmorMaterial BRONZE = new ArmorMaterial(
            BRONZE_BASE_DURABILITY,
            Map.of(EquipmentType.HELMET, 2, EquipmentType.CHESTPLATE, 5, EquipmentType.LEGGINGS, 4, EquipmentType.BOOTS, 1),
            10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            ModTags.Items.BRONZE_REPAIR_MATERIALS, BRONZE_EQUIPMENT_KEY
    );

    // Steel: same armor values as iron but 50% more durability (iron base=15, steel=22)
    public static final int STEEL_BASE_DURABILITY = 22;
    public static final RegistryKey<EquipmentAsset> STEEL_EQUIPMENT_KEY =
            RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(DwarvenCraft.MOD_ID, "steel"));
    public static final ArmorMaterial STEEL = new ArmorMaterial(
            STEEL_BASE_DURABILITY,
            Map.of(EquipmentType.HELMET, 2, EquipmentType.CHESTPLATE, 6, EquipmentType.LEGGINGS, 5, EquipmentType.BOOTS, 2),
            9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            ModTags.Items.STEEL_REPAIR_MATERIALS, STEEL_EQUIPMENT_KEY
    );
}
