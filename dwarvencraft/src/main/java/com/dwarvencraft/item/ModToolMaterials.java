package com.dwarvencraft.item;

import com.dwarvencraft.ModTags;
import net.minecraft.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial BRONZE = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL, 200, 5.0F, 1.5F, 10, ModTags.Items.BRONZE_REPAIR_MATERIALS);

    public static final ToolMaterial STEEL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL, 375, 6.0F, 2.0F, 14, ModTags.Items.STEEL_REPAIR_MATERIALS);

    public static final ToolMaterial SHANOR = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_SHANOR_TOOL, 1249, 8.0F, 3.0F, 30, ModTags.Items.SHANOR_REPAIR_MATERIALS);

    public static final ToolMaterial KIDZUL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_KIDZUL_TOOL, 1561, 8.0F, 3.0F, 10, ModTags.Items.KIDZUL_REPAIR_MATERIALS);

    public static final ToolMaterial GABIL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_GABIL_TOOL, 1873, 8.0F, 3.0F, 10, ModTags.Items.GABIL_REPAIR_MATERIALS);

    // Durinul: equivalent to netherite (2031 durability, 9.0 speed, 4.0 attack)
    public static final ToolMaterial DURINUL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_DURINUL_TOOL, 2031, 9.0F, 4.0F, 15, ModTags.Items.DURINUL_REPAIR_MATERIALS);
}
