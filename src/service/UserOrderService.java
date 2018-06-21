package service;

import java.util.ArrayList;

import bean.PageBean;
import dao.UserOrderDao;
import model.Order;

public class UserOrderService {
	UserOrderDao userOrderDao = new UserOrderDao();
	public int QueryAllOrder() {
		int size=0;
		
		size = userOrderDao.QueryAllOrder();
		return size;
	}

	public ArrayList<Order> QueryOrderByPage(PageBean pageBean) {
		// TODO Auto-generated method stub
		ArrayList<Order> list = new ArrayList<Order>();
		list = userOrderDao.QueryOrderByPage(pageBean);
		return list;
	}

}
