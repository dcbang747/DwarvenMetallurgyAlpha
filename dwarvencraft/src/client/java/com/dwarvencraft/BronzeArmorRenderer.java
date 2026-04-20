package com.dwarvencraft;

import com.dwarvencraft.item.BronzeArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BronzeArmorRenderer extends GeoArmorRenderer<BronzeArmorItem> {
    public BronzeArmorRenderer(String piece) {
        super(new BronzeArmorModel(piece));
    }

    private static class BronzeArmorModel extends GeoModel<BronzeArmorItem> {
        private final Identifier modelPath;
        private final Identifier texturePath;

        BronzeArmorModel(String piece) {
            this.modelPath = Identifier.of(DwarvenCraft.MOD_ID, "geo/bronze_" + piece + ".geo.json");
            this.texturePath = Identifier.of(DwarvenCraft.MOD_ID, "textures/item/armor/bronze_" + piece + ".png");
        }

        @Override
        public Identifier getModelResource(BronzeArmorItem animatable) {
            return modelPath;
        }

        @Override
        public Identifier getTextureResource(BronzeArmorItem animatable) {
            return texturePath;
        }

        @Override
        public Identifier getAnimationResource(BronzeArmorItem animatable) {
            return Identifier.of(DwarvenCraft.MOD_ID, "animations/empty.animation.json");
        }
    }
}
