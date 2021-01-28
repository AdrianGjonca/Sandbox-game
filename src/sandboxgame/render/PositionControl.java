package sandboxgame.render;

import sandboxgame.FrameMan;

public class PositionControl {
	
	static final int midx = FrameMan._SCREENX/2;
	static final int midy = FrameMan._SCREENY/2;
			
	protected static int[] compute(float[] pos, float[]cam) {
		pos[0] += midx - cam[0];
		pos[1] = -pos[1] + midy - cam[1];
		return new int[] {(int)pos[0], (int)pos[1]};
	}
}
