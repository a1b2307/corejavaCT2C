package MyPrograms;
import java.util.Scanner;
public class MatMui 
{
	public static void main(String args[]) 
	{
		int a[][],b[][],c[][],m,n,p,q,i,j,k;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of the first matrix:");
	    m=sc.nextInt();
	    n=sc.nextInt();
	    System.out.println("enter the size of the second matrix:");
	    p=sc.nextInt();
	    q=sc.nextInt();
	    if(n==p) 
	    {
	    	a=new int[m][n];
	    	b=new int[p][q];
	    	c=new int[m][q];
	    	System.out.println("enter elements of first matrix :");
	    	for(i=0;i<m;i++) 
	    	{
	    		for(j=0;j<n;j++)
	    		{
	    			a[i][j]=sc.nextInt();
	    		}
	    	}
	    	System.out.println("enter elements of second matrix");
	    	for(i=0;i<p;i++) 
	    	{
	    		for(j=0;j<q;j++)
	    		{
	    			b[i][j]=sc.nextInt();
	    		}
	    	}
	    	for(i=0;i<m;i++) 
	    	{
	    		
	    		for(j=0;j<q;j++)
	    		{
	    			c[i][j]=0;
	    			for(k=0;k<m;k++)
	    			{
	    				c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
	    			}
	    		}
	    	}
	    	System.out.println("the first matrix is");
	    	for(i=0;i<m;i++) 
	    	{
	    		for(j=0;j<n;j++)
	    		{
	    			System.out.print(" "+a[i][j]);
	    		}
	    		System.out.println();
	    	}
	    	System.out.println("the second matrix is");
	    	for(i=0;i<p;i++) 
	    	{
	    		for(j=0;j<q;j++)
	    		{
	    			System.out.print(" "+b[i][j]);
	    		}
	    		System.out.println();
	    	}
	    	System.out.println("the resuiltant matrix is");
	    	for(i=0;i<m;i++) 
	    	{
	    		for(j=0;j<q;j++)
	    		{
	    			System.out.print(" "+c[i][j]);
	    		}
	    		System.out.println();
	    	}
	    }
	    else{
	    	 System.out.println("matrix multiplication is not possible");  	
	    	}
	    		
	   
	    	
	    		
	    	
	    
	}
	    
	    	
	    
	

}
