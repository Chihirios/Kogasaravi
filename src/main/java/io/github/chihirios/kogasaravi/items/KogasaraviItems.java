package io.github.chihirios.kogasaravi.items;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KogasaraviItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kogasaravi.MODID);

    public static final DeferredItem<BlockItem> MAGNESIA_ORE_BLOCK = ITEMS.registerSimpleBlockItem("magnesia_ore", KogasaraviBlocks.MAGNESIA_ORE_BLOCK);

    public static final DeferredItem<Item> MAGNESIA_POWDER = ITEMS.registerItem("magnesia_powder", Item::new, new Item.Properties());

    public static final DeferredItem<BlockItem> FIRE_CLAY = ITEMS.registerSimpleBlockItem("fire_clay", KogasaraviBlocks.FIRE_CLAY);

    public static final DeferredItem<Item> FIRE_CLAY_BALL = ITEMS.registerItem("fire_clay_ball", Item::new, new Item.Properties());

}
