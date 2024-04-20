import java.util.*;
import java.lang.*;
import java.io.*;

class That_Is_My_Score
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    List <Integer> problem = new ArrayList<>();
		    List <Integer> marks = new ArrayList<>();
		    for(int i =0;i<n;i++){
		        int a = scan.nextInt();
		        int b = scan.nextInt();
		        if(a>=1 && a<=8){
		            if (problem.contains(a)){
		                int index = problem.indexOf(a);
		                int previous = marks.get(index);
		                marks.set(index, Math.max(previous, b));
		            }else
		            {
		                problem.add(a);
		                marks.add(b);
		            }
		            
		        }
		    }
		    int sum = 0;
		    for(int j = 0 ; j<marks.size();j++)
		    sum+=marks.get(j);
		    
		    System.out.println(sum);
		}

	}
}
