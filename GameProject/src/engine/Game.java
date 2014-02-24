package engine;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import engine.entities.Player;
import engine.gameworld.BaseLevel;
import engine.gfx.DHSpriteSheet;
import engine.tools.DornSpecials.Function;

public class Game extends BasicGame
{
	private static final String GAMETITLE = "Darkest Hour - Engine";
	private static final int WIDTH   = 640;
    private static final int HEIGHT  = 480;
    private static final int FPS     = 60;
    private static final double VERSION = 0.1;
    
    private static int scale = 1;
    
    public BaseLevel baseLevel;
    public DHSpriteSheet spriteSheet;
    public int[][] LevelLayout;
    
    public Player player;
    
	public Game(String gamename){
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		player = new Player(WIDTH, HEIGHT, scale);
		
		spriteSheet = new DHSpriteSheet("spriteSheet.png", 32, 32);
		LevelLayout = new int[50][50];
		for( int y = 0; y < 50; y++)
			for( int x = 0; x < 50; x++)
				LevelLayout[x][y] = 0;
			
		baseLevel =  new BaseLevel(spriteSheet, 50, 50, scale, LevelLayout){};
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		player.update(gc);
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		baseLevel.render(player.getxOffset(), player.getyOffset());
		player.render();
		
		g.drawString("X: " + String.valueOf(gc.getInput().getMouseX()), 20, 30);
		g.drawString("Y: " + String.valueOf(gc.getInput().getMouseY()), 100, 30);
	}

	public static void main(String[] args)
	{
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Game(GAMETITLE+" V."+VERSION));
			appgc.setDisplayMode(WIDTH, HEIGHT, false);
			appgc.setTargetFrameRate(FPS);
			appgc.setShowFPS(true);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}