
public class WrapperDemo {
	public static void main(String []args) {
		int x = 10;
		Integer y = 10;
		Integer z = 10;
		System.out.println(y==z);
		Integer a = 200;
		Integer b = 200;
		System.out.println(a==b);
		Float w1 = 2.23f;
		Long w2 = 323242342l;
		Character w3 = 'A';
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(w3.charValue());
		
		System.out.println(y);
		System.out.println(y.toString());
		System.out.println(y.floatValue());
		System.out.println(y.longValue());
		System.out.println(y.byteValue());
		System.out.println(Integer.parseInt("900"));
		
		
	}
}
