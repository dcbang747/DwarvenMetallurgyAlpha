package com.dwarvencraft.recipe;

import com.dwarvencraft.DwarvenCraft;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {

    public static final RecipeType<AncientSmeltingRecipe> ANCIENT_SMELTING =
            Registry.register(Registries.RECIPE_TYPE,
                    Identifier.of(DwarvenCraft.MOD_ID, "ancient_smelting"),
                    new RecipeType<AncientSmeltingRecipe>() {
                        @Override
                        public String toString() {
                            return "dwarvencraft:ancient_smelting";
                        }
                    });

    public static final RecipeSerializer<AncientSmeltingRecipe> ANCIENT_SMELTING_SERIALIZER =
            RecipeSerializer.register("dwarvencraft:ancient_smelting",
                    new AbstractCookingRecipe.Serializer<>(AncientSmeltingRecipe::new, 100));

    public static void initialize() {
    }
}
