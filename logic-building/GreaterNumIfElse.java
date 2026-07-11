
public class GreaterNumIfElse {

	public static void main(String[] args) {
		int num1 = 300;
		int num2 = 250;
		int num3 = 124;
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Number one is greater");
			}
			else {
				System.out.println("Number three is greater");
			}
		}
		else {
				if(num2>num3) {
					System.out.println("Number two is greater");
			}
				else {
					System.out.println("Number three is greater");
			}
		}
		
		int num4 = 500;
		
		if(num1>num2) {
			if(num1>num3) {
				if(num1>num4) {
				System.out.println("Number one is greater");
			}
				else {
					System.out.println("Number four is greater");
				}
			}
			else {
				if(num3>num4) {
				System.out.println("Number three is greater");
				}
				else {
					System.out.println("Number four is greater");
				}
			}
		}
		else {
				if(num2>num3) {
					if(num2>num4) {
					System.out.println("Number two is greater");
					}
					else {
						System.out.println("Number four is greater");
					}
				}
					else {
					if(num3>num4) {
						System.out.println("Number third is greater");
					}
					else {
						System.out.println("Number four is greater");
					}
				}
		}
	}
}
