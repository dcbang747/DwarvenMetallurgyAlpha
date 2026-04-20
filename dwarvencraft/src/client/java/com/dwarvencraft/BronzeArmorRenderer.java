package com.dwarvencraft;

import com.dwarvencraft.item.BronzeArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

@SuppressWarnings({"rawtypes", "unchecked"})
public class BronzeArmorRenderer extends GeoArmorRenderer {
    public BronzeArmorRenderer() {
        super(new BronzeArmorModel());
    }

    private static class BronzeArmorModel extends GeoModel<BronzeArmorItem> {
        @Override
        public Identifier getModelResource(GeoRenderState renderState) {
            return Identifier.of(DwarvenCraft.MOD_ID, "bronze_" + pieceName(renderState));
        }

        @Override
        public Identifier getTextureResource(GeoRenderState renderState) {
            return Identifier.of(DwarvenCraft.MOD_ID, "textures/item/armor/bronze_" + pieceName(renderState) + ".png");
        }

        @Override
        public Identifier getAnimationResource(BronzeArmorItem animatable) {
            return Identifier.of(DwarvenCraft.MOD_ID, "empty");
        }

        private static String pieceName(GeoRenderState renderState) {
            EquipmentSlot slot = renderState.getGeckolibData(DataTickets.EQUIPMENT_SLOT);
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
}
