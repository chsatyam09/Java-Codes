import java.util.ArrayList;

public class Wrapper {
    

    public static void main(String[] args) {

        // Creates a new Integer object every time
        Integer obj = new Integer(12);

  // Uses the Integer cache if within the range -128 to 127
        Integer obj2 = Integer.valueOf(12) ;

// convert String to Integer 
        Integer obj5 = Integer.valueOf("12") ;

        Integer obj3 =  12 ;// autoboxing 

        int age = obj ; // unboxing
        
        ArrayList<Integer> al = new ArrayList<>(); // collection framework 


    }
}
