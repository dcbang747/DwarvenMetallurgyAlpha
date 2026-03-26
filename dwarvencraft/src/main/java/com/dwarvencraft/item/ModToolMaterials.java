package com.dwarvencraft.item;

import com.dwarvencraft.ModTags;
import net.minecraft.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial BRONZE = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL,
            200, 5.0F, 1.5F, 10,
            ModTags.Items.BRONZE_REPAIR_MATERIALS
    );

    // Steel: same as vanilla iron but 50% more durability (iron=250, steel=375)
    // Cannot mine diamonds (same restriction as iron)
    public static final ToolMaterial STEEL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            375, 6.0F, 2.0F, 14,
            ModTags.Items.STEEL_REPAIR_MATERIALS
    );
}
