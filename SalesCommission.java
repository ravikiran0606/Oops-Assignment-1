import java.util.*;

public class SalesCommission {
	public static void main(String[]args){
		Scanner inp = new Scanner(System.in);
		int []counter=new int[10];
		int n,i;
		System.out.println("Enter the number of sales people");
		n=inp.nextInt();
		int []salary=new int[n];
		double []grossSales =new double[n];
		for(i=0;i<n;i++){
			grossSales[i]=inp.nextDouble();
			salary[i]=200+(int)((5*grossSales[i])/100);
			if(salary[i]>=200 && salary[i]<=299)counter[1]++;
			else if(salary[i]>=300 && salary[i]<=399)counter[2]++;
			else if(salary[i]>=400 && salary[i]<=499)counter[3]++;
			else if(salary[i]>=500 && salary[i]<=599)counter[4]++;
			else if(salary[i]>=600 && salary[i]<=699)counter[5]++;
			else if(salary[i]>=700 && salary[i]<=799)counter[6]++;
			else if(salary[i]>=800 && salary[i]<=899)counter[7]++;
			else if(salary[i]>=900 && salary[i]<=999)counter[8]++;
			else if(salary[i]>=1000)counter[9]++;
		}
		
		System.out.println("Tabulated Format : ");
		
		System.out.println("Range                      -  Count ");
		for(i=2;i<=10;i++){
			int x,y;
			x=i*100;
			y=x+99;
			if(i!=10){
				System.out.println("$"+x+" to $"+y+"               -  "+counter[i-1]);
			}
			else{
				System.out.println("$1000 and above            -  "+counter[i-1]);
			}
		}
	}
}
