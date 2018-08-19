package com.DarwinsNatura.util.handlers;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DarwinsNatura.world.gen.layers.GenLayerGalapagos;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerAddMushroomIsland;
import net.minecraft.world.gen.layer.GenLayerZoom;
import net.minecraftforge.event.terraingen.WorldTypeEvent;

public class TerrainEventHandler {
	private static final Logger LOGGER = LogManager.getLogger(TerrainEventHandler.class);

	 public static void onInitBiomeGens(WorldTypeEvent.InitBiomeGens event) {
		 GenLayer root = event.getNewBiomeGens()[0];
		 insertLayer(root, l -> l instanceof GenLayerZoom, 6, p -> new GenLayerGalapagos(3L, p));

		    }

	 public static void insertLayer(GenLayer root, Predicate<GenLayer> predicate, int index, Function<GenLayer, GenLayer> insert) {
	        insertLayerRecursive(root, predicate, index, insert, 0);
	    }

	    private static void insertLayerRecursive(GenLayer root, Predicate<GenLayer> predicate, int index, Function<GenLayer, GenLayer> insert, int currentIndex) {
	        if (predicate.test(root)) {
	            if (currentIndex++ == index) {
	                insert(root, insert);
	                return;
	            }
	        }

	        Collection<GenLayer> parents = reflectParents(root);
	        for (GenLayer parent : parents) {
	            insertLayerRecursive(parent, predicate, index, insert, currentIndex);
	        }
	    }

	    private static void insert(GenLayer root, Function<GenLayer, GenLayer> insert) {
	        Collection<Field> parentFields = reflectParentFields(root);
	        if (parentFields.isEmpty()) {
	            throw new IllegalArgumentException("cannot insert layer before layer without a parent");
	        }
	        for (Field parentField : parentFields) {
	            try {
	                GenLayer parent = (GenLayer) parentField.get(root);
	                parentField.set(root, insert.apply(parent));
	            } catch (Exception e) {
	                LOGGER.error("failed to insert parent onto field {} on {}", parentField.getName(), root, e);
	            }
	        }
	    }

	    private static Collection<GenLayer> reflectParents(GenLayer layer) {
	        Collection<Field> layerFields = reflectParentFields(layer);

	        if (!layerFields.isEmpty()) {
	            Collection<GenLayer> parents = new ArrayList<>();
	            for (Field field : layerFields) {
	                try {
	                    GenLayer value = (GenLayer) field.get(layer);
	                    if (value != null) {
	                        parents.add(value);
	                    }
	                } catch (Exception e) {
	                    LOGGER.error("failed to access field {} on {}", field.getName(), layer, e);
	                }
	            }
	            return parents;
	        }

	        return Collections.emptyList();
	    }

	    private static Collection<Field> reflectParentFields(GenLayer layer) {
	        Collection<Field> layerFields = Arrays.stream(layer.getClass().getFields())
	                .filter(f -> GenLayer.class.isAssignableFrom(f.getType()))
	                .collect(Collectors.toList());
	        layerFields.forEach(f -> f.setAccessible(true));
	        return layerFields;
	    }
}
