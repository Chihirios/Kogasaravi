package io.github.chihirios.kogasaravi.items;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KogasaraviItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kogasaravi.MODID);

    public static final DeferredItem<BlockItem> CHIHIRIUMOREBLOCK_ITEM = ITEMS.registerSimpleBlockItem("chihiriumore", KogasaraviBlocks.CHIHIRIUMOREBLOCK);

    public static final DeferredItem<Item> CHIHIRIUMORE = ITEMS.registerItem("rawchihirium", Item::new, new Item.Properties());

    public static final DeferredItem<BlockItem> FRAUZIUMOREBLOCK_ITEM = ITEMS.registerSimpleBlockItem("frauziumore", KogasaraviBlocks.FRAUZIUMOREBLOCK);

    public static final DeferredItem<Item> FRAUZIUMORE = ITEMS.registerItem("rawfrauzium", Item::new, new Item.Properties());

}
