package service;

import java.util.ArrayList;
import java.util.List;

import dao.QueryInfoDao;
import model.Users;

public class QueryUserInfoService {
	QueryInfoDao qd = new QueryInfoDao();
	public List<Users> queryAllUser() throws Exception {
		 ArrayList<Users> list = (ArrayList<Users>)qd.queryAllUser();
	    return list;	
	}
}
	
	 

