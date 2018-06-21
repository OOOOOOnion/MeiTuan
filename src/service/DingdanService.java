package service;

import dao.DingdanDao;

public class DingdanService {

	public void creatOrderByUser(int uid, int sid) {
		// TODO Auto-generated method stub
		DingdanDao dingdanDao = new DingdanDao();
		dingdanDao.creatOrderByUser(uid,sid);
	}

}
