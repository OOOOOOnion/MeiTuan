package service;

import java.util.ArrayList;
import java.util.List;

import dao.ShangpinDao;
import dao.SjToSpDao;
import model.Shangpin;
import model.Shops;

public class ShangpinService {
	public List<Shangpin> queryAllspInfo(Shangpin sp) throws Exception {
		 ShangpinDao spdao = new ShangpinDao();
		 ArrayList<Shangpin> list = new ArrayList<Shangpin>();
		 list=spdao.queryAllspInfo(sp);
	    return list;	
	}
}
