package de.l_infotech.adventure.model;

import java.util.List;

public class Hero {

	private String name;
	private int health;
	private int attack;
	
	public Hero(String name, int health, int attack){
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public int getAttack(){
		return this.attack;
	}

	public void sufferDamage(int damage){
		this.health -= damage;
	}
	
	public void modifyAttack (int modify){
		this.attack += modify;
	}
}
