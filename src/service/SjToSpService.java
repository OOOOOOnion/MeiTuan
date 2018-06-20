package service;

import java.util.ArrayList;
import java.util.List;

import dao.ShowShopsDao;
import dao.SjToSpDao;
import model.Shops;

public class SjToSpService {
		public ArrayList<Shops> sjtosp(Shops shops) throws Exception {
		//SjToSpDao stsdao = new SjToSpDao();
		//return stsdao.sjtospdao(shops);
		ArrayList<Shops> list = new ArrayList<Shops>();
		SjToSpDao sjtospdao = new SjToSpDao();
		list = sjtospdao.sjtospdao(shops);
		return list;
	}


}
