package hospital_app.controller.user;

import hospital_app.service.Imp.UserServiceImp;

public class TestRemoveUser {
	public static void main(String[] args) {
		UserServiceImp imp = new UserServiceImp();
		boolean result = imp.deleteUserById(1);
		if (result) {
			System.out.println("User deleted");
		} else {
			System.out.println("User does not exist");
		}
	}
}
