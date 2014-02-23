package engine.entities;

public abstract class LivingEntity extends Entity{
	
	protected String name;

	protected int Armor;
	protected int attackDamage;
	protected int spellPower;
	
	protected int constitution;
	protected int strength;
	protected int magic;
	protected int willpower;
	protected int dexterity;
	
	protected int health;
	protected int physicalResilince;
	protected int magicalResilince;
	protected int healthRegen;
	protected int manaRegen;
	
	protected float attackSpeedBonus;
	protected int critChance;
	
	protected float walkingSpeed;
	
	public LivingEntity(){

	}
	
	public void calculateValues(){
	}
	
}
