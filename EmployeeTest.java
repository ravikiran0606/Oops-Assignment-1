/*
 * Created by Ravi Kiran.S
 * Roll No: 2015103019
 * 
 * 
 */

import java.util.*;

public class EmployeeTest {
	public static void main(String[]args){
		Scanner inp=new Scanner(System.in);
		String fn,ln;
		double sal;
		
		// For the first employee...
		System.out.println("Enter the first name,last name and salary of first employee");
		fn=inp.next();
		ln=inp.next();
		sal=inp.nextDouble();
		Employee a = new Employee(fn,ln,sal);
		
		// For the Second employee...
		System.out.println("Enter the first name,last name and salary of Second employee");
		fn=inp.next();
		ln=inp.next();
		sal=inp.nextDouble();
		Employee b = new Employee(fn,ln,sal);
		
		// Employee Capabilities :
		System.out.println("Employee 1 :");
		System.out.println("Employee Name : "+a.getFirstName()+" "+a.getLastName());
		System.out.println("Salary : "+a.getSalary());
		
		System.out.println("Employee 2 :");
		System.out.println("Employee Name : "+b.getFirstName()+" "+b.getLastName());
		System.out.println("Salary : "+b.getSalary());
		
		System.out.println("Before Raising, the salary of the two employees were,");
		System.out.println("Employee 1 : "+a.getSalary());
		System.out.println("Employee 2 : "+b.getSalary());
		
		a.raise(10);
		b.raise(10);
		
		System.out.println("After Raising 10% of the original salary, the salary of the two employees are,");
		System.out.println("Employee 1 : "+a.getSalary());
		System.out.println("Employee 2 : "+b.getSalary());
	}
}
