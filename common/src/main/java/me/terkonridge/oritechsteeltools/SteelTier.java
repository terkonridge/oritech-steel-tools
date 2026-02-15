package me.terkonridge.oritechsteeltools;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class SteelTier implements Tier {
    public static final SteelTier INSTANCE = new SteelTier();

    @Override public int getUses() { return 832; }
    @Override public float getSpeed() { return 7.0f; }
    @Override public float getAttackDamageBonus() { return 2.5f; }
    @Override public int getEnchantmentValue() { return 15; }
    
    @Override 
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return BlockTags.INCORRECT_FOR_IRON_TOOL;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ingots/steel")));
    }
}