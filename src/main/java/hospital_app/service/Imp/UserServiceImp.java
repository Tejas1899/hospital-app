package hospital_app.service.Imp;

import java.util.List;

import hospital_app.dao.Imp.UserDaoImp;
import hospital_app.dto.User;
import hospital_app.service.User_Service;

public class UserServiceImp implements User_Service {

	public User saveUser(User user) {
		UserDaoImp dao=new UserDaoImp();
		return dao.saveUser(user);
	}

	public User validateUser(String email, String password) {
		UserDaoImp dao=new UserDaoImp();
		return dao.validateUser(email, password);
	}

	public List<User> getAllUsers() {
		UserDaoImp dao=new UserDaoImp();
		return dao.getAllUsers();
	}

	public User getUserById(int id) {
		UserDaoImp dao=new UserDaoImp();
		return dao.getUserById(id);
	}

	public User updateUser(User user, int id) {
		UserDaoImp dao=new UserDaoImp();
		return dao.updateUser(user, id);
	}

	public boolean deleteUserById(int id) {
		UserDaoImp dao=new UserDaoImp();
		return dao.deleteUserById(id);
	}

}
