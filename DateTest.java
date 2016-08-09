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
		obj.displayDate();
	}
}
