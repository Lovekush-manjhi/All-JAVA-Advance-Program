import java.util.Scanner;

public class variable_datatype {
   public static void main(String[] args) {

    int a=1;
    int b=5;
    char c='A';
    float d=5.79f;
    double e =25.557855;
    boolean result=true;

    String name="Mangubhai_ChaganBhai_Patel";

    System.out.println("sum of a and b is " + (a+b));
    System.out.println("Your name is " + (name));
    System.out.println("Char Data Type value is " + (c));
    System.out.println("float Data Type value is " + (d));
    System.out.println("Double Data Type Value " + (e));
    System.out.println("Boolean Data type value " + (result));

    Scanner sc= new Scanner(System.in);
    String inputp= sc.nextLine();
    System.out.println(inputp);
   } 
}