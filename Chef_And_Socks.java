import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Socks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int jacketCost = scan.nextInt();
		int sockCost = scan.nextInt();
		int money = scan.nextInt();
		int remain = money - jacketCost;
		if((remain/sockCost)%2==0 && (remain/sockCost)>0){
		    System.out.println("Lucky Chef");
		}
		else {
		    System.out.println("Unlucky Chef");
		}

	}
}
