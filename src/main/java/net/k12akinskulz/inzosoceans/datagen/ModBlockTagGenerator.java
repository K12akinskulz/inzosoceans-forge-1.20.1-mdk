package net.k12akinskulz.inzosoceans.datagen;

import net.k12akinskulz.inzosoceans.Inzos_Oceans;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Inzos_Oceans.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
       /* this.tag(ModTags.blocks.block tag)
            .add(ModBlocks.Block name>GET()).addTag(Tags.Blocks.ORES);
        */
    }
}
