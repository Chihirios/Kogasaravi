package io.github.chihirios.kogasaravi.blocks.entities;

import io.github.chihirios.kogasaravi.KogasaraviBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ForgeBlockEntity extends BlockEntity {
    public ForgeBlockEntity(BlockPos pos, BlockState state) {
        super(KogasaraviBlockEntities.FORGE.get(), pos, state);
    }
}
