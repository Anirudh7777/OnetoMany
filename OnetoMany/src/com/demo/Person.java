package com.demo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Table(name="employee")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pId;
	private String firstName;
	private String lastName;
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	private Department dept;
	
	public Person() {
		super();
	}


	


	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
   
}
