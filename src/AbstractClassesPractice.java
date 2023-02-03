
public abstract class AbstractClassesPractice {
	//Abstract is used mark abstract methods and classes
	//Abstract classes contains atleast one abstract method
	//Abstract classes are partial abstraction
	//Abstract classes can not be instantiate/can not make object
	//private can not be used for methods in Abstract classes
	// child classes are forced to implement abstrcat methods
	public void engineGuidelines() {
		System.out.println("Follow engine guidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow safety guidelines");
	}
	
	public abstract void bodyColor();
}
