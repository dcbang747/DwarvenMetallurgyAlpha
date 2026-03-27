package com.dwarvencraft.block.entity;

import com.dwarvencraft.screen.AncientFurnaceScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class AncientFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    public AncientFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ANCIENT_FURNACE, pos, state, RecipeType.BLASTING);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.dwarvencraft.ancient_furnace");
    }

    @Override
    protected AbstractFurnaceScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new AncientFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
