package com.dwarvencraft.block.entity;

import com.dwarvencraft.recipe.ModRecipes;
import com.dwarvencraft.screen.DurinulFurnaceScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class DurinulFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    public DurinulFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DURINUL_FURNACE, pos, state, ModRecipes.DURINUL_SMELTING);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.dwarvencraft.durinul_furnace");
    }

    @Override
    protected AbstractFurnaceScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new DurinulFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
