package model;

public class Order {
	private int oid;
	private int sid;
	private int uid;
	private int spid;
	private int spnum;
	private double spprice;
	private double totalprice;
	private String state;
	public Order(int oid, int sid, int uid, int spid, int spnum, double spprice, double totalprice, String state) {
		super();
		this.oid = oid;
		this.sid = sid;
		this.uid = uid;
		this.spid = spid;
		this.spnum = spnum;
		this.spprice = spprice;
		this.totalprice = totalprice;
		this.state = state;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", sid=" + sid + ", uid=" + uid + ", spid=" + spid + ", spnum=" + spnum
				+ ", spprice=" + spprice + ", totalprice=" + totalprice + ", state=" + state + "]";
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public int getSpnum() {
		return spnum;
	}
	public void setSpnum(int spnum) {
		this.spnum = spnum;
	}
	public double getSpprice() {
		return spprice;
	}
	public void setSpprice(double spprice) {
		this.spprice = spprice;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
