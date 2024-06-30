import java.util.*;
import java.lang.*;
import java.io.*;

class Multiple_Choice_Exam
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    char s [] = scan.next().toCharArray();
		    char u [] = scan.next().toCharArray();
		    int score = 0;
		    for(int i = 0;i<n;i++){
		        if(u[i]=='N'){
		        continue;
		        }
		        else if (s[i]!=u[i]){
		        i++;
		        continue;
		        }
		        if(s[i]==u[i]){
		        score++;
		        }
		    }
		    
		    System.out.println(score);
		}

	}
}
