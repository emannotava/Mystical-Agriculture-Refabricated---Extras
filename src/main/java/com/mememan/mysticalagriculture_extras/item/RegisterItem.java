package com.mememan.mysticalagriculture_extras.item;

import com.mememan.mysticalagriculture_extras.Main;
import com.mememan.mysticalagriculture_extras.lib.Strings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItem {
	public static final Item debug_item = addItem("debug_item", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	
	
	public static void initialize(){

	}

	public static Item addItem(String itemName, Item ItemDeclaration){
		return Registry.register(Registry.ITEM, new Identifier(Strings.modId, itemName), ItemDeclaration);
	}
}
