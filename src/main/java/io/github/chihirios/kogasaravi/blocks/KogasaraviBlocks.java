package io.github.chihirios.kogasaravi.blocks;

import io.github.chihirios.kogasaravi.Kogasaravi;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KogasaraviBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Kogasaravi.MODID);

    public static final RegistryObject<Block> FORGE_BRICK = BLOCKS.register("forge_brick", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.5f)));
    public static final RegistryObject<Block> BASIC_FORGE = BLOCKS.register("basic_forge", ForgeBlock::new);
    public static final RegistryObject<Block> CHALLENGE_PORTAL = BLOCKS.register("challenge_portal", ChallengePortalBlock::new);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
