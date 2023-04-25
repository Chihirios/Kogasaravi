package io.github.chihirios.kogasaravi.blocks;

import io.github.chihirios.kogasaravi.Kogasaravi;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class ChallengePortalBlock extends Block {
    public ChallengePortalBlock() {
        super(BlockBehaviour.Properties.of(Material.AMETHYST).strength(Block.INDESTRUCTIBLE));
    }

    @SuppressWarnings("deprecation")
    @Override
    @NotNull
    public InteractionResult use(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            Kogasaravi.LOGGER.info("Player %s clicked at %s".formatted(player.getGameProfile().getName(), pos.toShortString()));
            return InteractionResult.SUCCESS;
        }
    }
}
