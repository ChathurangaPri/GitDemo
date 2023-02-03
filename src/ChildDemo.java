
public class ChildDemo extends ParentDemo{
	
	String name = "WebAutomation";
	
	public ChildDemo() {
		super(); //this should be the first line
		System.out.println("child class constructor");
	}
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am child method");
	}
	
	public static void main(String[] args) {
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();
	}

}
