package net.k12akinskulz.inzosoceans.datagen;

import net.k12akinskulz.inzosoceans.Inzos_Oceans;
import net.k12akinskulz.inzosoceans.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Inzos_Oceans.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {

        /* items */
        simpleItem(ModItems.EEL);
        simpleItem(ModItems.MYSTERY_CLAM);
        simpleItem(ModItems.PEARLED_CLAM);

        /* food items */
        simpleItem(ModItems.RAW_MANATEE_MEAT);
        simpleItem(ModItems.MANATEE_MEAT);
        simpleItem(ModItems.RAW_MEATBALL);
        simpleItem(ModItems.MEATBALL);
        simpleItem(ModItems.MANATEE_MILK);
        simpleItem(ModItems.CHOCOLATE_MANATEE_MILK);
        simpleItem(ModItems.MANATEE_PROTEIN_SHAKE);

        /* tools, tool themed items */
        heldItem(ModItems.SLIPPERY_WHIP);
        heldItem(ModItems.SEA_GLASS_HILT);
        heldItem(ModItems.BEACHED_TIDE);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Inzos_Oceans.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder heldItem( RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Inzos_Oceans.MOD_ID, "item/" + item.getId().getPath()));
    }
}
