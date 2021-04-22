package com.mememan.mysticalagriculture_extras.lib.ingredient;

import com.mememan.mysticalagriculture_extras.lib.Mods;

public class IndustrialRevolutionIngredient {
	public static final String NIKOLITE_INGOT = mod("nikolite_ingot");
	public static final String ENRICHED_NIKOLITE_INGOT = mod("enriched_nikolite_ingot");

	public static String mod(String input){
		return (Mods.IndustrialRevolution + ":" + input);
	}
}
