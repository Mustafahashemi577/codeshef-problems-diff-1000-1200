import java.util.*;
import java.lang.*;
import java.io.*;

class Similar_Dishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t =scan.nextInt();
		while(t-->0){
		    String firstDish [] = new String [4];
		    String secondDish [] = new String[4];
		    for(int i = 0;i<4;i++){
		        firstDish[i]=scan.next();
		    }
		    for(int i = 0;i<4;i++){
		        secondDish[i]=scan.next();
		    }
		    int similar=0;
		    for(int i = 0;i<firstDish.length;i++){
		        for(int j = 0;j<secondDish.length;j++){
		            if(firstDish[i].equals(secondDish[j]))
		            {
		                similar++;
		                break;
		            }
		        }
		    }
		    System.out.println(similar>=2?"similar":"dissimilar");
		
		}

	}
}
