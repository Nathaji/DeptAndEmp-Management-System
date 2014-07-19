package com.jing.domain;

public class Employee {
    private boolean isAdmin;
    private String username;
    private String password;
    private String name;
    private String sex;
    private String contact;
    private String position;
    private Integer dept;
  
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Integer getDept() {
		return dept;
	}
	public void setDept(Integer dept) {
		this.dept = dept;
	}
	public boolean getIsAdmin(){
		return this.isAdmin;
	}
	public void setIsAdmin(boolean b){
		this.isAdmin = b;
	}
    
}
