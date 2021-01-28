package sandboxgame;

public class FrameLog {
	static long lastFrame = System.nanoTime();
	static float deltaTime = 0;
	
	public static void next() {
		deltaTime = (System.nanoTime() - lastFrame) / 1000000000f;
		lastFrame = System.nanoTime();
	}
	
	public static float deltaTime() {
		return deltaTime;
	}
	
	public static float fps() {
		return 1f/deltaTime;
	}
	
	public static void cap(int fps) {
	    float _deltaTime = 0;
		while(1f/_deltaTime > fps) {
			_deltaTime = (System.nanoTime() - lastFrame) / 1000000000f;
		}
	}
}
