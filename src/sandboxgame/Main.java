package sandboxgame;

import sandboxgame.assets.AssetMan;
import sandboxgame.game.GameMan;
import sandboxgame.game.GameObject;
import sandboxgame.game.Position;
import sandboxgame.world.World;
import sandboxgame.world.WorldMan;

public class Main {

	public static void main(String[] args) {
		AssetMan.init();
		
		FrameMan.init();
		GameObject o = new GameObject(new Position(0,0), new float[] {8,8});
		
		World w = new World(1000);
		GameMan.init(FrameMan.getGraphics(), o);
		while(true) {
			//Game
			o.position.move(1*FrameLog.deltaTime, 100*FrameLog.deltaTime);
			
			//Render
			GameMan.frame();
			GameMan.pass_obj(o, null);
			WorldMan.frame(w);
			FrameMan.frame();
			FrameLog.cap(512);
			FrameLog.next();
			System.out.println(FrameLog.fps());
		}
	}

}
