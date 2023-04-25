package io.github.chihirios.kogasaravi.blocks.entities.renderers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.github.chihirios.kogasaravi.blocks.entities.ChallengePortalBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ChallengePortalBlockEntityRenderer implements BlockEntityRenderer<ChallengePortalBlockEntity> {
    private static final ItemStack RENDER_STACK = new ItemStack(Items.ANVIL);
    private final ItemRenderer itemRender;

    public ChallengePortalBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.itemRender = context.getItemRenderer();
    }

    @Override
    public void render(ChallengePortalBlockEntity be, float partialTick, PoseStack stack, MultiBufferSource bufferSource, int light, int overlay) {
        var rotation = 12 * ((float) be.tick + partialTick);
        stack.pushPose();
        stack.translate(0.5f, 0f, 0.5f);
        stack.scale(2f, 2f, 2f);
        stack.mulPose(Axis.YP.rotationDegrees(rotation));
        itemRender.renderStatic(RENDER_STACK, ItemDisplayContext.GROUND, light, overlay, stack, bufferSource, be.getLevel(), (int) be.getBlockPos().asLong());
        stack.popPose();
    }
}
