package engine.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import engine.gfx.DHSpriteSheet;
import engine.tools.DornSpecials.Function;

public class Player {
	private int xPosition;
	private int yPosition;
	private int xOffset;
	private int yOffset;
	private int direction;
	
	private int WIDTH;
	private int HEIGHT;
	
	private DHSpriteSheet spriteSheet;
	private String spriteSheetPath;
	
	private int playerScale;
	private Function function;
	private int screenHeight;
	
	public Player(int screenWidth, int screenHeight, int globalScale) throws SlickException{
		playerScale = globalScale + 1;
		this.screenHeight = screenHeight;
		
		init(screenWidth, screenHeight);
	}
	
	public void init(int screenWidth, int screenHeight) throws SlickException{
		WIDTH = 32;
		HEIGHT = 32;
		
		spriteSheetPath = "playerSheet.png";
		spriteSheet = new DHSpriteSheet(spriteSheetPath, WIDTH, HEIGHT);
		
		xPosition = (screenWidth - spriteSheet.getTileSize() * playerScale )/2;
		yPosition = (screenHeight - spriteSheet.getTileSize() * playerScale)/2;

		xOffset = 0;
		yOffset = 0;
		
		function = new Function(1, (float)(screenHeight)/screenWidth);
	}
	
	public void update(GameContainer gc){
		input(gc);
	}
	
	public void render(){
		if(direction == 0)
			spriteSheet.getSprite(1, 0).draw(xPosition, yPosition, playerScale);
		else if(direction == 1)
			spriteSheet.getSprite(0, 0).draw(xPosition, yPosition, playerScale);
		else if(direction == 2)
			spriteSheet.getSprite(2, 0).getFlippedCopy(true, false).draw(xPosition, yPosition, playerScale);
		else if(direction == 3)
			spriteSheet.getSprite(2, 0).draw(xPosition, yPosition, playerScale);
	}
	
	public void input(GameContainer gc){
		if(gc.getInput().isKeyDown(17)){
			yOffset += 3;
		}
		if(gc.getInput().isKeyDown(31)){
			yOffset -= 3;
		}
		if(gc.getInput().isKeyDown(32)){
			xOffset -= 3;
		}
		if(gc.getInput().isKeyDown(30)){
			xOffset += 3;
		}
		
		if (Function.getY(gc.getInput().getMouseX(), function.a) < gc.getInput().getMouseY()
			    && (screenHeight - Function.getY(gc.getInput().getMouseX(), function.a)) < gc.getInput().getMouseY() ){
				direction = 1;	
			}
		else if (Function.getY(gc.getInput().getMouseX(), function.a) > gc.getInput().getMouseY()
			    && (screenHeight - Function.getY(gc.getInput().getMouseX(), function.a)) > gc.getInput().getMouseY() ){
				direction = 0;	
			}
		else if (Function.getY(gc.getInput().getMouseX(), function.a) > gc.getInput().getMouseY()
			    && (screenHeight - Function.getY(gc.getInput().getMouseX(), function.a)) < gc.getInput().getMouseY() ){
				direction = 3;	
			}
		else if (Function.getY(gc.getInput().getMouseX(), function.a) < gc.getInput().getMouseY()
				&& (screenHeight - Function.getY(gc.getInput().getMouseX(), function.a)) > gc.getInput().getMouseY() ){
				direction = 2;
		}
		
	}
	public void Animation(){
		
	}
	
	
	public int getxOffset() {
		return xOffset;
	}

	public int getyOffset() {
		return yOffset;
	}

	public int getxPosition() {
		return xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}
	
}
