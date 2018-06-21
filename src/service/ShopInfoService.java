package service;

import dao.ShopInfoDao;
import model.Shops;

public class ShopInfoService {

	public boolean modify(Shops s) {
		// TODO Auto-generated method stub
		boolean flag = false;
		ShopInfoDao shopInfoDao = new ShopInfoDao();
		flag = shopInfoDao.modify(s);
		return flag;
	}
	
}
