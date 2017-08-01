// Created by plusminus on 18:00:24 - 25.09.2008
package org.osmdroid.views.util.constants;

import org.osmdroid.config.Configuration;

/**
 * 
 * This class contains constants used by the map view.
 * 
 * @author Nicolas Gramlich
 * 
 */
public interface MapViewConstants {

	@Deprecated
	public static boolean DEBUGMODE = Configuration.getInstance().isDebugMapView();

	// ===========================================================
	// Final Fields
	// ===========================================================

	public static final int NOT_SET = Integer.MIN_VALUE;

	public static final int ANIMATION_SMOOTHNESS_LOW = 4;
	public static final int ANIMATION_SMOOTHNESS_DEFAULT = 10;
	public static final int ANIMATION_SMOOTHNESS_HIGH = 20;

	public static final int ANIMATION_DURATION_SHORT = 500;
	public static final int ANIMATION_DURATION_DEFAULT = 2500;
	public static final int ANIMATION_DURATION_LONG = 2000;

	/** Minimum Zoom Level */
	public static final int MINIMUM_ZOOMLEVEL = 0;
     public static final int MAXIMUM_ZOOMLEVEL = 23;
}
