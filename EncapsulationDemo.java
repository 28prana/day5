package com.cg.batch3.day5;

public class EncapsulationDemo {
	

		public static void main(String[] args) {

			Employee emp = new Employee();
//			emp.salary = 10000;
			System.out.println(emp.getSalary());
			emp.setSalary(100000);
			System.out.println(emp.getSalary());

		}

	}

