package sandboxgame;

import java.awt.image.BufferedImage;

import sandboxgame.render.DrawMan;
import sandboxgame.render.Drawable;

public class Main {

	public static void main(String[] args) {
		BufferedImage img = new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
		img.setRGB(0, 0, 0xFFFFFF);
		img.setRGB(1, 1, 0xFFFFFF);
		img.setRGB(2, 2, 0xFFFFFF);
		
		Drawable obj = new Drawable(new float[] {0,0},img);
		
		FrameMan.init();
		DrawMan.init(FrameMan.getGraphics());
		while(true) {
			DrawMan.draw(obj);
			FrameMan.frame();
			FrameLog.cap(512);
			FrameLog.next();
			System.out.println(FrameLog.fps());
		}
	}

}
