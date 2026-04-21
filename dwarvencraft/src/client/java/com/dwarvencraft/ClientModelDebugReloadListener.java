package com.dwarvencraft;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Optional;

public final class ClientModelDebugReloadListener implements SimpleSynchronousResourceReloadListener {
    private static final Identifier LISTENER_ID = Identifier.of(DwarvenCraft.MOD_ID, "model_source_debug");
    private static final List<String> BRONZE_ARMOR_MODEL_PATHS = List.of(
            "geckolib/models/bronze_helmet.geo.json",
            "geckolib/models/bronze_chestplate.geo.json",
            "geckolib/models/bronze_leggings.geo.json",
            "geckolib/models/bronze_boots.geo.json"
    );

    public static void register() {
        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new ClientModelDebugReloadListener());
    }

    @Override
    public Identifier getFabricId() {
        return LISTENER_ID;
    }

    @Override
    public void reload(ResourceManager manager) {
        for (String modelPath : BRONZE_ARMOR_MODEL_PATHS) {
            Identifier modelIdentifier = Identifier.of(DwarvenCraft.MOD_ID, modelPath);
            Optional<Resource> resource = manager.getResource(modelIdentifier);

            if (resource.isPresent()) {
                DwarvenCraft.LOGGER.info("Loaded armor model {} from pack {}", modelIdentifier, resource.get().getPackId());
            } else {
                DwarvenCraft.LOGGER.warn("Armor model {} is missing. Check src/client/resources/assets/{}/{}", modelIdentifier, DwarvenCraft.MOD_ID, modelPath);
            }
        }
    }
}
