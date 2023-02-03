
public class consructorDemo {
	// constructor should have the class name
	// no return type
	// whenever an object is created of the class constructor will evoke
	// If a constructor is not defined explicitly java will evoke an implicit
	// constructor

	// default costructor
	public consructorDemo() {
		System.out.println("I am the constructor");
	}

	// parameterized costructor
	public consructorDemo(int a , int b) {
		System.out.println("I am the parameterized constructor");
	}

	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		consructorDemo cd = new consructorDemo();
		consructorDemo pcd = new consructorDemo(10,3);
		cd.getData();
	}

}
