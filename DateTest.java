/*
 * Created by Ravi Kiran.S
 * Roll No: 2015103019
 * 
 * 
 */
import java.util.*;

public class DateTest {
	
	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the day,month and year");
		a=inp.nextInt();
		b=inp.nextInt();
		c=inp.nextInt();
		Date obj=new Date(a,b,c);
		
		// Date Capabilities...
		System.out.println("Day : "+obj.getDay());
		System.out.println("Month : "+obj.getMonth());
		System.out.println("Year : "+obj.getYear());
		System.out.print("Date in Expected Format : ");
		obj.displayDate();
	}
}
