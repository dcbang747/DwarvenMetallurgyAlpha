package com.dwarvencraft.screen;

import com.dwarvencraft.recipe.ModRecipes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.RecipePropertySet;
import net.minecraft.recipe.book.RecipeBookType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.util.Identifier;

public class DurinulFurnaceScreenHandler extends AbstractFurnaceScreenHandler {

    private static final RegistryKey<RecipePropertySet> BLAST_FURNACE_INPUT =
            RegistryKey.of(RecipePropertySet.REGISTRY, Identifier.of("minecraft", "blast_furnace_input"));

    // RecipeBookType: CRAFTING(0), FURNACE(1), BLAST_FURNACE(2), SMOKER(3)
    private static final RecipeBookType BLAST_FURNACE_TYPE = RecipeBookType.values()[2];

    public DurinulFurnaceScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.DURINUL_FURNACE_SCREEN_HANDLER, ModRecipes.DURINUL_SMELTING,
                BLAST_FURNACE_INPUT, BLAST_FURNACE_TYPE, syncId, playerInventory);
    }

    public DurinulFurnaceScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(ModScreenHandlers.DURINUL_FURNACE_SCREEN_HANDLER, ModRecipes.DURINUL_SMELTING,
                BLAST_FURNACE_INPUT, BLAST_FURNACE_TYPE, syncId, playerInventory, inventory, propertyDelegate);
    }
}
