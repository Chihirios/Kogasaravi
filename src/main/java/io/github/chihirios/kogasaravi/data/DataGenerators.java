package io.github.chihirios.kogasaravi.data;


import io.github.chihirios.kogasaravi.data.loottable.BlockLootProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

public class DataGenerators {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent.Client event) {

        event.createProvider((GatherDataEvent.DataProviderFromOutputLookup<LootTableProvider>) (output, lookupProvider) -> new LootTableProvider(

                output,

                Set.of(),

                // List of Providers go here
                List.of(

                        new LootTableProvider.SubProviderEntry(
                        BlockLootProvider::new,
                        LootContextParamSets.BLOCK)


                ),

        lookupProvider
    ));
    }

}
