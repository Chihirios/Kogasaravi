package io.github.chihirios.kogasaravi.data.loottable;

import io.github.chihirios.kogasaravi.Kogasaravi;
import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;
import io.github.chihirios.kogasaravi.items.KogasaraviItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;
import java.util.function.BiConsumer;

public class MyBlockLootSubProvider extends LootTableSubProvider {
    // The constructor can be private if this class is an inner class of your loot table provider.
    // The parameter is provided by the lambda in the LootTableProvider's constructor.
    public MyBlockLootSubProvider(HolderLookup.Provider lookupProvider) {
        // The first parameter is a set of blocks we are creating loot tables for. Instead of hardcoding,
        // we use our block registry and just pass an empty set here.
        // The second parameter is the feature flag set, this will be the default flags
        // unless you are adding custom flags (which is beyond the scope of this article).

    }

    // The contents of this Iterable are used for validation.
    // We return an Iterable over our block registry's values here.
//    @Override
//    protected Iterable<Block> getKnownBlocks() {
//        // The contents of our DeferredRegister.
//        return KogasaraviBlocks.BLOCKS.getEntries()
//                .stream()
//                // Cast to Block here, otherwise it will be a ? extends Block and Java will complain.
//                .map(e -> (Block) e.value())
//                .toList();
//    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> biConsumer) {

        biConsumer.accept(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Kogasaravi.MODID, "ortableone")), LootTable.lootTable()
                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(5)))
                .withPool(LootPool.lootPool()
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(5)))
                        .setRolls(UniformGenerator.between(5,10))
                        .add(LootItem.lootTableItem(KogasaraviItems.CUSTOMTHINGY))

                )
        );
    }
}