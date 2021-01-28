package sandboxgame.render;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class DrawMan {
	
	static Graphics2D g;
	static float[] camera = {0f, 0f};
	
	public static void init(Graphics2D g) {
		DrawMan.g = g;
	}
	
	public static void camera(float[] camera) {
		DrawMan.camera = camera;
	}
	
	public static void draw(Drawable figure) {
		final float[] location = figure.getLocation();
		final BufferedImage sprite = figure.getSprite();
		
		final int[] screenPos = PositionControl.compute(location, camera);
		
		g.drawImage(sprite, screenPos[0], screenPos[1], null);
	}
	
	
}
