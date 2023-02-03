import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderDemo {

	public static void main(String[] args) {
		// To use Calendar make an instance of it
		Calendar cal = Calendar.getInstance();
		// in order to provide a paticular date format use object of SimpleDateFormat
		// and pass the format make sure o use "M" for month
		// use simple dateformat codes properly when placing the letters in the format
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		// then these two objects has to be combined using format() and pass cal.getTime()
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.ERA));
		
	}

}
