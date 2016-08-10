/*
 * Created by Ravi Kiran.S
 * Roll No: 2015103019
 * 
 * 
 */

public class Employee {
	String firstName,lastName;
	double salary,yearlySalary;
	
	public Employee(String fn,String ln,double sal){
		firstName=fn;
		lastName=ln;
		salary=sal;
		yearlySalary=salary*12;
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
	
	public double getYearlySalary(){
		return yearlySalary;
	}
	
	public void raise(double percent){
		double temp;
		temp=yearlySalary*(percent/100);
		yearlySalary+=temp;
	}
	
}
