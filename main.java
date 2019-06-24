import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) throws Exception{
	    int count=0,a=0,i,j;
	    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	    String s=sc.readLine();
	    char d[]=s.toCharArray();
	  
	   // String[] c=new String(s);
	   
	    for(i=0;i<s.length();i++)
	    {   for(j=i+1;j<s.length();j++)
	      {
	           
	           if(d[i]==d[j])
	           {
	           a++;
	           }
	      }
	      count++;
	    }
	    if(a!=count)
	    System.out.println(count-a);
	    else
	    System.out.println(count+1-a);
	}
}
