package oops;

/**
 * @author Anuj Pachauri
 *
 *         12:25:18 am
 */
public abstract class ShallowCopyTets {

	public void clonetest() {

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("Anuj", new Course("Science", 1));
		Student s2 = (Student) s1.clone();
		System.out.println(s2.course.name);
		s2.course.name = "History";
		System.out.println(s1.course.name);
	}

}

class Course {
	String name;
	int id;

	Course(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

class Student implements Cloneable {
	String name;
	Course course;

	Student(String name, Course course) {
		this.name = name;
		this.course = course;
	}

	public final void getName() {
		System.out.println("Hello");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
