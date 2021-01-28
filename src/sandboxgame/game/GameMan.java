package sandboxgame.game;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import sandboxgame.FrameMan;
import sandboxgame.render.DrawMan;
import sandboxgame.render.Drawable;

public class GameMan {
	
	static Graphics2D g;
	public static GameObject camera;
	public static void init(Graphics2D g, GameObject camera) {
		GameMan.g = g;
		GameMan.camera = camera;
		
		DrawMan.init(FrameMan.getGraphics());
	}
	
	public static void frame() {
		BufferedImage img = new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
		img.setRGB(0, 0, 0xFFFFFF);
		img.setRGB(1, 1, 0xFFFFFF);
		img.setRGB(2, 2, 0xFFFFFF);
		
		final float[] center = {camera.position.get()[0] + camera.center[0], camera.position.get()[1] + camera.center[1]};
		DrawMan.camera(center);
		DrawMan.draw(new Drawable(camera.position.get_pxl(), img));
	}
	
	public static void pass_obj(GameObject object, BufferedImage todraw) {
		DrawMan.draw(new Drawable(object.position.get_pxl(), todraw));
	}
}
