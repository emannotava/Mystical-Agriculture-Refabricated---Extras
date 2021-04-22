package com.mememan.mysticalagriculture_extras;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer{
	
	@Override
    public void onInitializeClient() {
		System.out.println("Mystical Agriculture: Refabricated - Extras(Client-Side) has been initialized!");
    }

	public void registerTranslucentRender(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
	}
	public void registerCutOutRender(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
	}
}
