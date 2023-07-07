package com.taxes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.taxes.items.Form1040;
import com.taxes.items.Form1040Sandwich;
import com.taxes.blocks.CustomBlock;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("taxes");

	public static final Form1040 FORM_1040 = new Form1040(new FabricItemSettings());
	public static final Form1040Sandwich FORM_1040_SANDWICH = new Form1040Sandwich(new FabricItemSettings());

	public static final CustomBlock CUSTOM_BLOCK = new CustomBlock(FabricBlockSettings.create().strength(4.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registries.ITEM, new Identifier("taxes", "form_1040"), FORM_1040);
		Registry.register(Registries.ITEM, new Identifier("taxes", "form_1040_sandwich"), FORM_1040_SANDWICH);

		Registry.register(Registries.ITEM, new Identifier("taxes", "custom_block"), new BlockItem(CUSTOM_BLOCK, new Item.Settings()));

		Registry.register(Registries.BLOCK, new Identifier("taxes", "custom_block"), CUSTOM_BLOCK);
	}
}