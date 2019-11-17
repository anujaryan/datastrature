package array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         11:20:29 pm
 */
public class EmployeeImportance {

	public int getImportance(List<Employee> list, int id) {

		Employee employee = employeeById(id, list);

		int importance = employee.importance;

		for (int empid : employee.subordinates) {
			Employee subemp = employeeById(empid, list);
			importance += subemp.importance;
		}

		return importance;
	}

	public Employee employeeById(int id, List<Employee> list) {

		return list.stream().filter(emp -> id == emp.id).findAny().orElse(null);

	}

	public static void main(String[] args) {
		EmployeeImportance empimp = new EmployeeImportance();

		Employee emp1 = new Employee(1, 5, Arrays.asList(2, 3));
		Employee emp2 = new Employee(2, 3, Arrays.asList());
		Employee emp3 = new Employee(3, 3, Arrays.asList());
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(empimp.getImportance(list, 1));
		System.out.println(empimp.getImportance2(list, 1));

	}

	Map<Integer, Employee> hashmap;

	public int getImportance2(List<Employee> list, int id) {

		hashmap = new HashMap<Integer, Employee>();
		for (Employee e : list) {
			hashmap.put(e.id, e);
		}

		return dfs(id);
	}

	/**
	 * @param id
	 * @return
	 */
	private int dfs(int id) {

		Employee emp = hashmap.get(id);
		int ans = emp.importance;
		for (Integer subordinateid : emp.subordinates) {
			ans += dfs(subordinateid);
		}

		return ans;
	}

}

class Employee {
	public int id;
	public int importance;
	public List<Integer> subordinates;

	public Employee(int id, int importance, List<Integer> subordinates) {
		super();
		this.id = id;
		this.importance = importance;
		this.subordinates = subordinates;
	}

}
