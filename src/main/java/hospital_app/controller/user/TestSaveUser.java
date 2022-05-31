package hospital_app.controller.user;

import hospital_app.dto.User;
import hospital_app.service.Imp.UserServiceImp;

public class TestSaveUser {
public static void main(String[] args) {
	User user=new User();
	user.setName("Emma");
	user.setEmail("emma@mail.com");
	user.setPassword("emma7778");
	user.setRole("Nurse");
	UserServiceImp imp=new UserServiceImp();
	imp.saveUser(user);
}
}
