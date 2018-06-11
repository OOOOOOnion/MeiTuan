package service;

import dao.UserDao;
import model.Users;

public class UserService {
	public Users login( Users u){
		UserDao udao = new UserDao();
		Users eu  = udao.login(u);
		return eu;
	}
}
