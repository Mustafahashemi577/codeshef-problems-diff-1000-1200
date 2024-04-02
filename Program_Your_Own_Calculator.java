import java.util.*;
import java.lang.*;
import java.io.*;

class Program_Your_Own_Calculator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		switch (c){
		    case"+" :{
		        System.out.println((double)a+b);
		        break;
		    }
		    case"-":{
		        System.out.println((double)a-b);
		        break;
		    }
		    case"*" :{
		        System.out.println((double)a*b);
		        break;
		    }
		    case"/":{
		        System.out.println((double)a/b);
		        break;
		    }
		}

	}
}
