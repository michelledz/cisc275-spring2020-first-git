public class Dog extends Animal {
	
	public Dog (String name1, int legs1) {
		super(name1, legs1);
	}
	
	@Override
	public String toString() {
		return name+legs;
	}
	
}
