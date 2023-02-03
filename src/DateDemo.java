import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// date object is created
		Date date = new Date();
		// date object is converted to string to print it
		System.out.println(date.toString());
		// in order to provide a paticular date format use object of SimpleDateFormat and pass the format make sure o use "M" for month
		// use simple dateformat codes properly when placing the letters in the format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		// then these two objects has to be combined using format()
		System.out.println(sdf.format(date));
		
	}

}
