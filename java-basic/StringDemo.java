
public class StringDemo {
	public static void main(String []args) {
		String name = "Anas"; 	//create one object in string pool
		String name2 = "Anas";	//no object creation
		String name3 = new String("Anas");	// new one object outside the string pool
		String name4 = new String("Raza");	// create 2 object one in pool and one outside
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name.equals(name2));
	}
}