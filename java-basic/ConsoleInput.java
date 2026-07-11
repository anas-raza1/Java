
public class ConsoleInput {
	public static void main(String[] args) {
		System.out.println("enter the userid");
		String userid = System.console().readLine();
		System.out.println("enter password");
		char[] pswd = System.console().readPassword();
		System.out.println("userid "+userid);
		System.out.println("password "+ new String(pswd));

	}

}
