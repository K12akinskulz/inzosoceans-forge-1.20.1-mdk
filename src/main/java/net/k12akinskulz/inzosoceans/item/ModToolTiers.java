package net.k12akinskulz.inzosoceans.item;

import net.k12akinskulz.inzosoceans.Inzos_Oceans;
import net.k12akinskulz.inzosoceans.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier GEN_ONE = TierSortingRegistry.registerTier(
            new ForgeTier(1, 128, 0, 4, 14,
                    ModTags.Blocks.INZOS_TOOL_TIER_ONE, () -> Ingredient.of(ModItems.SEA_GLASS_HILT.get())),
            new ResourceLocation(Inzos_Oceans.MOD_ID, "sea_glass_hilt"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
