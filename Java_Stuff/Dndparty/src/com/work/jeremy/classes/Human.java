package com.work.jeremy.classes;

public class Human {
	//attributes
	  protected int strength = 3;
	    protected int stealth = 3;
	    protected int intelligence = 3;
	    protected int health = 100;
	    public void attack1(Human target) {
	    	System.out.println(this.getName() + " attacked " + target.getName());
	        target.health -= this.strength;	
	    }
private String name;


public Human() {
	this.setName("");
	this.setStrength(3);
	this.setStealth(3);
	this.setIntelligence(3);
	this.setHealth(100);
	}

public Human (String n, int s, int l, int i, int h) {

	this.setName(n);
	this.setStrength(s);
	this.setStealth(l);
	this.setIntelligence(i);
	this.setHealth(h);
	}
public void readStats() {
	System.out.println("HI my name is "+ this.getName() +" and I am this strong " +this.getStrength());
	System.out.println("This is how sneaky I am " +this.getStealth()+" and I am this smart " +this.getIntelligence());
	System.out.println("This is my current Health "+this.getHealth());
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStrength() {
	return strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}
public int getIntelligence() {
	return intelligence;
}
public void setIntelligence(int intelligence) {
	this.intelligence = intelligence;
}
public int getStealth() {
	return stealth;
}
public void setStealth(int stealth) {
	this.stealth = stealth;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}



}




	
	




