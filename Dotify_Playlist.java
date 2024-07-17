import java.util.*;
import java.lang.*;
import java.io.*;

class Dotify_Playlist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int l = scan.nextInt();
		    int m [] = new int [2*n];
		    int max = 0;
		    for(int i = 0;i<2*n;i++){
		        m[i]= scan.nextInt();
		    }
		    ArrayList<Integer> playlist = new ArrayList<>();
		    for(int i = 1;i<2*n;){
		        if(m[i]==l)
		        playlist.add(m[i-1]);
		        i+=2;
		    }
		    Collections.sort(playlist);
		    if(playlist.isEmpty()){
		    System.out.println(-1);
		    }
		    else{
		        if(k<=playlist.size()){
		            int c = playlist.size()-1;
		        while(k-->0){
		            int d = playlist.get(c);
		            max+=d;
		            c--;
		        }
		        System.out.println(max);
		        }
		        else
		        {
		          System.out.println(-1);
		        }
		    }
	    }

	}
}
