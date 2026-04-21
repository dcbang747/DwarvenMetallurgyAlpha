package com.dwarvencraft;

import com.dwarvencraft.item.BronzeArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

@SuppressWarnings({"rawtypes", "unchecked"})
public class BronzeArmorRenderer extends GeoArmorRenderer {
    public BronzeArmorRenderer(EquipmentSlot slot) {
        super(new BronzeArmorModel(pieceName(slot)));
    }

    private static class BronzeArmorModel extends GeoModel<BronzeArmorItem> {
        private final String pieceName;

        private BronzeArmorModel(String pieceName) {
            this.pieceName = pieceName;
        }

        @Override
        public Identifier getModelResource(GeoRenderState renderState) {
            return Identifier.of(DwarvenCraft.MOD_ID, "bronze_" + pieceName);
        }

        @Override
        public Identifier getTextureResource(GeoRenderState renderState) {
            return Identifier.of(DwarvenCraft.MOD_ID, "textures/item/armor/bronze_" + pieceName + ".png");
        }

        @Override
        public Identifier getAnimationResource(BronzeArmorItem animatable) {
            return Identifier.of(DwarvenCraft.MOD_ID, "empty");
        }
    }

    private static String pieceName(EquipmentSlot slot) {
        if (slot == null) return "helmet";
        return switch (slot) {
            case HEAD -> "helmet";
            case CHEST -> "chestplate";
            case LEGS -> "leggings";
            case FEET -> "boots";
            default -> "helmet";
        };
    }
}
