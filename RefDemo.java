
public class RefDemo {
	public static void main(String []args) {
		String name = "Anas";
		String name2 = name;
		StringBuffer sb = new StringBuffer("Anas");
		StringBuffer sb2 = sb;
		System.out.println(sb);
		sb2.append("Raza");
		System.out.println(sb);
		System.out.println(sb2);
	}
}
