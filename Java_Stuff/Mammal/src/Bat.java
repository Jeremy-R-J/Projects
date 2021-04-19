
public class Bat extends Mammal {
	public void fly() {
		batEnergy -=50;
		System.out.println("Bat takes flight, sound 'cacaw'!");
		displayBatEnergy();
	}
	public void eatHumans() {
		batEnergy +=25;
			System.out.println("Bat, ate a tasty human!  I've heard Chianti might go well with it.");
		displayBatEnergy();
	}
	public void attackTown() {
		batEnergy -=100;
		System.out.println("Bats, they're  everywhere.  (town burns in the background)!");
		displayBatEnergy();
	}
}
