package sandboxgame.game;

import java.awt.image.BufferedImage;

public class GameObject {
	Position position;
	float[] center;
	
	public GameObject(BufferedImage image, Position position, float[] center) {
		this.position = position;
		this.center = center;
	}	
}
