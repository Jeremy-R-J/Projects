package com.work.jeremy.classes;

public class DungeonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		Human myHuman= new Human("Lisa",5,10,13,100);
		System.out.println(myHuman);
		myHuman.readStats();
		
		Human myOtherHuman = new Human("Luke", 2, 9,10,100);
		System.out.println(myOtherHuman);
		myOtherHuman.readStats();
		
		myHuman.attack1(myOtherHuman);
		
		Wizard myWizard = new Wizard("Gandalf the White",8,18,20,150,20);
		myWizard.readStats();
		
		Samurai mySamurai = new Samurai("Leonardo",15,13,15,100);
		mySamurai.readStats();
	}
}
