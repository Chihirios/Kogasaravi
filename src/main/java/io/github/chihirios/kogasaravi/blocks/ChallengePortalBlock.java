package io.github.chihirios.kogasaravi.blocks;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.entities.ChallengePortalBlockEntity;
import io.github.chihirios.kogasaravi.blocks.entities.KogasaraviBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ChallengePortalBlock extends BaseEntityBlock {
    public ChallengePortalBlock() {
        super(BlockBehaviour.Properties.of(Material.AMETHYST).strength(Block.INDESTRUCTIBLE).lightLevel(state -> 12));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Block.box(2.0, 2.0, 2.0, 14.0, 14.0, 14.0);
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

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ChallengePortalBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        return createTickerHelper(blockEntityType, KogasaraviBlockEntities.CHALLENGE_PORTAL.get(), level.isClientSide ? ChallengePortalBlockEntity::clientTick : null);
    }
}
