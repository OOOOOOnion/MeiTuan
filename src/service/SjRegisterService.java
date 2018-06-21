package service;

import dao.SjRegisterDao;
import dao.UserDao;
import model.Shops;
import model.Users;

public class SjRegisterService {
	public boolean register(Shops s) {
		boolean flag = false;
		SjRegisterDao sd = new SjRegisterDao();
		flag = sd.register(s);
		return flag;
	}
}
