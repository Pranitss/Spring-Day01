package model;

public class Student 
{
  private int rollno;
  private String name;
  private String address;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student(int rollno, String name, String address) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}
public Student(int rollno) {
	super();
	this.rollno = rollno;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
}
  
  
  
}
