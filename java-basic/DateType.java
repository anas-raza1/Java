import java.text.DateFormat;
import java.util.*;

public class DateType {
	public static void main(String []args) {
		Date d = new Date();
		System.out.println(d);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.MONTH, 10);
		System.out.println(c.getTime());
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT); 
		System.out.println(df.format(c.getTime()));
	}
}
