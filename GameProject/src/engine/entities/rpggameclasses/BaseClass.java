package engine.entities.rpggameclasses;

import engine.entities.LivingEntity;

public abstract class BaseClass extends LivingEntity{
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
	
	public void calculateValues(){
		
	}
}
