import java.util.*;
class Tdtp
{
              public static void main(String arg[])
              {
                     int[][] a=new int[10][10];
	   int[][] T=new int[10][10];
	   
	   int i,j,n,m;
                     Scanner t=new Scanner(System.in);
                     System.out.println("Enter n");
                     n=t.nextInt();
	   System.out.println("Enter m");
                     m=t.nextInt();
	   System.out.println(" enter array A matrix value");
                    for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	          
                             a[i][j]=t.nextInt();
	          
	         }
                          
                     }
	  for(i=0;i<n;i++)
                   {
                        for(j=0;j<m;j++)
                        {
                           T[i][j]=a[j][i]; 
	           
                          }
                      
                     }
	 for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	          System.out.print(T[i][j]+"     ");
	         }
	        System.out.println();
	}
	
       }
}

          
