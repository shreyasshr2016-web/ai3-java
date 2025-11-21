package workshop3;
import java.util.Scanner;
import java.awt.Font;


/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{
  
public static void main(String[]arg)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the time in seconds");
    int time=sc.nextInt();
    int hour=(time/3600);
    int minutes=(time%3600)/60;
    int remainder=time%60;
    
    System.out.println("the time in hour="+hour);
      System.out.println("the time in minutes="+ minutes);
        System.out.println("the time in seconds="+remainder);

}
}