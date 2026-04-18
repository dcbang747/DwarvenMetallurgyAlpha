package com.dwarvencraft.recipe;

import com.dwarvencraft.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.recipe.book.RecipeBookCategories;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.recipe.display.FurnaceRecipeDisplay;
import net.minecraft.recipe.display.RecipeDisplay;
import net.minecraft.recipe.display.SlotDisplay;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AncientSmeltingRecipe extends AbstractCookingRecipe {

    private static final List<RecipeBookCategory> ALL_CATEGORIES = new ArrayList<>();
    static {
        try {
            for (Field f : RecipeBookCategories.class.getDeclaredFields()) {
                if (f.getType() == RecipeBookCategory.class) {
                    f.setAccessible(true);
                    ALL_CATEGORIES.add((RecipeBookCategory) f.get(null));
                }
            }
        } catch (Exception ignored) {}
    }

    // Index 11 = BLAST_FURNACE_MISC
    private static RecipeBookCategory getBlastMisc() {
        return ALL_CATEGORIES.size() > 11 ? ALL_CATEGORIES.get(11) : ALL_CATEGORIES.get(ALL_CATEGORIES.size() - 1);
    }

    public AncientSmeltingRecipe(String group, CookingRecipeCategory category, Ingredient ingredient, ItemStack result, float experience, int cookingTime) {
        super(group, category, ingredient, result, experience, cookingTime);
    }

    @Override
    public Item getCookerItem() {
        return ModBlocks.ANCIENT_FURNACE.asItem();
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return getBlastMisc();
    }

    @Override
    public List<RecipeDisplay> getDisplays() {
        return List.of(
                new FurnaceRecipeDisplay(
                        this.ingredient().toDisplay(),
                        SlotDisplay.AnyFuelSlotDisplay.INSTANCE,
                        new SlotDisplay.ItemSlotDisplay(this.result().getItem().getRegistryEntry()),
                        new SlotDisplay.ItemSlotDisplay(this.getCookerItem().getRegistryEntry()),
                        this.getCookingTime(),
                        this.getExperience()
                )
        );
    }

    @Override
    public RecipeType<? extends AbstractCookingRecipe> getType() {
        return ModRecipes.ANCIENT_SMELTING;
    }

    @Override
    public RecipeSerializer<? extends AbstractCookingRecipe> getSerializer() {
        return ModRecipes.ANCIENT_SMELTING_SERIALIZER;
    }
}
