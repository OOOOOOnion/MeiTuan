package service;

import dao.SjLoginDao;
import dao.UserDao;
import model.Shops;
import model.Users;
public class SjLoginService {
	public Shops sjlogin(Shops shops){
		SjLoginDao sdao = new SjLoginDao();
		Shops s = sdao.sjlogin(shops);
		return s;
		
	}
}
