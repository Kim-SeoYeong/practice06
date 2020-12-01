package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		//직원
		User[] userArray = new User[3];
		
		User user01 = new Customer("jws", "j1234", "정우성", 1000);
		User user02 = new Customer("yjs", "y2345", "이효리", 2000);
		User user03 = new Employee("master", "m7788", "운영자", 5000000);
		
		//이건 한번 이렇게 표현해봄..
		userArray[0] = (Customer)user01;
		userArray[1] = user02;
		userArray[2] = user03;
		
		for(int i = 0; i < userArray.length; i++) {
			userArray[i].showInfo();
			if (userArray[i].getName() == "운영자") {
				System.out.println("운영자의 월급은 " + ((Employee)userArray[i]).getSalary() 
									+ "원 입니다.");
			}
		}

	}

}
