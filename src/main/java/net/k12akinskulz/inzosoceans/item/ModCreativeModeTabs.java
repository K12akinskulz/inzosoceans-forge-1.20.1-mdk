package net.k12akinskulz.inzosoceans.item;

import net.k12akinskulz.inzosoceans.Inzos_Oceans;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Inzos_Oceans.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INZOS_TAB = CREATIVE_MODE_TABS.register("inzos_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MYSTERY_CLAM.get()))
                    .title(Component.translatable("creativetab.inzos_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        /* items */
                        output.accept(ModItems.SEA_GLASS_HILT.get());
                        output.accept(ModItems.MYSTERY_CLAM.get());
                        output.accept(ModItems.PEARLED_CLAM.get());
                        output.accept(ModItems.EEL.get());

                        /* food items */
                        output.accept(ModItems.RAW_MANATEE_MEAT.get());
                        output.accept(ModItems.MANATEE_MEAT.get());
                        output.accept(ModItems.RAW_MEATBALL.get());
                        output.accept(ModItems.MEATBALL.get());
                        output.accept(ModItems.MANATEE_MILK.get());
                        output.accept(ModItems.CHOCOLATE_MANATEE_MILK.get());
                        output.accept(ModItems.MANATEE_PROTEIN_SHAKE.get());

                        /* tools */
                        output.accept(ModItems.SLIPPERY_WHIP.get());
                        output.accept(ModItems.BEACHED_TIDE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
