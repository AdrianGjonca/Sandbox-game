package sandboxgame.assets;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AssetMan {
	public static BufferedImage TILESET;
	public static void init() {
		try {
			TILESET = ImageIO.read(AssetMan.class.getResource("tileset.png"));
		} catch (IOException e) {
			System.out.println("[YIKES!!!]/ something's gone wrong loading tileset.png");
			System.out.println("          \\ the game will crash if I go on... better leave");
			System.out.println("**----JAVA ERROR LOG----**");
			e.printStackTrace();
			System.exit(0);
		}
	}
}
