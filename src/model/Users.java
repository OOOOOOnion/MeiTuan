package model;

public class Users {
	private int uid;
	private String uname;
	private String uaccount;
	private String password;
	private String upic;
	private String phone;
	private String address;
	public int getUid() {
		return uid;
	}
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Users(int uid, String uname, String uaccount, String password, String upic, String phone, String address) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaccount = uaccount;
		this.password = password;
		this.upic = upic;
		this.phone = phone;
		this.address = address;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaccount() {
		return uaccount;
	}
	public void setUaccount(String uaccount) {
		this.uaccount = uaccount;
	}
	public String getUpic() {
		return upic;
	}
	public void setUpic(String upic) {
		this.upic = upic;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", uaccount=" + uaccount + ", password=" + password
				+ ", upic=" + upic + ", phone=" + phone + ", address=" + address + "]";
	}


	
	
	
}
