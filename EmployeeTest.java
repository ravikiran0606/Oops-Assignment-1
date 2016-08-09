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
		
		System.out.println("Before Raising, the salary of the two employees were,");
		System.out.println("Employee 1 : "+a.get_salary());
		System.out.println("Employee 2 : "+b.get_salary());
		
		a.raise(10);
		b.raise(10);
		
		System.out.println("After Raising 10% of the original salary, the salary of the two employees are,");
		System.out.println("Employee 1 : "+a.get_salary());
		System.out.println("Employee 2 : "+b.get_salary());
	}
}
