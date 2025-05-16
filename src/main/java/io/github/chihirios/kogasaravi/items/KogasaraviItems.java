package io.github.chihirios.kogasaravi.items;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KogasaraviItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kogasaravi.MODID);

    public static final DeferredItem<BlockItem> CHIHIRIUM_ORE_BLOCK = ITEMS.registerSimpleBlockItem("chihirium_ore", KogasaraviBlocks.CHIHIRIUM_ORE_BLOCK);

    public static final DeferredItem<Item> CHIHIRIUM_RAW = ITEMS.registerItem("chihirium_raw", Item::new, new Item.Properties());
}
