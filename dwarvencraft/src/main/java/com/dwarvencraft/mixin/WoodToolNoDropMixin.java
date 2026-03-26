package com.dwarvencraft.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class WoodToolNoDropMixin {

    @Inject(method = "afterBreak", at = @At("HEAD"), cancellable = true)
    private void dwarvencraft$preventWoodToolStoneDrops(World world, PlayerEntity player, BlockPos pos,
            BlockState state, BlockEntity blockEntity, ItemStack tool, CallbackInfo ci) {

        // Check if tool is a wooden tool
        Identifier toolId = Registries.ITEM.getId(tool.getItem());
        if (toolId == null) return;
        String toolPath = toolId.getPath();
        boolean isWoodTool = toolPath.startsWith("wooden_");

        if (!isWoodTool) return;

        // Check if block is a stone-type block
        Block block = state.getBlock();
        if (block == Blocks.STONE || block == Blocks.COBBLESTONE
                || block == Blocks.DEEPSLATE || block == Blocks.COBBLED_DEEPSLATE
                || block == Blocks.ANDESITE || block == Blocks.DIORITE || block == Blocks.GRANITE
                || block == Blocks.TUFF || block == Blocks.CALCITE || block == Blocks.DRIPSTONE_BLOCK
                || block == Blocks.BLACKSTONE) {
            // Cancel the drop but still give XP for breaking
            if (world instanceof ServerWorld serverWorld) {
                player.addExhaustion(0.005F);
            }
            ci.cancel();
        }
    }
}
