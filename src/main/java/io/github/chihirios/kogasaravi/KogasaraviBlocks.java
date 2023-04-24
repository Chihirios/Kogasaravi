package io.github.chihirios.kogasaravi;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KogasaraviBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Kogasaravi.MODID);

    public static final RegistryObject<Block> FORGE_BRICK = BLOCKS.register("forge_brick", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));

    protected static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
