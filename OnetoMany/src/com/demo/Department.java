package com.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Department
 *
 */
@Entity
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long departmentId;
	private String title;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="dept")
	private List<Person> p =
			new ArrayList();
	

	public Department() {
		super();
	}


	public long getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<Person> getEmployee() {
		return p;
	}


	public void setPerson(List<Person> p) {
		this.p = p;
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", title=" + title + ", p=" + p + "]";
	}
   
	
}
