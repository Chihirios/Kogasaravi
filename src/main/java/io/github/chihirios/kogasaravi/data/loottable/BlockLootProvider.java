package io.github.chihirios.kogasaravi.data.loottable;

import io.github.chihirios.kogasaravi.blocks.KogasaraviBlocks;
import io.github.chihirios.kogasaravi.items.KogasaraviItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class BlockLootProvider extends BlockLootSubProvider {
    // The constructor can be private if this class is an inner class of your loot table provider.
    // The parameter is provided by the lambda in the LootTableProvider's constructor.

    public BlockLootProvider(HolderLookup.Provider lookupProvider) {
        // The first parameter is a set of blocks we are creating loot tables for. Instead of hardcoding,
        // we use our block registry and just pass an empty set here.
        // The second parameter is the feature flag set, this will be the default flags
        // unless you are adding custom flags (which is beyond the scope of this article).
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);

    }

    protected LootTable.Builder oreDropTable(Block varBlock, Item varitem, float minDrop, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);


        return this.createSilkTouchDispatchTable(varBlock,
                this.applyExplosionDecay(varBlock, LootItem.lootTableItem(varitem)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));

    }


    @Override
    protected void generate() {
        add(KogasaraviBlocks.MAGNESIA_ORE_BLOCK.get(), block -> oreDropTable(KogasaraviBlocks.MAGNESIA_ORE_BLOCK.get(), KogasaraviItems.MAGNESIA_POWDER.get(), 1, 1));
        add(KogasaraviBlocks.FIRE_CLAY.get(), block -> oreDropTable(KogasaraviBlocks.FIRE_CLAY.get(), KogasaraviItems.FIRE_CLAY_BALL.get(), 2, 4));

    }



    // The contents of this Iterable are used for validation.
    // We return an Iterable over our block registry's values here.
    @Override
    protected Iterable<Block> getKnownBlocks() {
        // The contents of our DeferredRegister.
        return KogasaraviBlocks.BLOCKS.getEntries()
                .stream()
                // Cast to Block here, otherwise it will be a ? extends Block and Java will complain.
                .map(e -> (Block) e.value())
                .toList();
    }
}