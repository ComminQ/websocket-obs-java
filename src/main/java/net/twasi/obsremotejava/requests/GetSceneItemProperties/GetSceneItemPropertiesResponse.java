package net.twasi.obsremotejava.requests.GetSceneItemProperties;

import net.twasi.obsremotejava.objects.SceneProperties;
import net.twasi.obsremotejava.objects.SceneProperties.Bounds;
import net.twasi.obsremotejava.objects.SceneProperties.Crop;
import net.twasi.obsremotejava.objects.SceneProperties.Position;
import net.twasi.obsremotejava.objects.SceneProperties.Scale;
import net.twasi.obsremotejava.requests.ResponseBase;

/**
 * Response content Following the protocol references from
 * {@link https://gist.github.com/lee-brown/70e6014a903dfea9e2dfe7e35fc8ab88#scene-items}
 * 
 * @author Fabien CAYRE (Computer)
 *
 * @date 10/11/2020
 */
public class GetSceneItemPropertiesResponse extends ResponseBase {

	private String name;
	private Position position;
	private double rotation;
	private Scale scale;
	private Crop crop;
	private boolean visible;
	private Bounds bounds;

	public SceneProperties asSceneProperties() {
		return new SceneProperties(this);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public double getRotation() {
		return this.rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}

	public Scale getScale() {
		return this.scale;
	}

	public void setScale(Scale scale) {
		this.scale = scale;
	}

	public Crop getCrop() {
		return this.crop;
	}

	public void setCrop(Crop crop) {
		this.crop = crop;
	}

	public boolean isVisible() {
		return this.visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Bounds getBounds() {
		return this.bounds;
	}

	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}

}
