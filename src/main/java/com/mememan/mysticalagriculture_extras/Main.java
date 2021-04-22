package com.mememan.mysticalagriculture_extras;

import java.util.ArrayList;

import com.mememan.mysticalagriculture_extras.lib.Strings;
import com.mememan.mysticalagriculture_extras.registry.RegisterRecipe;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

	public static ArrayList<Block> crops = new ArrayList<>();
	public static final RuntimeResourcePack assets = RuntimeResourcePack.create(Strings.modId + ":arrp");
	public static final ItemGroup GROUP_MAIN = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "all"), () -> new ItemStack(Items.GOLDEN_APPLE));

	@Override
	public void onInitialize() {
		RegisterRecipe.initialize();
		RRPCallback.EVENT.register(a -> a.add(assets));
		System.out.println("Mystical Agriculture: Refabricated - Extras(Server-Side) has been initialized!");
	}
	
}
