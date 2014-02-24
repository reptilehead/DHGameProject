package engine.gfx;

import java.io.IOException;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class DHSpriteSheet extends SpriteSheet{

	private int tileSize;
	
	public int getTileSize() {
		return tileSize;
	}
	//Constructor/////////////
	//////////////////////////
	public DHSpriteSheet(Image image, int tw, int th) {
		super(image, tw, th);
		tileSize = tw;
	}
	public DHSpriteSheet(Image image, int tw, int th, int spacing) {
		super(image, tw, th, spacing);
		tileSize = tw;
	}
	public DHSpriteSheet(Image image, int tw, int th, int spacing, int margin) {
		super(image, tw, th, spacing, margin);
		tileSize = tw;
	}
	public DHSpriteSheet(java.lang.String name, java.io.InputStream ref, int tw, int th) throws SlickException {
		super(name, ref, tw, th);
		tileSize = tw;
	}
	public DHSpriteSheet(java.lang.String ref, int tw, int th) throws SlickException  {
		super(ref, tw, th);
		tileSize = tw;
	}
	public DHSpriteSheet(java.lang.String ref, int tw, int th, Color col) throws SlickException {
		super(ref, tw, th, col);
		tileSize = tw;
	}
	public DHSpriteSheet(java.lang.String ref, int tw, int th, Color col, int spacing) throws SlickException {
		super(ref, tw, th, col, spacing);
		tileSize = tw;
	}
	public DHSpriteSheet(java.lang.String ref, int tw, int th, int spacing) throws SlickException {
		super(ref, tw, th, spacing);
		tileSize = tw;
	}
	public DHSpriteSheet(java.net.URL ref, int tw, int th) throws SlickException, IOException {
		super(ref, tw, th);
		tileSize = tw;
	}
	/////////////////////////
	public int getXTileID(int i){
		return i % this.getHorizontalCount();
	}
	public int getYTileID(int i){
		return i/ this.getHorizontalCount();
	}
}
