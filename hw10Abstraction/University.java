package hw10Abstraction;

/*
 * only one keyword "Extends" we can use to inherit interface 
 * An Interface can inherit more than one Interface (separated by comma) by extends keyword
 * An Interface can't inherit a regular class or an abstract class by extends keyword
 * 
 */
public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

//	default constructor

//		public University() {}
	// Interfaces can not have default constructors

	public void gymnasium();

	// default method
	public static void library() {
	};
	// static method
}