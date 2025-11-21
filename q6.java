import java.util.Scanner;

/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main(String[]arg)
    {
        Scanner sc=new 
        Scanner(System.in);
        System.out.println("enter the water level");
        String waterlevel=sc.nextLine();
        float Level=sc.nextFloat();
        String level=(Level<1000)?"the water level is safe": "The water lever is in dengerous level";
        System.out.println("the level"+level);
        
        
    }
}