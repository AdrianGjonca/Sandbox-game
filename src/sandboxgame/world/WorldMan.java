package sandboxgame.world;

import sandboxgame.game.GameMan;
import sandboxgame.game.GameObject;
import sandboxgame.game.Position;

public class WorldMan {
	public static void frame(World world) {
		GameObject RECYCtile = new GameObject(new Position(0,0), new float[]{8f,8f});
		
		final int sizeX = world.map.length;
		final int sizeY = world.map[0].length;
		int cx = (int)GameMan.camera.position.get()[0];
		int cy = (int)GameMan.camera.position.get()[1];
		for(int x = cx-10; x<cx+10; x++) {
			for(int y = cy-10; y<cy+10; y++) {
				RECYCtile.position.set(x, y);
				GameMan.pass_obj(RECYCtile, world.getTile(x-cx, y-cy).tile);
			}
		}
	}
}
