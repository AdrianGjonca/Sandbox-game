package sandboxgame.game;

public class Position {
	float x;
	float y;
	
	public Position(float x, float y) {
		this.set(x, y);
	}
	
	public void set(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float[] get() {
		return new float[] {x , y};
	}
	
	public float[] get_pxl() {
		return new float[] {x*16 , y*16};
	}
	
	public void move(float x, float y) {
		this.x += x;
		this.y += y;
	}
}
