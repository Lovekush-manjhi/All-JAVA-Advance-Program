import java.util.Scanner;

public class taking_user_input {
    public static void main(String args[]) {
        
        //Crate a Scanner object to read input froom user 
        Scanner S = new Scanner(System.in);

        System.out.println(" Enter Your First Name : ");

        //Read The input is entred by user 
        String fname= S.nextLine();

         System.out.println(" Enter Your Middel and last Name : ");

        //Read The input is entred by user 
        String lname= S.nextLine();

        System.out.println(" Enter Your Age : ");

       //Read The input is entred by user 
       short age= S.nextShort();

      System.out.println("Hello "+ fname + " " + lname +" " + "Your age is " + age );

    }
}
