package com.javaex.ex04;

public class Employee extends User {
	//필드
	private int salary;

	//생성자
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	//메소드 - getter/setter
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("#아이디 : " + getId() + ", #패스워드 : " + getPassword() + 
							", #이름 : " + getName() + ", #월급 : " + salary);
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", getId()=" + getId() + ", getPassword()=" + getPassword()
				+ ", getName()=" + getName() + "]";
	}
	
	
	
}
