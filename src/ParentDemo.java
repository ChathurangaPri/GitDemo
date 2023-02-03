
public class ParentDemo {
	String name = "Chathu";
	public ParentDemo() {
		System.out.println("parent class constructor");
	}
	
	public void getData() {
		System.out.println("I am parent method");
	}
	
	public static void main(String[] args) {
		ParentDemo pd = new ParentDemo();
		

	}

}
