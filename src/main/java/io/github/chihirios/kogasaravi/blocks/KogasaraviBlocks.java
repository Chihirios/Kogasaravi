package io.github.chihirios.kogasaravi.blocks;

import io.github.chihirios.kogasaravi.Kogasaravi;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KogasaraviBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Kogasaravi.MODID);

    public static final DeferredBlock<Block> CHIHIRIUM_ORE_BLOCK = BLOCKS.register("chihirium_ore", ChihiriumOre::new);

}
