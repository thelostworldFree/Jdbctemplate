package com.fuwei.model;

public class Student {

	private int sid;
	private String username;
	private String classes;
	private String birthday;
	private String city;
	private int qq;
	private String words;
	private int phone;
	
	public Student() {
		super();
	}

	public Student(String username, String classes, String birthday, String city, int qq, String words, int phone, int sid) {
		super();
		this.username=username;
		this.classes=classes;
		this.birthday=birthday;
		this.city=city;
		this.qq=qq;
		this.words=words;
		this.phone=phone;
		this.sid=sid;
	}
	public Student(String username, String classes, String birthday, String city, int qq, String words, int phone) {
		super();
		this.username=username;
		this.classes=classes;
		this.birthday=birthday;
		this.city=city;
		this.qq=qq;
		this.words=words;
		this.phone=phone;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getQq() {
		return qq;
	}
	public void setQq(int qq) {
		this.qq = qq;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", username=" + username + ", classes=" + classes + ", birthday=" + birthday
				+ ", city=" + city + ", qq=" + qq + ", words=" + words + ", phone=" + phone + "]";
	}
	
	
}
