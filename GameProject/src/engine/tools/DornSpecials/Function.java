package engine.tools.DornSpecials;

public class Function {
	private int functionPower;
	
	private float x,y;
	public float a;
	
	public Function(int functionPower, float a){
		this.functionPower = functionPower;
		this.a = a;
	}
	
	public static float getY(float x, float a){
		return x * a;
	}
	public static float getX(float y, float a){
		return y/a;
	}
	
	public static float getA(float x, float y){
		return y/x;
	};
}
