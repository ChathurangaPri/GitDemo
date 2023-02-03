
public class StaticVariable {
	// instance variables get life only through object creation and every time an object created it will be a new set of instance values
	// class/static variables belongs to the class level which can be accessed by all the components
	// local variables can only be accessed by paticular method
	// static methods only accept static variables
	// static methods and variables can be accessed just by using name or classname.variable/method name
	// static block can be used to initialize all static variables
	String name;
	String address;
	static String city ;
	static int i;
	static {
		i=0;
		city = "Marawila";
	}
	
	public StaticVariable(String name,String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address+" "+city);
	}
	
	public static void getCity() {
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		StaticVariable sv1 = new StaticVariable ("Chathu","Nattandiya");
		StaticVariable sv2 = new StaticVariable ("Chathu","Mawila");
		sv1.getAddress();
		sv2.getAddress();
		StaticVariable.getCity();
	}

}
