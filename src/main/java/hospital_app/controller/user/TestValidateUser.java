package hospital_app.controller.user;

import java.util.List;

import hospital_app.dto.User;
import hospital_app.service.Imp.UserServiceImp;

public class TestValidateUser {
public static void main(String[] args) {
	UserServiceImp imp=new UserServiceImp();
	User user=imp.validateUser("john@mail.com", "jon4710");
	if(user!=null)
	{
		System.out.println("User name :" + user.getName());
		System.out.println("User role :" + user.getRole());
	}
	else
	{
		System.out.println("Email or password wrong");
	}
}
}
