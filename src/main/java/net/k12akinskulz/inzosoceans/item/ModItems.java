package net.k12akinskulz.inzosoceans.item;

import net.k12akinskulz.inzosoceans.Inzos_Oceans;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Inzos_Oceans.MOD_ID);

    /* items */
    public static final RegistryObject<Item> SEA_GLASS_HILT = ITEMS.register("sea_glass_hilt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EEL = ITEMS.register("eel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEARLED_CLAM = ITEMS.register("pearled_clam",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MYSTERY_CLAM = ITEMS.register("mystery_clam",
            () -> new Item(new Item.Properties()));

    /* food items */
    public static final RegistryObject<Item> RAW_MANATEE_MEAT = ITEMS.register("raw_manatee_meat",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_MANATEE_MEAT)));
    public static final RegistryObject<Item> MANATEE_MEAT = ITEMS.register("manatee_meat",
            () -> new Item(new Item.Properties().food(ModFoods.MANATEE_MEAT)));
    public static final RegistryObject<Item> RAW_MEATBALL = ITEMS.register("raw_meatball",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_MEATBALL)));
    public static final RegistryObject<Item> MEATBALL = ITEMS.register("meatball",
            () -> new Item(new Item.Properties().food(ModFoods.MEATBALL)));
    public static final RegistryObject<Item> MANATEE_MILK = ITEMS.register("manatee_milk",
            () -> new Item(new Item.Properties().food(ModFoods.MANATEE_MILK)));
    public static final RegistryObject<Item> CHOCOLATE_MANATEE_MILK = ITEMS.register("chocolate_manatee_milk",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_MANATEE_MILK)));
    public static final RegistryObject<Item> MANATEE_PROTEIN_SHAKE = ITEMS.register("manatee_protein_shake",
            () -> new Item(new Item.Properties().food(ModFoods.MANATEE_PROTEIN_SHAKE)));


    /* tools */
    public static final RegistryObject<Item> BEACHED_TIDE = ITEMS.register("beached_tide",
            () -> new SwordItem(ModToolTiers.GEN_ONE, 0, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> SLIPPERY_WHIP = ITEMS.register("slippery_whip",
            () -> new SwordItem(ModToolTiers.GEN_ONE, 5, -3.1F, new Item.Properties().defaultDurability(160)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}