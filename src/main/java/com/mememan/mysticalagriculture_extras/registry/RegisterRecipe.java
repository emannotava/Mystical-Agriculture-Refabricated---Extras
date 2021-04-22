package com.mememan.mysticalagriculture_extras.registry;

import com.mememan.mysticalagriculture_extras.lib.Mods;

import net.devtech.arrp.json.recipe.JIngredient;
import net.devtech.arrp.json.recipe.JKeys;
import net.devtech.arrp.json.recipe.JPattern;
import net.devtech.arrp.json.recipe.JRecipe;
import net.devtech.arrp.json.recipe.JResult;
import net.minecraft.util.Identifier;

import static com.mememan.mysticalagriculture_extras.Main.assets;

public class RegisterRecipe {
	public static final String[] seedPattern = {"IEI", "ESE", "IEI"};
	public static final String[] square = {"XXX", "XXX", "XXX"};
	public static final String[] squareHollow = {"XXX", "X X", "XXX"};

	public static void initialize(){
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "air"}, new String[]{"mysticalagriculture:air_agglomeratio", translateEssenceName("1"), translateSeedName("1")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "earth"}, new String[]{"mysticalagriculture:earth_agglomeratio", translateEssenceName("1"), translateSeedName("1")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "water"}, new String[]{"mysticalagriculture:water_agglomeratio", translateEssenceName("1"), translateSeedName("1")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "fire"}, new String[]{"mysticalagriculture:fire_agglomeratio", translateEssenceName("1"), translateSeedName("1")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "inferium"}, new String[]{"inferium_seeds", translateEssenceName("1"), translateSeedName("1")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "stone"}, new String[]{"c:stone", translateEssenceName("1"), translateSeedName("1")}, true/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "dirt"}, new String[]{"minecraft:dirt", translateEssenceName("1"), translateSeedName("1")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "wood"}, new String[]{"c:logs", translateEssenceName("1"), translateSeedName("1")}, true/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "ice"}, new String[]{"minecraft:ice", translateEssenceName("1"), translateSeedName("1")}, false/*true = useTags, false = useItem*/);

		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "nature"}, new String[]{"mysticalagriculture:nature_agglomeratio", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "dye"}, new String[]{"mysticalagriculture:dye_agglomeratio", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "nether"}, new String[]{"mysticalagriculture:nether_agglomeratio", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "coal"}, new String[]{"minecraft:coal", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "coral"}, new String[]{"mysticalagriculture:coral_agglomeratio", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "honey"}, new String[]{"mysticalagriculture:honey_agglomeratio", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "pig"}, new String[]{"mysticalagriculture_extras:mob_chunk_pig", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "chicken"}, new String[]{"mysticalagriculture_extras:mob_chunk_chicken", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "cow"}, new String[]{"mysticalagriculture_extras:mob_chunk_cow", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "sheep"}, new String[]{"mysticalagriculture_extras:mob_chunk_sheep", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "squid"}, new String[]{"mysticalagriculture_extras:mob_chunk_squid", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "fish"}, new String[]{"mysticalagriculture_extras:mob_chunk_fish", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "slime"}, new String[]{"mysticalagriculture_extras:mob_chunk_slime", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "turtle"}, new String[]{"mysticalagriculture_extras:mob_chunk_turtle", translateEssenceName("2"), translateSeedName("2")}, false/*true = useTags, false = useItem*/);

		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "iron"}, new String[]{"minecraft:iron_ingot", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "nether_quartz"}, new String[]{"minecraft:quartz", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "glowstone"}, new String[]{"minecraft:glowstone", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "redstone"}, new String[]{"minecraft:redstone", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "obsidian"}, new String[]{"minecraft:obsidian", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "prismarine"}, new String[]{"mysticalagriculture:prismarine_agglomeratio", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "zombie"}, new String[]{"mysticalagriculture_extras:mob_chunk_zombie", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "skeleton"}, new String[]{"mysticalagriculture_extras:mob_chunk_skeleton", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "creeper"}, new String[]{"mysticalagriculture_extras:mob_chunk_creeper", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "spider"}, new String[]{"mysticalagriculture_extras:mob_chunk_spider", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "rabbit"}, new String[]{"mysticalagriculture_extras:mob_chunk_rabbit", translateEssenceName("3"), translateSeedName("3")}, false/*true = useTags, false = useItem*/);
		
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "gold"}, new String[]{"minecraft:gold_ingot", translateEssenceName("4"), translateSeedName("4")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "lapis_lazuli"}, new String[]{"minecraft:lapis_lazuli", translateEssenceName("4"), translateSeedName("4")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "end"}, new String[]{"mysticalagriculture:end_agglomeratio", translateEssenceName("4"), translateSeedName("4")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "experience"}, new String[]{"mysticalagriculture_extras:mob_chunk_exp", translateEssenceName("4"), translateSeedName("4")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "blaze"}, new String[]{"mysticalagriculture_extras:mob_chunk_blaze", translateEssenceName("4"), translateSeedName("4")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "ghast"}, new String[]{"mysticalagriculture_extras:mob_chunk_ghast", translateEssenceName("4"), translateSeedName("4")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "enderman"}, new String[]{"mysticalagriculture_extras:mob_chunk_enderman", translateEssenceName("4"), translateSeedName("4")}, false/*true = useTags, false = useItem*/);

		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "diamond"}, new String[]{"minecraft:diamond", translateEssenceName("5"), translateSeedName("5")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "emerald"}, new String[]{"minecraft:emerald", translateEssenceName("5"), translateSeedName("5")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "netherite"}, new String[]{"minecraft:netherite_ingot", translateEssenceName("5"), translateSeedName("5")}, false/*true = useTags, false = useItem*/);
		addSeedRecipe(new String[]{Mods.MysticalAgriculture, "wither_skeleton"}, new String[]{"mysticalagriculture_extras:mob_chunk_wither_skeleton", translateEssenceName("5"), translateSeedName("5")}, false/*true = useTags, false = useItem*/);
	}

	public static String translateEssenceName(String input){
		if(input=="1"){
			return "mysticalagriculture:inferium_essence";
		}else if(input=="2"){
			return "mysticalagriculture:prudentium_essence";
		}else if(input=="3"){
			return "mysticalagriculture:tertium_essence";
		}else if(input=="4"){
			return "mysticalagriculture:imperium_essence";
		}else if(input=="5"){
			return "mysticalagriculture:supremium_essence";
		}else{
			return null;
		}
	}

	public static String translateSeedName(String input){
		if(input=="1"){
			return "mysticalagriculture_extras:inferium_crafting_seeds";
		}else if(input=="2"){
			return "mysticalagriculture_extras:prudentium_crafting_seeds";
		}else if(input=="3"){
			return "mysticalagriculture_extras:tertium_crafting_seeds";
		}else if(input=="4"){
			return "mysticalagriculture_extras:imperium_crafting_seeds";
		}else if(input=="5"){
			return "mysticalagriculture_extras:supremium_crafting_seeds";
		}else{
			return null;
		}
	}

	public static JIngredient input(String item, Boolean useTag){
		if(useTag==false){
			return JIngredient.ingredient().item(item);
		}else{
			return JIngredient.ingredient().tag(item);
		}
	}

	public static JResult output(String itemModID, String itemName){
		return JResult.result(itemModID + ":" + itemName);
	}
	public static JResult output(String itemModID, String itemName, int outputAmount){
		return JResult.stackedResult(itemModID + ":" + itemName, outputAmount);
	}

	public static JPattern pattern(String[] pattern){
		if(pattern.length==1){
			return JPattern.pattern(pattern[0]);
		}else if(pattern.length==2){
			return JPattern.pattern(pattern[0], pattern[1]);
		}else {
			return JPattern.pattern(pattern[0], pattern[1], pattern[2]);
		}
	}

	public static void addSeedRecipe(String[] output, String[] input, Boolean useTag){
		assets.addRecipe(new Identifier("arrp", output[1]), JRecipe.shaped(pattern(seedPattern), JKeys.keys()
		.key("I", input(input[0], useTag))
		.key("E", input(input[1], false))
		.key("S", input(input[2], false))
		, output(output[0], output[1])));
	}
}