package engine.entities;

import org.newdawn.slick.SpriteSheet;

public abstract class Entity {
	public int xPosition, yPosition;
	protected SpriteSheet entitiyImage;
	
	public abstract void update();
}
