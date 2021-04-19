
public class  Gorilla extends Mammal {

	public void throwSomething() {
		energyLev -=5;
		System.out.println("Gorilla, threw some poop!");
		displayEnergy();
	}
	public void eatBannana() {
		energyLev +=10;
			System.out.println("Gorilla, took down a bundle of bannanas!");
		displayEnergy();
	}
	public void climb() {
		energyLev +=10;
		System.out.println("Gorilla, scalling a building again!");
		displayEnergy();
	}
}
