public class data_type_declaration {
    
    public static void main (String[] args) {
    ////primitive datatype

        int a= -40;
        byte b=-1;
        short c=43;
        float d= 2.32f;
        double e= 5.665965236937878888d;
        char result='A'; 
        boolean bool=true;

        System.out.print("Intiger type value : "+a);
        System.out.print("\nbyte type value : "+b);
        System.out.print("\nshort type value : "+c);
        System.out.print("\nlong type value : "+a);
        System.out.print("\nFloat type value : "+d);
        System.out.print("\nDouble type value : "+e);
        System.out.print("\nchar type value : "+result);
        System.out.print("\nboolean type value : "+!(bool));
  
  
        //Refrence Datatype    
        int[] number ={1,2,3,4,5};
       

        System.out.print("\nArray type value : "+number[2]);
        
    } 
}

/*
For notes =>
-------------
Primitive Data Types:
Primitive data types are basic data types and are not objects. They are used to represent simple values and have fixed sizes. There are eight primitive data types in Java:

a. byte: 8-bit integer data type that can store values from -128 to 127.
b. short: 16-bit integer data type that can store values from -32,768 to 32,767.
c. int: 32-bit integer data type that can store values from -2^31 to 2^31 - 1.
d. long: 64-bit integer data type that can store values from -2^63 to 2^63 - 1.
e. float: 32-bit floating-point data type that can store decimal values with single-precision.
f. double: 64-bit floating-point data type that can store decimal values with double-precision.
g. char: 16-bit Unicode character data type representing a single character.
h. boolean: Represents a boolean value, either true or false. 


Reference Data Types:
Reference data types are used to refer to objects and are not fixed in size like primitive data types. They store references or memory addresses where the actual object is stored. Java's reference data types include:

a. Classes: User-defined data types created using the class keyword.
b. Arrays: Contiguous collections of elements of the same data type, which can be of either primitive or reference types.
c. Interfaces: Similar to classes but define a contract that implementing classes must follow.
d. Enumerations (Enums): A special data type used to define a set of constants.

*/