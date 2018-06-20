package service;

import dao.UserDao;
import model.Users;

public class UserService {
	public Users login( Users u){
		UserDao udao = new UserDao();
		Users eu  = udao.login(u);
		return eu;
	}

	public boolean register(Users regu) {
		boolean flag = false;
		UserDao userDao = new UserDao();
		flag = userDao.register(regu);
		return flag;
	}

	public boolean isUserExists(String ua) {
		boolean flag = false;
		UserDao userDao = new UserDao();
		flag = userDao.isUserExists(ua);
		return flag;
	}

	public boolean modify(Users u) {
		// TODO Auto-generated method stub
		boolean flag = false;
		UserDao userDao = new UserDao();
		flag = userDao.modify(u);
		return flag;
	}
}
