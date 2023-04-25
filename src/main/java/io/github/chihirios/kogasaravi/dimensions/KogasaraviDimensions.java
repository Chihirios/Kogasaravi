package io.github.chihirios.kogasaravi.dimensions;

import io.github.chihirios.kogasaravi.Kogasaravi;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.dimension.DimensionType;

public class KogasaraviDimensions {
    public static final ResourceKey<DimensionType> CHALLENGE = register("challenge");

    private static ResourceKey<DimensionType> register(String name) {
        return ResourceKey.create(Registries.DIMENSION_TYPE, Kogasaravi.id(name));
    }
}
