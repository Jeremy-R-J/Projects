package com.work.jeremy.classes;

public class Wizard extends Human {
	private int magic;
	public Wizard() {
		this.health=50;
		this.intelligence=8;
	
	}
	public void readStats() {
		System.out.println("I am a wizard!"+"  With a magic rating of:"+this.getMagic());
		super.readStats();
	}
	public Wizard(String n, int s, int l, int i, int h, int m) {
		super(n, s, l, i, h);
		this.setMagic(m);
	}
	public void castFireball(Human target) {
		target.health-=(this.intelligence*3);
		System.out.println("Spell was cast most likely a fireball!");
	}
	public void castHeal(Human target) {
		target.health+=(this.intelligence*2);
		System.out.println("Spell was cast to heal your homie!");
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}
	

}
