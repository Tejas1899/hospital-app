package hospital_app.controller.user;

import hospital_app.dto.User;
import hospital_app.service.Imp.UserServiceImp;

public class TestGetUserById {
	public static void main(String[] args) {
		UserServiceImp imp = new UserServiceImp();
		User user = imp.getUserById(1);
		if (user != null) {
			System.out.println("User name :" + user.getName());
			System.out.println("User email :" + user.getEmail());
			System.out.println("User password :" + user.getPassword());
			System.out.println("User role :" + user.getRole());
			System.out.println("------------------------------");
		} else {
			System.out.println("No user exist for this id");
		}
	}
}
