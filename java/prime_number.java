import java.lang.Math;
import java.util.Scanner;
public class Prime
{    
    public static void main(String args[])
    {    
		Scanner scn=new Scanner(System.in);
        int flag=0;      
		System.out.print(" Enter a number to be checked as a prime :: ");
        int n=scn.nextInt();//it is the number to be checked         
        if(n==0||n==1)
        {  
          System.out.println(n+" is not prime number");      
        }
        else
        {  
          for(int i=2;i<=(int)Math.sqrt(n);i++)
          {      
            if(n%i==0)
            {      
              System.out.println(n+" is not prime number");      
              flag=1;      
              break;      
            }      
          }      
        if(flag==0)  { System.out.println(n+" is prime number"); }  
        }//end of else  
    }    
}   
