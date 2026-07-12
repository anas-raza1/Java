import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner("This is the count");
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
			count++;
		}
		System.out.println("word count " + count);
		scanner.close();

	}

}
