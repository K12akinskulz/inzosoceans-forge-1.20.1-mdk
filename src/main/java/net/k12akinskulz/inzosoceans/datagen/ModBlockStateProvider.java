package net.k12akinskulz.inzosoceans.datagen;

import net.k12akinskulz.inzosoceans.Inzos_Oceans;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Inzos_Oceans.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /* blockWithItem(ModBlocks.Mod_Id); */
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
