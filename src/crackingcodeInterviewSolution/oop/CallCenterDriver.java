/**
11-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author anuj
 *
 *         6:27:42 PM
 */
public class CallCenterDriver {

	public static void main(String str[]) {

	}

}

class CallHandler {

	static final int LEVELS = 3;
	static final int NUM_FRESHERS = 5;
	ArrayList<Employee>[] employeeLevels = new ArrayList[LEVELS];

	Queue<Call>[] callQueues = new LinkedList[LEVELS];

	public CallHandler() {
	}

	Employee getCallHandler(Call call) {

		for (int level = call.rank; level < LEVELS - 1; level++) {

			ArrayList<Employee> employeeLevel = employeeLevels[level];

			for (Employee emp : employeeLevel) {

				if (emp.free) {
					return emp;
				}
			}

		}

		return null;

	}

	void dispatchCall(Call call) {

		Employee emp = getCallHandler(call);

		if (emp != null) {
			emp.ReceiveCall(call);
		} else {
			callQueues[call.rank].add(call);
		}
	}

	void getNextCall(Employee e) {

	}
}

class Call {

	int rank = 0;

	public void reply(String message) {
		System.out.println("Replying to Client ......" + message);
	}

	public void disconnect() {
		System.out.println("Call is going to disconnecting ......");
	}
}

class Employee {

	CallHandler callHandler;
	int rank;
	boolean free;

	Employee(int rank) {
		this.rank = rank; // 0 - fresher , 1- technical Lead , 2- Product
							// Manager
	}

	void ReceiveCall(Call call) {
		call.reply("hello...client...");

	}

	void CallHandled(Call call) {

		call.disconnect();
	}

	void CannotHandle(Call call) {

		call.rank = rank + 1;
		callHandler.dispatchCall(call);
		free = true;
		callHandler.getNextCall(this);// look for waiting call
	}

}

class ProductManager extends Employee {

	/**
	 * @param rank
	 */
	ProductManager(int rank) {
		super(2);
	}

}

class TechnicalLead extends Employee {

	/**
	 * @param rank
	 */
	TechnicalLead(int rank) {
		super(1);

	}

}

class Fresher extends Employee {

	/**
	 * @param rank
	 */
	Fresher(int rank) {
		super(0);

	}

}