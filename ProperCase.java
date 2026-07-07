
public class ProperCase {
	public static void main(String []args) {
		String s = "anAs rAzA";
		String[] list = s.split(" ");
		String finalName = "";
		for(String name : list) {
			char singleChar = name.charAt(0);
			String temp = String.valueOf(singleChar).toUpperCase() + name.substring(1).toLowerCase();
			finalName += temp + " ";
		}
		System.out.println(finalName);
	}
}
