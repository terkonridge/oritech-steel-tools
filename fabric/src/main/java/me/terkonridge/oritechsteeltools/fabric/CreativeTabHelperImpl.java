package me.terkonridge.oritechsteeltools.fabric;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import java.util.function.Supplier;

public class CreativeTabHelperImpl {

    @SafeVarargs
    public static void addToTab(ResourceLocation tabLocation, Supplier<Item>... items) {

        ResourceKey<CreativeModeTab> tabKey = ResourceKey.create(Registries.CREATIVE_MODE_TAB, tabLocation);

        ItemGroupEvents.modifyEntriesEvent(tabKey).register(content -> {
            for (Supplier<Item> itemSupplier : items) {
                content.accept(itemSupplier.get());
            }
        });
    }
}