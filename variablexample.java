import java.util.Scanner;

/**
 * Write a description of class variablexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class variablexample
{
  public static void main(String[]arg)
  {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the Second number");
        int b=sc.nextInt();
        
        
    System.out.println("The addition is"+ (a+b));
    
    System.out.println("The substraction is"+(a-b));
    System.out.println("THe divisoin is"+((float)a/b));
    System.out.println("THe Multiplication is"+(a*b));
        int bigger=(a<b)?b:a;
    System.out.println("The greater number is"+bigger);
  }
}