import java.util.Scanner;

public class whatDay
{
    public static void main(String[] args)
    {
        int age;
        String day;
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Enter Age: ");
        age = keyboard.nextInt();

        Scanner keyboard2 = new Scanner (System.in);
        System.out.println ("Enter Day of the week in Mon, Tue, Wed, Thu, Fri, Sat, Sun:");
        day=keyboard2.nextLine();

        if((day == ("Sat"))||(day == ("Sun")))
        {
            System.out.println("Time To Celebrate!!!!");
        }
        if (age < 18 && (day == ("Mon"))||(day == ("Tue"))||(day == ("Wed"))||(day == ("Thu"))||(day == ("Fri")))
        {
            System.out.println("Its a school day!!!!");
        }
        //if (age < 18 && day == ("Mon,Tue,Wed,Thu,Fri") )
        //{
         //   System.out.println("Its a school day!!!!");
        //}
        else if  (age > 18 && (day == ("Mon"))||(day == ("Tue"))||(day == ("Wed"))||(day == ("Thu"))||(day == ("Fri")))
        {
            System.out.println("Its a Work day!!!!");
        }

    }
}
