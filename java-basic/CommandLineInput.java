
public class CommandLineInput {
	public static void main(String[] args) {
		
//		String firstName = args[0];
//		String lastName = args[1];
//		System.out.println(firstName + lastName);
		
//		int firstNum = Integer.parseInt(args[0]);
//		int secondNum = Integer.parseInt(args[1]);
//		int result = firstNum + secondNum;
//		System.out.println(result);
		
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}
}
