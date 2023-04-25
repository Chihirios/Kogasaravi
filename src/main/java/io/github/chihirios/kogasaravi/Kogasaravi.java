package io.github.chihirios.kogasaravi;

import com.mojang.logging.LogUtils;
import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;
import io.github.chihirios.kogasaravi.blocks.entities.KogasaraviBlockEntities;
import io.github.chihirios.kogasaravi.items.KogasaraviItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Kogasaravi.MODID)
@Mod.EventBusSubscriber(modid = Kogasaravi.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Kogasaravi
{
    public static final String MODID = "kogasaravi";
    public static ResourceLocation id(String path) {
        return new ResourceLocation(MODID, path);
    }
    public static final Logger LOGGER = LogUtils.getLogger();

    public Kogasaravi() {
        register();
    }

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        KogasaraviItems.register(eventBus);
        KogasaraviBlocks.register(eventBus);
        KogasaraviBlockEntities.register(eventBus);
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Kogasaravi Common");
    }
}
