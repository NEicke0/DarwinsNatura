package com.DarwinsNatura.common.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler {
	
	private static int size=0;
	
	public static SoundEvent GALAPAGOS_PENGUIN_LIVING; 
	public static SoundEvent GALAPAGOS_HAWK_LIVING; 
	public static SoundEvent FLIGHTLESS_CORMORANT_LIVING;
	public static SoundEvent GALAPAGOS_BEACH_AMBIENT;
	
    public static void registerSounds() {
		
		size=SoundEvent.REGISTRY.getKeys().size();
		
		GALAPAGOS_PENGUIN_LIVING = registerSound("entity.galapagos_penguin_living");
		GALAPAGOS_HAWK_LIVING = registerSound("entity.galapagos_hawk_living");
		FLIGHTLESS_CORMORANT_LIVING = registerSound("entity.flightless_cormorant_living");
		GALAPAGOS_BEACH_AMBIENT = registerSound("entity.galapagos_beach_ambient");
    }	
	
	private static SoundEvent registerSound(String s) { ResourceLocation l = new ResourceLocation("darwin:" + s);
	    SoundEvent event = new SoundEvent(l);
	    event.setRegistryName(s);
	    ForgeRegistries.SOUND_EVENTS.register(event);
	    return event;
	}
}
