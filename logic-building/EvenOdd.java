
public class EvenOdd {

	public static void main(String[] args) {
		int number = 10;

		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		if ((number ^ 1) == number + 1) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		if ((number & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		if ((number | 1) > number) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
