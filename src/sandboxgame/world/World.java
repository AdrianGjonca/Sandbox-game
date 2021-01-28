package sandboxgame.world;

import sandboxgame.world.tile.Grass;
import sandboxgame.world.tile.Tile;

public class World {
	Tile[][] map;
	int size;
	
	public World(int size) {
		this.size = size;
		map = new Tile[size][size];
		for(int x = 0; x<size; x++) {
			for(int y = 0; y<size; y++) {
				map[x][y] = new Grass();
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		return map[x+size/2][y+size/2];
	}
	
	
}
