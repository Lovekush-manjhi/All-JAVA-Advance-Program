public class Logical_operator {
    public static void main(String args[]) {
        System.out.print("Logical Operator : \n ");

     boolean a=true;
     boolean b=false;
    // boolean resultAnd = (a&&b);
     System.out.print("AND (&&) logical Operator value : "+ (a&&b));
     System.out.print("\nOR (||) logical Operator value : "+ (a||b));
     System.out.print("\nNOT (!a) logical Operator value : "+ (!a));
     System.out.print("\nNOT (!b)logical Operator value : "+ (!b));





    //     int a=50;
    //     int b=2;
             
    //     if(a>10 && a>20) {
    //         System.out.println("Yes!");
    //     }
    //     else{
    //         System.out.print("No");
    //     }
     }
}


/*
For Notes =>
-------------------

Logical Operator in Java: =>
---------------------------
Logical operators in Java are used to perform logical operations on boolean values. 
They allow you to combine multiple boolean expressions and return a boolean result.


Java has three logical operators:

1. Logical AND (&&): Returns true if both operands are true, otherwise false. If the first operand is false, the second operand is not evaluated (short-circuiting behavior).

2. Logical OR (||): Returns true if at least one of the operands is true, otherwise false. If the first operand is true, the second operand is not evaluated (short-circuiting behavior).

3. Logical NOT (!): Returns the opposite boolean value of the operand. If the operand is true, ! will return false, and if the operand is false, ! will return true.

*/