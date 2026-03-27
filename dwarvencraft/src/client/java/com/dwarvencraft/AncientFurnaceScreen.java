package com.dwarvencraft;

import com.dwarvencraft.screen.AncientFurnaceScreenHandler;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.recipebook.RecipeBookWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class AncientFurnaceScreen extends AbstractFurnaceScreen<AncientFurnaceScreenHandler> {

    private static final Identifier TEXTURE = Identifier.of("minecraft", "textures/gui/container/blast_furnace.png");
    private static final Identifier LIT_PROGRESS = Identifier.of("minecraft", "container/blast_furnace/lit_progress");
    private static final Identifier BURN_PROGRESS = Identifier.of("minecraft", "container/blast_furnace/burn_progress");
    private static final Text TOGGLE_TEXT = Text.translatable("gui.recipebook.toggleRecipes.blastable");

    public AncientFurnaceScreen(AncientFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title, TOGGLE_TEXT, TEXTURE, LIT_PROGRESS, BURN_PROGRESS, List.<RecipeBookWidget.Tab>of());
    }
}
