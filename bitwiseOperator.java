public class bitwiseOperator {
    public static void main(String args[]) {
        System.out.print("Bitwise operator  Operator : \n ");

        int  a=10;
        int b=2;
    
     System.out.print("Bitwise AND (&&) Operator value : "+ (a&b));
     System.out.print("\nBitwise OR (||) Operator value : "+ (a|b));
     System.out.print("\nBitwise XOR (!a) Operator value : "+ (a^b));
     System.out.print("\nBitwise NOT (!b) Operator value : "+ (~a));
     System.out.print("\nBitwise Left Shift (<<) Operator value : "+ (a<<b));
     System.out.print("\nBitwise Right Shift (||) Operator value : "+ (a>>b));
     System.out.print("\nBitwise Unsigned Right Shift (>>>) Operator value : "+ (a>>>b));
}
}

/*
For Notes => 
---------------


Bitwise Operator =>
-----------------------
Bitwise operators in Java are used to perform operations at the individual bit level of integer types (int, long, byte, short, char). 
They treat the operands as sequences of bits and perform bitwise operations on corresponding bits to produce the result. 
Java provides the following bitwise operators:

Bitwise AND (&): Performs bitwise AND operation on each pair of corresponding bits. If both bits are 1, the result is 1; otherwise, it's 0.

Bitwise OR (|): Performs bitwise OR operation on each pair of corresponding bits. If either bit is 1, the result is 1; otherwise, it's 0.

Bitwise XOR (^): Performs bitwise XOR (exclusive OR) operation on each pair of corresponding bits. If the bits are different, the result is 1; otherwise, it's 0.

Bitwise NOT (~): Performs bitwise NOT operation, which inverts each bit of the operand. If a bit is 0, it becomes 1, and if a bit is 1, it becomes 0.

Left Shift (<<): Shifts the bits of the left operand to the left by a specified number of positions. Filled with zeros on the right.

Right Shift (>>): Shifts the bits of the left operand to the right by a specified number of positions. Filled with the sign bit (arithmetic shift) or zeros 
(logical shift) on the left.

 */