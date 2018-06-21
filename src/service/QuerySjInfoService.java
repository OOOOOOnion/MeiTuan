package service;

import java.util.ArrayList;
import java.util.List;

import dao.QueryInfoDao;
import model.Shops;
import model.Users;

public class QuerySjInfoService {
	QueryInfoDao qd = new QueryInfoDao();
	public List<Shops> queryAllSj() throws Exception {
		 ArrayList<Shops> sjlist = (ArrayList<Shops>)qd.queryAllsj();
	    return sjlist;	
	}
}
