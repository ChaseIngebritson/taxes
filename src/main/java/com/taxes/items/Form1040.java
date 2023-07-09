package com.taxes.items;

import com.taxes.screens.Form1040Screen;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Form1040 extends TaxForm {
  public Form1040(Settings settings) {
    super(settings);
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    // TODO: Use owo-networking to send packets to avoid crashing servers
    // https://discord.com/channels/825828008644313089/1067852896806371348/1079560833115365457
    if (world.isClient) {
      MinecraftClient.getInstance().setScreen(new Form1040Screen());
    }

    return TypedActionResult.pass(user.getStackInHand(hand));
  }
}
