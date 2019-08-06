/**
11-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution.oop;

/**
 * @author anuj
 *
 *         7:58:00 PM
 */
public class ChatServerDriver {

}

enum StatusType {
	online, offline, away;
}

class Status {
	StatusType status_type;
	String status_message;
}

class User {

	String username;
	String display_name;
	User[] contact_list;

	AddRequest[] request;

	boolean updateStatus(StatusType type, String message) {

		if (type != null) {
			System.out.println("Message " + message);
			return true;
		}
		return false;

	}

	boolean addUserWithUsername(String name) {
		return true;
	}

	boolean approveRequest(String username) {
		return true;
	}

	boolean denyRequest(String username) {
		return false;
	}

	boolean removeContact(String username) {
		return true;
	}

	boolean sendMessage(String username, String message) {

		return true;
	}

}

// hold data that from_user would like to add to_user
class AddRequest {

	User from_user;
	User to_user;

}

class Server {
	User getUserByUsername(String username) {
		// if (username.equals("anuj"))
		return new User();

	}
}