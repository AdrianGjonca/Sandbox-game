package sandboxgame.render;

import java.awt.image.BufferedImage;

public class Drawable {
	
	float[] location;
	BufferedImage sprite;
	
	public Drawable(float[] location, BufferedImage sprite) {
		this.location = location;
		this.sprite = sprite;
	}
	
	public float[] getLocation() {
		return location;
	}
	public BufferedImage getSprite() {
		return sprite;
	}
	
}
