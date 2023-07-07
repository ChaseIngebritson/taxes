package com.taxes.items;

import net.minecraft.item.FoodComponent;

public class Form1040Sandwich extends Form1040 {
  public static final FoodComponent FOOD = new FoodComponent.Builder()
    .hunger(6)
    .saturationModifier(0.6F)
    .build();
  
  public Form1040Sandwich(Settings settings) {
    super(
      settings
        .food(FOOD)
    );
  }
}
