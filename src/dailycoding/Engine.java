/**
24-Jul-2019
Dell

 * 
 */
package dailycoding;

/**
 * @author Dell
 *
 *         11:44:28 pm
 */
public class Engine {

	public static void main(String[] args) {

		C c = new C();
		GrpAll g = c.getInstance();
		g.hello();

	}

}

class C {
	B getInstance() {
		return new B();
	}
}

interface GrpAll {

	public void hello();
}

class A {

}

class B extends A implements GrpAll {

	/*
	 * (non-Javadoc)
	 * 
	 * @see dailycoding.GrpAll#hello()
	 */
	@Override
	public void hello() {
		System.out.println("Hello...");

	}

}
