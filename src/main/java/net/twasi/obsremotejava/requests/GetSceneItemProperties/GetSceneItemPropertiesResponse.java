package net.twasi.obsremotejava.requests.GetSceneItemProperties;

import net.twasi.obsremotejava.requests.ResponseBase;

/**
 * Response content
 * Following the protocol references from {@link https://gist.github.com/lee-brown/70e6014a903dfea9e2dfe7e35fc8ab88#scene-items}
 * @author Fabien CAYRE (Computer)
 *
 * @date 10/11/2020
 */
public class GetSceneItemPropertiesResponse extends ResponseBase{

	private String name;
	private Position position;
	private double rotation;
	private Scale scale;
	private Crop crop;
	private boolean visible;
	private Bounds bounds;
	
	public static class Position{
		
		private int x;
		private int y;
		private int alignement;
		
	}
	
	public static class Scale {
		
		private double x;
		private double y;
		
	}
	
	public static class Crop{

		private int top;
		private int right;
		private int left;
		private int bottom;
		
	}
	
	public static class Bounds{
		
		private String type;
		private int alignement;
		private double x;
		private double y;
		
	}
	
}
