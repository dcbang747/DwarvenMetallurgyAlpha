package com.dwarvencraft;

import com.dwarvencraft.screen.DurinulFurnaceScreenHandler;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.lang.reflect.Field;
import java.util.List;

public class DurinulFurnaceScreen extends AbstractFurnaceScreen<DurinulFurnaceScreenHandler> {

    private static final Identifier TEXTURE = Identifier.of("minecraft", "textures/gui/container/blast_furnace.png");
    private static final Identifier LIT_PROGRESS = Identifier.of("minecraft", "container/blast_furnace/lit_progress");
    private static final Identifier BURN_PROGRESS = Identifier.of("minecraft", "container/blast_furnace/burn_progress");
    private static final Text TOGGLE_TEXT = Text.translatable("gui.recipebook.toggleRecipes.blastable");
    private static final List<?> BLAST_TABS = getBlastFurnaceTabs();

    private static List<?> getBlastFurnaceTabs() {
        try {
            for (Field f : BlastFurnaceScreen.class.getDeclaredFields()) {
                if (f.getType() == List.class) {
                    f.setAccessible(true);
                    return (List<?>) f.get(null);
                }
            }
        } catch (Exception ignored) {}
        return List.of();
    }

    @SuppressWarnings("unchecked")
    public DurinulFurnaceScreen(DurinulFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title, TOGGLE_TEXT, TEXTURE, LIT_PROGRESS, BURN_PROGRESS, (List) BLAST_TABS);
    }
}
