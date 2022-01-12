package com.ja.madhura.serialjson;
public class Employee {
public Integer id;
public String name,city,email;
public Integer mobile;
public Employee(Integer mobile, Integer id, String email, String city, String name) {
	super();
	this.mobile = mobile;
	this.id = id;
	this.email = email;
	this.city = city;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", mobile=" + mobile + "]";
}
public Employee() {
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getMobile() {
	return mobile;
}
public void setMobile(Integer mobile) {
	this.mobile = mobile;
}

}
