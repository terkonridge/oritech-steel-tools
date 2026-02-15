package me.terkonridge.oritechsteeltools;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CreativeTabHelper {

    @SafeVarargs
    @ExpectPlatform
    public static void addToTab(ResourceLocation tabLocation, Supplier<Item>... items) {
        throw new AssertionError();
    }
}