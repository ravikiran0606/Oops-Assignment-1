/*
 * Created by Ravi Kiran.S
 * Roll No: 2015103019
 * 
 * 
 */
import java.util.*;

public class DuplicateElimination {
	public static void main(String[]args){
		Scanner inp=new Scanner(System.in);
		ArrayList<Integer>a = new ArrayList();
		int t;
		System.out.println("Enter any five numbers...");
		for(int i=1;i<=5;i++){
			t=inp.nextInt();
			if(!a.contains(t)){
				a.add(t);
			}
			System.out.println("The complete set of unique values so far is..");
			for(int j=0;j<a.size();j++){
				System.out.print(a.get(j)+" ");
			}
			System.out.print("\n");
		}
	}
}
