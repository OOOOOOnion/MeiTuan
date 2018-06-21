package service;

import java.util.ArrayList;

import dao.GouWuCheDao;
import model.Gouwuche;

public class GouWuCheService {
	GouWuCheDao gwcdao=new GouWuCheDao();
	public  ArrayList<Gouwuche> addsp(Gouwuche gouwuche) {
		 ArrayList<Gouwuche> itemlist = gwcdao.addsp(gouwuche);
		 return itemlist;
	}
		
}
