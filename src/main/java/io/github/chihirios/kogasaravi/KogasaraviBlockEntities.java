package io.github.chihirios.kogasaravi;

import io.github.chihirios.kogasaravi.blocks.entities.ForgeBlockEntity;
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

    protected static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
