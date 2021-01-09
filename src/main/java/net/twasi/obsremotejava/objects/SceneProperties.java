package net.twasi.obsremotejava.objects;

import net.twasi.obsremotejava.requests.GetSceneItemProperties.GetSceneItemPropertiesResponse;

public class SceneProperties {
	
	public SceneProperties(GetSceneItemPropertiesResponse res) {
		this(res.getName(), res.getPosition(), res.getRotation(), res.getScale(), res.getCrop(), res.isVisible(), res.getBounds());
	}
	
	public SceneProperties(
		String name,
		Position position,
		double rotation,
		Scale scale,
		Crop crop,
		boolean visible,
		Bounds bounds) {
		super();
		this.name = name;
		this.position = position;
		this.rotation = rotation;
		this.scale = scale;
		this.crop = crop;
		this.visible = visible;
		this.bounds = bounds;
	}

	private String name;
	private Position position;
	private double rotation;
	private Scale scale;
	private Crop crop;
	private boolean visible;
	private Bounds bounds;
	
	public static class Position {

		private double x;
		private double y;
		private int alignement;

		public Position() {
			this(0, 0, 0);
		}

		public Position(int x, int y, int alignement) {
			this.x = x;
			this.y = y;
			this.alignement = alignement;
		}

		public double getX() {
			return this.x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public double getY() {
			return this.y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getAlignement() {
			return this.alignement;
		}

		public void setAlignement(int alignement) {
			this.alignement = alignement;
		}

		@Override
		public String toString() {
			return "Position [x=" + x + ", y=" + y + ", alignement=" + alignement + "]";
		}

		
		
	}

	public static class Scale {

		private double x;
		private double y;

		public Scale() {
			this(0, 0);
		}

		public Scale(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return this.x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return this.y;
		}

		public void setY(double y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return "Scale [x=" + x + ", y=" + y + "]";
		}
		
		

	}

	public static class Crop {

		private int top;
		private int right;
		private int left;
		private int bottom;

		public Crop() {
			this(0, 0, 0, 0);
		}

		public Crop(int top, int right, int left, int bottom) {
			this.top = top;
			this.right = right;
			this.left = left;
			this.bottom = bottom;
		}

		public int getTop() {
			return this.top;
		}

		public void setTop(int top) {
			this.top = top;
		}

		public int getRight() {
			return this.right;
		}

		public void setRight(int right) {
			this.right = right;
		}

		public int getLeft() {
			return this.left;
		}

		public void setLeft(int left) {
			this.left = left;
		}

		public int getBottom() {
			return this.bottom;
		}

		public void setBottom(int bottom) {
			this.bottom = bottom;
		}

		@Override
		public String toString() {
			return "Crop [top=" + top + ", right=" + right + ", left=" + left + ", bottom=" + bottom + "]";
		}
		
		

	}

	public static class Bounds {

		private String type;
		private int alignement;
		private double x;
		private double y;

		public Bounds() {
			this("", 0, 0, 0);
		}

		public Bounds(String type, int alignement, double x, double y) {
			super();
			this.type = type;
			this.alignement = alignement;
			this.x = x;
			this.y = y;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getAlignement() {
			return this.alignement;
		}

		public void setAlignement(int alignement) {
			this.alignement = alignement;
		}

		public double getX() {
			return this.x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return this.y;
		}

		public void setY(double y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return "Bounds [type=" + type + ", alignement=" + alignement + ", x=" + x + ", y=" + y + "]";
		}
		
		

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

	@Override
	public String toString() {
		return "SceneProperties [name=" + name + ", position=" + position + ", rotation=" + rotation + ", scale=" + scale
			+ ", crop=" + crop + ", visible=" + visible + ", bounds=" + bounds + "]";
	}

	
	
	
	
	
}
