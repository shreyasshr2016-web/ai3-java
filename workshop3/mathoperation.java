package workshop3;
import java.util.Scanner;


/**
 * Write a description of class mathoperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathoperation
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the grade");
       float grade=sc.nextFloat();
       String level=(grade>=40)?"congrats you have scored well":"you have failed";
       System.out.println("the grade is"+level);
    }
}