package io.github.chihirios.kogasaravi.blocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class FireClay extends Block {

    public FireClay(ResourceLocation registryName) {

        super(Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
        );



    }

}
