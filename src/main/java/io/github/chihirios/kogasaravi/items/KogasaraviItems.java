package io.github.chihirios.kogasaravi.items;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KogasaraviItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kogasaravi.MODID);

    public static final DeferredItem<BlockItem> CHIHIRIUMOREBLOCK_ITEM = ITEMS.registerSimpleBlockItem("chihirium_ore", KogasaraviBlocks.CHIHIRIUMOREBLOCK);

    public static final DeferredItem<Item> RAWCHIHIRIUMORE = ITEMS.registerItem("raw_chihirium", Item::new, new Item.Properties());
}
