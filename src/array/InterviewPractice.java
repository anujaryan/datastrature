/**
10-Aug-2019
Dell

 * 
 */
package array;

/**
 * @author Dell
 *
 *         1:12:48 am
 */
public class InterviewPractice {

	public static void main(String[] args) {

		A a = new B();
		a.m1();

	}
}

class A {
	void m1() {
		System.out.println("In A");
	}
}

class B extends A {
	@Override
	void m1() {
		System.out.println("IN B");
	}

	void m2() {
		System.out.println("IN b m2");
	}
}
