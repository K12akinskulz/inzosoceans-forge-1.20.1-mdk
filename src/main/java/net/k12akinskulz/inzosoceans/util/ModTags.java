package net.k12akinskulz.inzosoceans.util;

import net.k12akinskulz.inzosoceans.Inzos_Oceans;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INZOS_TOOL_TIER_ONE = tag("inzos_tool_tier_one");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Inzos_Oceans.MOD_ID, name));
        }
    }
}
