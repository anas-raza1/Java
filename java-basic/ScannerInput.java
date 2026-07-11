import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name ");
		String name = scanner.nextLine();
		System.out.println("ID ");
		int id = scanner.nextInt();
		System.out.println("city ");
		String city = scanner.next();
		System.out.println("name is "+name);
		System.out.println("Id is "+id);
		System.out.println("city is "+city);
		
		//input after integer need scanner.nextLine()
		System.out.println("ID ");
		int id2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("name ");
		String name2 = scanner.nextLine();
		System.out.println("name is "+name2);
		System.out.println("Id is "+id2);
		
		// entering number with space 1 2 3 4 5
		System.out.println("enter the five numbers :");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		System.out.println("five numbers are : "+ num1 +" "+ num2+" " + num3+" " + num4+" " + num5);
		scanner.close();
	}
}
