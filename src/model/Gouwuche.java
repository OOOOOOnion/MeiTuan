package model;

public class Gouwuche {
	private int sjid;
	private int uid;
	private int spid;
	private String spname;
	private int spnum;
	private int price;
	public Gouwuche() {
		
	}
	public Gouwuche(int sjid, int uid, int spid, String spname, int spnum,int price) {
		super();
		this.sjid = sjid;
		this.uid = uid;
		this.spid = spid;
		this.spname = spname;
		this.spnum = spnum;
		this.price = price;
	}
	public int getSjid() {
		return sjid;
	}
	public void setSjid(int sjid) {
		this.sjid = sjid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public int getSpnum() {
		return spnum;
	}
	public void setSpnum(int spnum) {
		this.spnum = spnum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Gouwuche [sjid=" + sjid + ", uid=" + uid + ", spid=" + spid + ", spname=" + spname + ", spnum=" + spnum
				+ ", price=" + price + "]";
	}
	
	
	
	
}
