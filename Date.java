/*
 * Created by Ravi Kiran.S
 * Roll No: 2015103019
 * 
 * 
 */
public class Date {
	int day,month,year;
	public Date(int a,int b,int c){
		day=a;
		month=b;
		year=c;
	}
	
	public void setDay(int x){
		day=x;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setMonth(int x){
		month=x;
	}
	
	public int getMonth(){
		return month;
	}
	
	public void setYear(int x){
		year=x;
	}
	
	public int getYear(){
		return year;
	}
	public void displayDate(){
		System.out.println(day+"/"+month+"/"+year);
	}
}
