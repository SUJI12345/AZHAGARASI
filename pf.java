/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 class Demo
{
    public static void main(String[] args) 
    {
        int number;
        Scanner s=new Scanner(System.in);
        System.out.println("");
        number=s.nextInt();
        if(number>0)
        {
            System.out.println("Positive");
        }
        else if(number<0)
        {
            System.out.println(" Negative");
        }
        else
        {
            System.out.println(" Zero");
        }
    }
}
