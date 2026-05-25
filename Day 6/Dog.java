

public class Dog {
	// every class have variables for information
	public String breed = "German Shepard";
	public int height = 20;
	public int weight = 35;
	//every class must have method
	public static void main(String[] args) {
		// creation of object
		Dog d = new Dog();
		System.out.println(d.breed);
		System.out.println(d.height  + " inches");
		System.out.println(d.weight + " Kg");
	}
}
