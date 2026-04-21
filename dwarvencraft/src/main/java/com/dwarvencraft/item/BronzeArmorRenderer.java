package com.dwarvencraft.item;

import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BronzeArmorRenderer extends GeoArmorRenderer<BronzeArmorItem, BipedEntityRenderState> {
    public BronzeArmorRenderer(BronzeArmorItem armorItem) {
        super(armorItem);
    }
}
