package com.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee1 {
		
		@Id
		public int eid;
		String name;
		
		double salary;
		

		public Employee1() {
			
		}

		public Employee1(int eid, String name, double salary) {
			super();
			this.eid = eid;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", eid=" + eid + ", salary=" + salary + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		

	}


