package workshop3;
import java.util.Scanner;


/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{

public static void main(String[]arg)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the days into years");
    int time=sc.nextInt();
    int year=(time/365);
    int month=(time%365)/30;
    int remainder=((time%365)%30);
    
    System.out.println("the time in year="+year+"/n"+"the time in month="+ month+"/n"+"the time in days="+remainder);

}
}
