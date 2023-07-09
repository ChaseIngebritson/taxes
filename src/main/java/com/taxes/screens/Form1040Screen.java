package com.taxes.screens;

import org.jetbrains.annotations.NotNull;

import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.OwoUIAdapter;
import net.minecraft.util.Identifier;

public class Form1040Screen extends BaseUIModelScreen<FlowLayout> {
  public Form1040Screen() {
    super(FlowLayout.class, DataSource.asset(new Identifier("taxes", "form_1040_model")));
  }

  @Override
  protected void build(FlowLayout rootComponent) {
    rootComponent.childById(ButtonComponent.class, "the-button").onPress(button -> {
      System.out.println("click");
    });
  }
}
