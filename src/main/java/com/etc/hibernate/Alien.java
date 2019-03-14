package com.etc.hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
//@Table(name = "alien_table")
public class Alien {
	@Id
	private String aid;
	//@Transient
	private String aname;
	///@Column(name = "value_Name")
	private String avalue;
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAvalue() {
		return avalue;
	}
	public void setAvalue(String avalue) {
		this.avalue = avalue;
	}
	@Override
	public String toString() {
		return aid+","+aname+","+avalue;
	}
	
	
}
