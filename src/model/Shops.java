package model;



public class Shops {
    private int sid;
    private String sname;
    private String saccount;
    private String password;
    private String spic;
    private String phone;
    private String address;
    private double startprice;
    private double deliveryfee;
    private double deliverytime;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaccount() {
        return saccount;
    }

    public void setSaccount(String saccount) {
        this.saccount = saccount;
    }

 
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    public String getSpic() {
        return spic;
    }

    public void setSpic(String spic) {
        this.spic = spic;
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

	public double getStartprice() {
		return startprice;
	}

	public void setStartprice(double startprice) {
		this.startprice = startprice;
	}

	public double getDeliveryfee() {
		return deliveryfee;
	}

	public void setDeliveryfee(double deliveryfee) {
		this.deliveryfee = deliveryfee;
	}

	public double getDeliverytime() {
		return deliverytime;
	}

	public void setDeliverytime(double deliverytime) {
		this.deliverytime = deliverytime;
	}

	@Override
	public String toString() {
		return "Shops [sid=" + sid + ", sname=" + sname + ", saccount=" + saccount + ", password=" + password
				+ ", spic=" + spic + ", phone=" + phone + ", address=" + address + ", startprice=" + startprice
				+ ", deliveryfee=" + deliveryfee + ", deliverytime=" + deliverytime + "]";
	}
    

    
}
