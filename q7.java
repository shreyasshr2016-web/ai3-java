import java.util.Scanner;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static void main(String[]arg)
    {
        String name="Aspirin";
        int price=40;
        int stock=500;
        Scanner sc=new Scanner(System.in);
         System.out.println("what medicine do you need");
      String Uname=sc.nextLine();
      String result=(name.equals(Uname))?"We do have that in stock":"Sorry it is out of stock";
      
       System.out.println("how many pieces do you need");
      int pieces=sc.nextInt();
      System.out.println("The total bill will be"+ (pieces*price));



    }
    }