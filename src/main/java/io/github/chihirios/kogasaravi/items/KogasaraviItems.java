package io.github.chihirios.kogasaravi.items;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KogasaraviItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Kogasaravi.MODID);
    public static final RegistryObject<Item> FORGE_BRICK = ITEMS.register("forge_brick", () -> new BlockItem(KogasaraviBlocks.FORGE_BRICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BASIC_FORGE = ITEMS.register("basic_forge", () -> new BlockItem(KogasaraviBlocks.BASIC_FORGE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHALLENGE_PORTAL = ITEMS.register("challenge_portal", () -> new BlockItem(KogasaraviBlocks.CHALLENGE_PORTAL.get(), new Item.Properties().rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

        eventBus.addListener(KogasaraviItems::makeCreativeTab);
    }

    private static void makeCreativeTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(Kogasaravi.id("main"), builder -> builder.title(Component.translatable("kogasaravi.itemGroup.main"))
                .icon(() -> new ItemStack(BASIC_FORGE.get()))
                .displayItems((params, output) -> ITEMS.getEntries().forEach(entry -> output.accept(entry.get()))));
    }
}
