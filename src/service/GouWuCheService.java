package service;

import dao.GouWuCheDao;
import model.GouWuChe;

public class GouWuCheService {
	GouWuCheDao gwcdao=new GouWuCheDao();
	public void addsp(GouWuChe gwc) {
		String ddid = gwc.getGwcid();
		String ddname=gwc.getGwcname();
		String ddprice=gwc.getGwcprice();
		String ddpic=gwc.getGwcpic();
		String ddnum=gwc.getGwcnum();
		try {
			gwcdao.addDingdanInfo(gwc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
