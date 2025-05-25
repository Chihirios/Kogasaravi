package io.github.chihirios.kogasaravi.blocks;

import io.github.chihirios.kogasaravi.Kogasaravi;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KogasaraviBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Kogasaravi.MODID);

    public static final DeferredBlock<Block> MAGNESIA_ORE_BLOCK = BLOCKS.register("magnesia_ore", MagnesiaOre::new);

    public static final DeferredBlock<Block> FIRE_CLAY = BLOCKS.register("fire_clay", FireClay::new);

}
