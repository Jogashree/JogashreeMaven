package com.javaprogramms;

class Employee{
	float salary;
	String name;
	int empid;
	float bonus;
}

class Programmer extends Employee{
	
	void calculatesalary(float salary,String name,int empid,float bonus) {
		System.out.println("Salary of the Employee is:"+(salary+bonus));
		System.out.println("Name of the employee is:"+name);
		System.out.println("Empid of the employee is:"+empid);
		
	}
}
class QA extends Employee{
	
	void calculatesalary(float sal,String name,int empid) {
		System.out.println("Salary of the Employee is:"+sal);
		System.out.println("Name of the employee is:"+name);
		System.out.println("Empid of the employee is:"+empid);
		
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		
		
		p.calculatesalary(2345.0f, "jogashree", 3456, 56.f);
		p.calculatesalary(8976.6f, "pranati", 2345, 78.0f);
		QA q;
		q=new QA();
		q.calculatesalary(5678.5f, "Aparna", 6789);
		q.calculatesalary(898765.2f,"Pragnya" , 3455);
		

	}

}
