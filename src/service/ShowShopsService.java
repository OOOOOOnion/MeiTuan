package service;

import java.util.ArrayList;

import bean.PageBean;
import dao.ShowShopsDao;
import model.Shops;

public class ShowShopsService {
	public ArrayList<Shops> QueryShopsByPage(PageBean pagebean){
		ArrayList<Shops> list = new ArrayList<Shops>();
		ShowShopsDao showShopsDao = new ShowShopsDao();
		list = showShopsDao.QueryShopsByPage(pagebean);
		return list;
		
		
	}
}
