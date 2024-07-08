import java.util.*;
import java.lang.*;
import java.io.*;

class Find_Your_Gift
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    char moves [] = scan.next().toCharArray();
		    int x = 0;
		    int y = 0;
		    char previous = ' ';
		    for (int i = 0;i<n;i++){
		        if(previous==' ')
		        {
		            switch (moves[i]){
		            case 'L':
		                x-=1;
		                previous=moves[i];
		                break;
		            case 'R':
		                x+=1;
		                previous=moves[i];
		                break;
		            case 'U':
		                y+=1;
		                previous=moves[i];
		                break;
		            case 'D':
		                y-=1;
		                previous=moves[i];
		                break;
		        }
		        }
		        if(i<n-1&&previous!=' '){
		            switch (moves[i]){
		            case 'L':
		                if(previous=='R'||previous=='L')
		                continue;
		                else
		                x-=1;
		                previous=moves[i];
		                break;
		            case 'R':
		                if(previous=='L'||previous=='R')
		                continue;
		                else
		                x+=1;
		                previous=moves[i];
		                break;
		            case 'U':
		                if(previous=='D'||previous=='U')
		                continue;
		                else
		                y+=1;
		                previous=moves[i];
		                break;
		            case 'D':
		                if(previous=='U' || previous=='D')
		                continue;
		                else
		                y-=1;
		                previous=moves[i];
		                break;
		        }
		        }    
		         if(i==n-1){
		            switch (moves[i]){
		            case 'L':
		                if(previous=='R'||previous=='L')
		                continue;
		                else
		                x-=1;
		                break;
		            case 'R':
		                if(previous=='L'||previous=='R')
		                continue;
		                else
		                x+=1;
		                break;
		            case 'U':
		                if(previous=='D'||previous=='U')
		                continue;
		                else
		                y+=1;
		                break;
		            case 'D':
		                if(previous=='U' || previous=='D')
		                continue;
		                else
		                y-=1;
		                break;
		        }
		        }    
		    }
		    System.out.println(x+" "+y);
		}
	}
}
