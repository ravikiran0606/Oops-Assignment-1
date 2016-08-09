

public class Employee {
	String firstName,lastName;
	double salary;
	
	public Employee(String fn,String ln,double sal){
		firstName=fn;
		lastName=ln;
		salary=sal;
	}
	
	public void set_firstName(String x){
		firstName=x;
	}
	
	public String get_firstName(){
		return firstName;
	}
	
	public void set_lastName(String x){
		lastName=x;
	}
	
	public String get_lastName(){
		return lastName;
	}
	
	public void set_salary(double x){
		if(salary>=0)
			salary=x;
	}
	
	public double get_salary(){
		return salary;
	}
	
	public void raise(double percent){
		double temp;
		temp=salary*(percent/100);
		salary+=temp;
	}
	
}
