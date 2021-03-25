package com.work.jeremy.classes;

public class Samurai extends Human {
	
	private static int numSamurai=0;
	private static int defaultHealth = 200;
	public static int howMany() {
		return Samurai.numSamurai;
	}
	public Samurai() {
		this.health=Samurai.defaultHealth;
		Samurai.numSamurai+=1;
	}

	public Samurai(String n, int s, int l, int i, int h) {
		super(n,s,l,i,h);
	}
	
	public void deathBlow(Human target) {
		target.health=0;
		this.health=(this.health/2);
		System.out.println("Slash is happening if it must!");
		
	}
	public void meditate() {
		
		this.health=(this.health*2);
		System.out.println("THe Samurai is meditating!");
	}


}

