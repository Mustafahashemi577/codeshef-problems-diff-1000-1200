import java.util.*;
import java.lang.*;
import java.io.*;

class Max_Nutrition
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    Map <Integer, Integer> frequency = new HashMap<>();
		    ArrayList <Integer> list = new ArrayList<>();
		    
		    for(int i = 0;i<n;i++){
		        list.add(scan.nextInt());
		    }
		    for(int i = 0;i<n;i++){
		        int value = scan.nextInt();
		        frequency.put(list.get(i),Math.max(frequency.getOrDefault(list.get(i),0),value));
		    }
		    int sum = 0;
		    for(int price : frequency.keySet()){
		        if(frequency.get(price)>0)
		            sum += frequency.get(price);
		    }
		    System.out.println(sum);
		}

	}
}
