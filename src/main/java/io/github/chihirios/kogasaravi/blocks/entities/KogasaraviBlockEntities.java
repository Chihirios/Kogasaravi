package io.github.chihirios.kogasaravi.blocks.entities;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.ChallengePortalBlock;
import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KogasaraviBlockEntities {
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Kogasaravi.MODID);
    @SuppressWarnings("DataFlowIssue")
    public static final RegistryObject<BlockEntityType<ForgeBlockEntity>> FORGE =
            BLOCK_ENTITIES.register("forge", () -> BlockEntityType.Builder.of(ForgeBlockEntity::new, KogasaraviBlocks.BASIC_FORGE.get()).build(null));
    public static final RegistryObject<BlockEntityType<ChallengePortalBlockEntity>> CHALLENGE_PORTAL =
            BLOCK_ENTITIES.register("challenge_portal", () -> BlockEntityType.Builder.of(ChallengePortalBlockEntity::new, KogasaraviBlocks.CHALLENGE_PORTAL.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
