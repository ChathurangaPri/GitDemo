
public class B extends A{
	int i = 20;
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		A c = new B();
		System.out.println(b.i);
	}

}
