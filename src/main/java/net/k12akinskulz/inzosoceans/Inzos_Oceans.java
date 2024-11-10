package net.k12akinskulz.inzosoceans;

import com.mojang.logging.LogUtils;
import net.k12akinskulz.inzosoceans.item.ModCreativeModeTabs;
import net.k12akinskulz.inzosoceans.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Inzos_Oceans.MOD_ID)
public class Inzos_Oceans {
    public static final String MOD_ID = "inzosoceans";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Inzos_Oceans(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SEA_GLASS_HILT);
            event.accept(ModItems.PEARLED_CLAM);
            event.accept(ModItems.MYSTERY_CLAM);
            event.accept(ModItems.EEL);
            ;
        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.RAW_MANATEE_MEAT);
            event.accept(ModItems.MANATEE_MEAT);
            event.accept(ModItems.RAW_MEATBALL);
            event.accept(ModItems.MEATBALL);
            event.accept(ModItems.MANATEE_MILK.get());
            event.accept(ModItems.CHOCOLATE_MANATEE_MILK.get());
            event.accept(ModItems.MANATEE_PROTEIN_SHAKE.get());

            ;
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.BEACHED_TIDE);
            event.accept(ModItems.SLIPPERY_WHIP);
            ;
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}