
// Implicit Casting (Widening): Automatically performed by Java, no data loss.
// This happens when a smaller data type (e.g., int) is assigned to a larger data type (e.g., long, float, double).
// integer to double  4bytes to 8bytes

public class TypeCasting {
    public static void main(String[] args) {
        int value = 18 ;
       double newvalue = value ;
        System.out.println("Integer Value: " + value);
        System.out.println("Double Value: " + newvalue);
    }
}


// Explicit Casting (Narrowing): Requires manual conversion, potential data loss.
// Narrowing is needed when assigning a larger data type (e.g., double) to a smaller data type (e.g., int).
// double to Integer 8byets to 4bytes 
public class TypeCasting {
    public static void main(String[] args) {
         double age = 18.7 ;
         int newage = (int)age ;
        // int newage = age ; // Not working 
         System.out.println("age - " + age);
         System.out.println("newage  - " + newage);
    }
}

// 2.  Explicit Type Casting (Narrowing Casting):
public class TypeCasting  {
    public static void main(String[] args) {
        double doubleValue = 9.78; // double (8 bytes)
        int intValue = (int) doubleValue; // Explicit casting from double to int (4 bytes)

        System.out.println("Double Value: " + doubleValue);
        System.out.println("Integer Value: " + intValue);
    }
}


// 3. Type Casting Between Primitive Types and Wrapper Classes:
// To convert primitive Integer  into object we have to use Wrapper classes  ;

public class TypeCasting  {
    public static void main(String[] args) {
        int intValue = 42; // primitive Integer
        Integer integerObject = Integer.valueOf(intValue); // Auto-boxing: int to Integer

        intValue = integerObject; // Un-boxing: Integer to int

        System.out.println("Integer Object: " + integerObject);
        System.out.println("Primitive int Value: " + intValue);
    }
}


// Autoboxing in Java is the automatic conversion of primitive data types into their corresponding wrapper class objects.
// Unboxing in Java is the automatic conversion of wrapper class objects back into their corresponding primitive data types.
//  A wrapper class is a class that encapsulates a primitive data type into an object

// Wrapper Class: A wrapper class is a class that represents a primitive data type as an object (e.g., Integer for int, Double for double).
// Autoboxing: This is the automatic conversion of a primitive type to its wrapper class (e.g., int to Integer).
// Unboxing: This is the automatic conversion of a wrapper class back to its primitive type (e.g., Integer to int).

// Relation Between Wrapper Class, Autoboxing, and Unboxing
// Wrapper classes enable Java to store primitive values as objects.
// Autoboxing and Unboxing make using wrapper classes easier by automatically converting back and forth between primitives and objects as needed.