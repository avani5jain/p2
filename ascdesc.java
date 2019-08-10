import  java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,j,k,temp,temp1;
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	        { 
                a[i]=sc.nextInt();
                }
	    for(j=0;j<n/2;j++)
	        { 
                for(k=j+1;k<n/2;k++)
	                { 
                        if(a[j]>a[k])
	                        { temp=a[j];
                                a[j]=a[k];
                                a[k]=temp;
                                }
	                }
	        System.out.print(a[j]+" ");
	        }
	    for(i=n/2;i<n;i++)
	        { 
                for(j=i+1;j<n;j++)
	                { 
                        if(a[i]<a[j])
	                        { temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;
                                }
	                }
	        System.out.print(a[i]+" ");
	       }
	  }
    
}
