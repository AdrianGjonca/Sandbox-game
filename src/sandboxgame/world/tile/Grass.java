package sandboxgame.world.tile;

import sandboxgame.assets.AssetMan;

public class Grass extends Tile{
	public Grass() {
		create();
	}
	
	@Override
	public void create() {
		this.tile = AssetMan.TILESET.getSubimage(0, 0, 16, 16);
	}

}
