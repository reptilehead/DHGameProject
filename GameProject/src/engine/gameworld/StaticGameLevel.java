package engine.gameworld;

import org.newdawn.slick.SlickException;

import engine.gfx.DHSpriteSheet;

public class StaticGameLevel extends BaseLevel {

	public StaticGameLevel(DHSpriteSheet spriteSheet, int WIDTH, int HEIGHT, int scale, int[][] LEVELLAYOUT) throws SlickException {
		super(spriteSheet, WIDTH, HEIGHT, scale, LEVELLAYOUT);
	}



}
