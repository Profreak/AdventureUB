package de.l_infotech.adventure.model;

import java.util.Random;

public enum Enemy {

	Mage(getRand(10, 20), getRand(10, 20), "Grand Magus!"),
	Knight(getRand(10, 20), getRand(10, 20), "Rogue Knight at your service!");

	private int health;
	private int attack;
	private String saying;

	Enemy(int health, int attack, String saying) {
		this.health = health;
		this.attack = attack;
		this.saying = saying;
	}
	
	public int getHealth() {
		return this.health;
	}
	public int getAttack() {
		return this.attack;
	}
	
	public String getSaying() {
		return this.saying;
	}

	public void sufferDamage(int damage){
		this.health -= damage;
	}
	
	public void modifyAttack (int modify){
		this.attack += modify;
	}
	
	public void changeAnswer (String newSaying){
		this.saying = newSaying;
	}
	
	public boolean isDead(){
		if(this.health <= 0){
			return true;
		}
		return false;
	}
	
	private static Random rand = new Random();

	public static int getRand(int min, int max) {
		return rand.nextInt(max - min) + min;
	}
}
