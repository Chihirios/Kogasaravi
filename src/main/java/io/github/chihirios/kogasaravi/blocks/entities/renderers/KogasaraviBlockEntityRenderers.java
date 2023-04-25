package io.github.chihirios.kogasaravi.blocks.entities.renderers;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.entities.KogasaraviBlockEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = Kogasaravi.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KogasaraviBlockEntityRenderers {
    @SubscribeEvent
    public static void register(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(KogasaraviBlockEntities.CHALLENGE_PORTAL.get(), ChallengePortalBlockEntityRenderer::new);
    }
}
