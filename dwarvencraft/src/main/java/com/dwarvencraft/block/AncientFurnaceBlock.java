package com.dwarvencraft.block;

import com.dwarvencraft.block.entity.AncientFurnaceBlockEntity;
import com.dwarvencraft.block.entity.ModBlockEntities;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AncientFurnaceBlock extends AbstractFurnaceBlock {
    public static final MapCodec<AncientFurnaceBlock> CODEC = createCodec(AncientFurnaceBlock::new);

    public AncientFurnaceBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends AbstractFurnaceBlock> getCodec() {
        return CODEC;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new AncientFurnaceBlockEntity(pos, state);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(world, type, ModBlockEntities.ANCIENT_FURNACE);
    }

    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof AncientFurnaceBlockEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory) blockEntity);
        }
    }
}
