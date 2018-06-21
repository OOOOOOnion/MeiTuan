package model;

public class Admin {
	private int adminid;
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	private String adminaccount;
	private String adminpassword;
	public String getAdminaccount() {
		return adminaccount;
	}
	public void setAdminaccount(String adminaccount) {
		this.adminaccount = adminaccount;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	
}
