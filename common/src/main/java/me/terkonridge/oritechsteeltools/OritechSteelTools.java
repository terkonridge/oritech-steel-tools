package me.terkonridge.oritechsteeltools;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

public class OritechSteelTools {
    public static final String MOD_ID = "oritech_steel_tools";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> STEEL_SWORD = ITEMS.register("steel_sword", 
        () -> new SwordItem(SteelTier.INSTANCE, new Item.Properties()
            .attributes(SwordItem.createAttributes(SteelTier.INSTANCE, 3, -2.4f))));

    public static final RegistrySupplier<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", 
        () -> new PickaxeItem(SteelTier.INSTANCE, new Item.Properties()
            .attributes(PickaxeItem.createAttributes(SteelTier.INSTANCE, 1, -2.8f))));

    public static final RegistrySupplier<Item> STEEL_AXE = ITEMS.register("steel_axe", 
        () -> new AxeItem(SteelTier.INSTANCE, new Item.Properties()
            .attributes(AxeItem.createAttributes(SteelTier.INSTANCE, 6.0f, -3.1f))));

    public static final RegistrySupplier<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", 
        () -> new ShovelItem(SteelTier.INSTANCE, new Item.Properties()
            .attributes(ShovelItem.createAttributes(SteelTier.INSTANCE, 1.5f, -3.0f))));

    public static final RegistrySupplier<Item> STEEL_HOE = ITEMS.register("steel_hoe", 
        () -> new HoeItem(SteelTier.INSTANCE, new Item.Properties()
            .attributes(HoeItem.createAttributes(SteelTier.INSTANCE, -2, -1.0f))));

    public static void init() {
        ITEMS.register();

        CreativeTabHelper.addToTab(ResourceLocation.fromNamespaceAndPath("oritech", "equipment_group"),
            STEEL_AXE,
            STEEL_HOE,
            STEEL_PICKAXE,
            STEEL_SHOVEL,
            STEEL_SWORD
        );
    }
}