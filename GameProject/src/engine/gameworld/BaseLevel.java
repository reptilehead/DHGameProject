package engine.gameworld;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import engine.gfx.DHSpriteSheet;

public abstract class BaseLevel {
	protected int orderID;
	protected String name;
	protected int scale;
	protected DHSpriteSheet spriteSheet;
	
	protected final int WIDTH;
	protected final int HEIGHT;
	protected final int[][] LEVELLAYOUT; 
	
	public BaseLevel(DHSpriteSheet spriteSheet, int WIDTH, int HEIGHT, int scale, int[][] LEVELLAYOUT) throws SlickException{
		this.spriteSheet = spriteSheet;
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		this.scale = scale;
		this.LEVELLAYOUT = LEVELLAYOUT;
	}
	
	public void render(int xOffset, int yOffset){
		for( int y = 0; y < HEIGHT; y++){
			for( int x = 0; x < WIDTH; x++){
					spriteSheet.getSprite(spriteSheet.getXTileID(LEVELLAYOUT[x][y]), spriteSheet.getYTileID(LEVELLAYOUT[x][y]))
					.draw(x * spriteSheet.getTileSize() + xOffset, y * spriteSheet.getTileSize() + yOffset, scale);
			}
		}
	}
}
