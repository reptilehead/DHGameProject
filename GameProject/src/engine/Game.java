package engine;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame
{
	private static final String GAMETITLE = "Darkest Hour - Engine";
	private static final int WIDTH   = 640;
    private static final int HEIGHT  = 480;
    private static final int FPS     = 60;
    private static final double VERSION = 0.1;
    
	public Game(String gamename)
	{
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		g.drawString("Howdy!", 50, 50);
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