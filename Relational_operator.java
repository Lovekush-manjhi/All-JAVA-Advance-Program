/*For Notes  =>
--------------
Relational Operaotor in java = 
----------------------------------------
Relational operators in Java are used to perform comparisons between two values. 
They return a boolean result (true or false) based on the evaluation of the comparison. 
These operators are used to establish relationships between operands and are often used in conditional statements and loops to make decisions based on the comparison results.

Java Contain Many type of RElational Operator : 

1. qual to (==): Checks if two values are equal.
2. Not equal to (!=): Checks if two values are not equal.
3. Greater than (>): Checks if the left operand is greater than the right operand.
4. Less than (<): Checks if the left operand is less than the right operand.
5. Greater than or equal to (>=): Checks if the left operand is greater than or equal to the right operand.
6. Less than or equal to (<=): Checks if the left operand is less than or equal to the right operand.
 */
// EXAMPLE:

public class Relational_operator {
    public static void main(String args[]) {
        System.out.println("Relational Operator ");


        int a = 10;
        int b = 5;

        // Using relational operators to compare variables
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreaterThan = a > b;
        boolean isLessThan = a < b;
        boolean isGreaterThanOrEqual = a >= b;
        boolean isLessThanOrEqual = a <= b;

        // Displaying the results
        System.out.println("a == b: " + isEqual); // false
        System.out.println("a != b: " + isNotEqual); // true
        System.out.println("a > b: " + isGreaterThan); // true
        System.out.println("a < b: " + isLessThan); // false
        System.out.println("a >= b: " + isGreaterThanOrEqual); // true
        System.out.println("a <= b: " + isLessThanOrEqual); // false
    

    } 
}


