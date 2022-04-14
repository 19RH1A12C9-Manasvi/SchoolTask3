package com.spring.entities;

import javax.persistence.*;
@Table(name="School")
@Entity
public class School {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="schoolId")
	private int schoolId;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Type")
	private String Type;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="mobileNum")
	private long mobileNum;
	
	public School() {}

    public School(int schoolId, String Name, 
                    String Type, String Address,long mobileNum) {
        this.schoolId = schoolId;
        this.Name = Name;
        this.Type = Type;
        this.Address = Address;
        this.mobileNum = mobileNum;
    }
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	
}
