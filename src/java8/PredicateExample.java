package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Anuj Pachauri
 *
 *         10:55:20 pm
 */
public class PredicateExample {

	public static void main(String[] args) {

		List<String> namelist = Arrays.asList("anuj", "sumit", "rahul", "saddam", "amit", "amitabh");

		// empl with name start with a
		namelist = namelist.stream().filter(name -> name.startsWith("a")).collect(Collectors.toList());

		System.out.println(namelist);

		// emp name start with a and name length less than 5
		// filter chain..

		namelist = namelist.stream().filter(name -> name.startsWith("a")).filter(name -> name.length() < 5)
				.collect(Collectors.toList());

		System.out.println(namelist);

		// complex predicate

		namelist = namelist.stream().filter(name -> name.startsWith("a") && name.length() > 5)
				.collect(Collectors.toList());
		System.out.println(namelist);

		// Combining Predicates

		Predicate<String> predicate1 = str -> str.startsWith("a");

		Predicate<String> predicate2 = str -> str.length() > 5;

		namelist = namelist.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList());

		System.out.println(namelist);

		List<String> result = namelist.stream().filter(predicate1.or(predicate2.negate())).collect(Collectors.toList());

		Employee e1 = new Employee(1, 16, "M", "JACK", "ETHRED");

		Employee e2 = new Employee(2, 35, "F", "JOANN", "WEST");

		Employee e3 = new Employee(3, 55, "F", "DIANE", "LINGGET");

		Employee e4 = new Employee(4, 14, "M", "DANE", "MUELER");

		Employee e5 = new Employee(5, 21, "F", "KAVITA", "AGGRAWAL");

		Employee e6 = new Employee(6, 25, "M", "RONALDO", "WILLIAM");

		Employee e7 = new Employee(7, 16, "F", "PARUL", "LUTHRA");

		Employee e8 = new Employee(8, 19, "M", "AYUSH", "BHATIYA");

		Employee e9 = new Employee(9, 27, "F", "MANU", "SHUKLA");

		List<Employee> emplist = Arrays.asList(new Employee[] { e1, e2, e3, e4, e5, e6, e7, e8, e9 });
		System.out.println(EmployeePredicate.filterEmployees(emplist, EmployeePredicate.getAdultEmp()));
		System.out.println(EmployeePredicate.filterEmployees(emplist, EmployeePredicate.getFemaleEmp()));
		System.out.println(EmployeePredicate.filterEmployees(emplist, EmployeePredicate.iMoreThanAge(21)));

		// Employee other than above collection of "isAgeMorethan(25)"
		// Can we get like
		System.out.println(EmployeePredicate.filterEmployees(emplist, EmployeePredicate.iMoreThanAge(21).negate()));
	}

}

class EmployeePredicate {

	public static Predicate<Employee> getAdultEmp() {

		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	}

	public static Predicate<Employee> getFemaleEmp() {

		return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	}

	public static Predicate<Employee> iMoreThanAge(int age) {
		return p -> p.getAge() > age;
	}

	public static List<Employee> filterEmployees(List<Employee> Employee, Predicate<Employee> predicate) {

		return Employee.stream().filter(predicate).collect(Collectors.toList());

	}

}

class Employee {

	private Integer id;
	private Integer age;
	private String gender;
	private String firstname;
	private String lastname;

	public Employee(int id, int age, String gender, String firstname, String lastname) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return this.id.toString() + " - " + this.age.toString();

	}
}
