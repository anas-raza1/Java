
public class StringDemo2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Hello! ");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("How are you!");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("I'm fine! well all good! what about you?");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
