package io.github.chihirios.kogasaravi.blocks.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ChallengePortalBlockEntity extends BlockEntity {
    public int tick = 0;
    public ChallengePortalBlockEntity(BlockPos pos, BlockState state) {
        super(KogasaraviBlockEntities.CHALLENGE_PORTAL.get(), pos, state);
    }

    public static void clientTick(Level level, BlockPos pos, BlockState state, ChallengePortalBlockEntity be) {
        be.tick++;
    }
}
