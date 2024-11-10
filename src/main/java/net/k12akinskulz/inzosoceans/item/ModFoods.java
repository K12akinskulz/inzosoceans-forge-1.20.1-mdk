package net.k12akinskulz.inzosoceans.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_MANATEE_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER,100),0.1f).meat().build();
    public static final FoodProperties MANATEE_MEAT = new FoodProperties.Builder().nutrition(8).saturationMod(4)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK,300),1).meat().build();
    public static final FoodProperties MEATBALL = new FoodProperties.Builder().nutrition(10).saturationMod(4)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION,100),1).meat().build();
    public static final FoodProperties RAW_MEATBALL = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER,100),0.5f).meat().build();
    public static final FoodProperties MANATEE_MILK = new FoodProperties.Builder().nutrition(2).saturationMod(0)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING,400),1).alwaysEat().build();
    public static final FoodProperties CHOCOLATE_MANATEE_MILK = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING,600),0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600), 0.5f).alwaysEat().build();
    public static final FoodProperties MANATEE_PROTEIN_SHAKE = new FoodProperties.Builder().nutrition(5).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION,200),1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,300, 1),0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,300, 1),0.7f)
            .alwaysEat().build();




}
