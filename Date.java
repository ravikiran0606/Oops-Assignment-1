
public class Date {
	int day,month,year;
	public Date(int a,int b,int c){
		day=a;
		month=b;
		year=c;
	}
	
	public void set_day(int x){
		day=x;
	}
	
	public int get_day(){
		return day;
	}
	
	public void set_month(int x){
		month=x;
	}
	
	public int get_month(){
		return month;
	}
	
	public void set_year(int x){
		year=x;
	}
	
	public int get_year(){
		return year;
	}
	public void displayDate(){
		System.out.println("The Date is "+day+"/"+month+"/"+year);
	}
}
