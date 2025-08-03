package com.example.StudentThymeleafCrudExample.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long Id;
	@Column
    private String name;
	@Column
    private String city;
    @Column
    private int marks;
    @Column
    private boolean result;
    
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public Student(long id, String name, String city, int marks, boolean result) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
		this.marks = marks;
		this.result = result;
	}
	public Student() {
		
	}

    

}
