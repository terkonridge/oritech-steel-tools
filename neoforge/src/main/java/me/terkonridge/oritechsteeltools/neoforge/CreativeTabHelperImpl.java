package me.terkonridge.oritechsteeltools.neoforge;

import me.terkonridge.oritechsteeltools.OritechSteelTools;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

@EventBusSubscriber(modid = OritechSteelTools.MOD_ID)
public class CreativeTabHelperImpl {

    private static final Map<ResourceLocation, List<Supplier<Item>>> TAB_ITEMS = new HashMap<>();

    @SafeVarargs
    public static void addToTab(ResourceLocation tabLocation, Supplier<Item>... items) {
        TAB_ITEMS.computeIfAbsent(tabLocation, k -> new ArrayList<>()).addAll(List.of(items));
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        ResourceLocation currentTab = event.getTabKey().location();
        
        if (TAB_ITEMS.containsKey(currentTab)) {
            for (Supplier<Item> itemSupplier : TAB_ITEMS.get(currentTab)) {
                Item item = itemSupplier.get();
                if (item != null) {
                    event.accept(item);
                } 
            }
        }
    }
}
