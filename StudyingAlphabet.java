import java.util.*;
import java.lang.*;
import java.io.*;

class StudyingAlphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
	    String s = scan.next();
	    int n = scan.nextInt();
		while(n-->0){
		    String w = scan.next();
		    boolean find = true;
		    for(int i = 0;i<w.length();i++){
		        if(!s.contains(w.substring(i,i+1))){
		            find=false;
		            break;
		        }
		    }
		    System.out.println(find?"Yes":"No");
		}

	}
}
