package com.exmaple;
import jakarta.persistence.*;


@Entity
@Table(name="csd_details")


public class csdhibernate {
	@Id
	@Column

	private int id;
	@Column
	private String name;
	@Column
	private int marks;
public csdhibernate() {
}
public csdhibernate(int id ,String name , int marks) {
	this.id=id;
	this.name=name;
	this.marks= marks;
}
public void setId(int id) {
	this.id =id;
}
public void setName(String name) {
	this.name =name;
}
public void setMarks(int marks) {
	this.marks =marks;
}
public int getId() {
	return id;
	
}
public String getName() {
	return name;
	
}
public int getMarks() {
	return marks;
	
}
}
