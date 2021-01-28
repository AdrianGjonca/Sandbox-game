package sandboxgame;

import sandboxgame.game.GameMan;
import sandboxgame.game.GameObject;
import sandboxgame.game.Position;

public class Main {

	public static void main(String[] args) {
		FrameMan.init();
		GameObject o = new GameObject(null, new Position(0,0), new float[] {8,8});
		
		GameMan.init(FrameMan.getGraphics(), o);
		while(true) {
			GameMan.frame();
			FrameMan.getGraphics().drawLine(400, 300, 410, 300);
			FrameMan.frame();
			FrameLog.cap(512);
			FrameLog.next();
			System.out.println(FrameLog.fps());
		}
	}

}
