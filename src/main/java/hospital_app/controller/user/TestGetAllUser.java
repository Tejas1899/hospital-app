package hospital_app.controller.user;

import java.util.List;

import hospital_app.dto.User;
import hospital_app.service.Imp.UserServiceImp;

public class TestGetAllUser {
	public static void main(String[] args) {
		UserServiceImp imp = new UserServiceImp();
		List<User> list = imp.getAllUsers();
		if (list != null) {
			for (User user : list) {
				System.out.println("User name :" + user.getName());
				System.out.println("User email :" + user.getEmail());
				System.out.println("User password :" + user.getPassword());
				System.out.println("User role :" + user.getRole());
				System.out.println("------------------------------");
			}
		} else {
			System.out.println("No users exist");
		}
	}
}
