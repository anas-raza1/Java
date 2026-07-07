import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {
	public static void main(String[] args) throws IOException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your name: ");
			String name = reader.readLine();
			System.out.println("Hello, " + name + "!");
			System.out.println("Enter your id: ");
			int id = Integer.parseInt(reader.readLine());
			System.out.println("Your id is: " + id);
	}
}
