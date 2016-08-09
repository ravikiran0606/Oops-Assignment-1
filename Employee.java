/*
 * Created by Ravi Kiran.S
 * Roll No: 2015103019
 * 
 * 
 */

public class Employee {
	String firstName,lastName;
	double salary;
	
	public Employee(String fn,String ln,double sal){
		firstName=fn;
		lastName=ln;
		salary=sal;
	}
	
	public void setFirstName(String x){
		firstName=x;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String x){
		lastName=x;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setSalary(double x){
		if(salary>=0)
			salary=x;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void raise(double percent){
		double temp;
		temp=salary*(percent/100);
		salary+=temp;
	}
	
}
