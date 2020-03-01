public class Animal {

	String name;
	int legs;
	
	public Animal(String name1, int legs1) {
		name = name1;
		legs = legs1;
	}
	
	@Override
	public String toString() {
		return name+legs;
	}
	
	public int getLegs() {
		return this.legs;
	}
	
}
