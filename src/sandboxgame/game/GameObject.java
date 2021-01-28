package sandboxgame.game;

import java.awt.image.BufferedImage;

public class GameObject {
	public Position position;
	public float[] center;
	
	public GameObject(Position position, float[] center) {
		this.position = position;
		this.center = center;
	}	
}
