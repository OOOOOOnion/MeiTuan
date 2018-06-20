package service;

import dao.DingdanDao;
import model.Dingdan;

public class GouWuCheService {
	DingdanDao dd=new DingdanDao();
	public void addsp(Dingdan dingdan) {
		String ddid = dingdan.getDdid();
		String ddname=dingdan.getDdname();
		String ddprice=dingdan.getDdprice();
		String ddpic=dingdan.getDdpic();
		String ddnum=dingdan.getDdnum();
		try {
			dd.addDingdanInfo(dingdan);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
