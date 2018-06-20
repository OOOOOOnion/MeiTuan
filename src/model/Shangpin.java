package model;

public class Shangpin {
	private int sjid;
	private int spid;
	private String spname;
	private String spprice;
	private String sppic;
	public int getSjid() {
		return sjid;
	}
	public void setSjid(int sjid) {
		this.sjid = sjid;
	}
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid2) {
		this.spid = spid2;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public String getSpprice() {
		return spprice;
	}
	public void setSpprice(String spprice) {
		this.spprice = spprice;
	}
	public String getSppic() {
		return sppic;
	}
	public void setSppic(String zunbaopic) {
		this.sppic = zunbaopic;
	}
	@Override
	public String toString() {
		return "Shangpin [sjid=" + sjid + ", spid=" + spid + ", spname=" + spname + ", spprice=" + spprice + ", sppic="
				+ sppic + "]";
	}
	
}
