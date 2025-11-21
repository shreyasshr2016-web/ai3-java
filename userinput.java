import java.util.Scanner;

/**
 * Write a description of class userinput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class userinput
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String Name=sc.nextLine();
        
        System.out.println("enter your age");
        int age=sc.nextInt();
        
        System.out.println("enter your GPA");
        float GPA=sc.nextFloat();
        
        System.out.println("the name,age and GPA is"+Name +","+age +"," +GPA);
        
    }
}