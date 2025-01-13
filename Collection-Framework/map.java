
// Map

// A map is an interface that represents a collection of key-values pairs, where each key and value pair is known as Entry ;
// A map contain unique keys ;
// A map contains values on the basis of key, i.e. key and value pair. 
// If we want to represent a group of Objects as a key-value pair then we need to go for Map ;
// Both keys and values are Objects only ;
// Duplicate keys are not allowed but values are allowedW
// Each key and value pair is known as an entry. 
// A Map is useful if you have to search, update or delete elements on the basis of a key.
// A Map doesn't allow duplicate keys, but you can have duplicate values. 
// HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

// Difference between Map and HashMap

// HashMap is a powerful data structure in Java used to store the key-pair values. 
// It maps a value by its associated key. It allows us to store the null values and null keys. 
// It is a non-synchronized class of Java collection.

// =========================================================================================================================================
// import java.util.*;
// public class map {

//     public static void main(String[] args) {
        
//         // map implements  HashMap,Hashtable,LinkedHashMap,TreeMap 

//         Map hmm= new HashMap<>();
//         HashMap hm= new HashMap<>();
        
//         Map hmmm= new Hashtable<>();
//         Hashtable ht=new Hashtable<>();

//         Map hmmmm= new LinkedHashMap<>();
//         LinkedHashMap lhm = new LinkedHashMap<>();

//         Map hmmmmm= new TreeMap<>();
//         TreeMap TM = new TreeMap<>();
//     }
// }
// =========================================================================================================================================
// import java.util.*;
// public class map {

//     public static void main(String[] args) {
        
//         HashMap hm= new HashMap();
//         Hashtable ht=new Hashtable();
//         LinkedHashMap lhm = new LinkedHashMap();
//         TreeMap TM = new TreeMap();
//     }
// }


// =========================================================================================================================================
// import java.util.*;


// public class map {
//    public static void main(String args[]) {
//        //Creation
//        HashMap<String, Integer> map = new HashMap<>();


//        //Insertion
//        map.put("India", 120);
//        map.put("US", 30);
//        map.put("China", 150);


//        System.out.println(map);


//        map.put("China", 180);
//        System.out.println(map);




//        //Searching
//        if(map.containsKey("Indonesia")) {
//            System.out.println("key is present in the map");
//        } else {
//            System.out.println("key is not present in the map");
//        }


//        System.out.println(map.get("China")); //key exists
//        System.out.println(map.get("Indonesia")); //key doesn't exist


//        //Iteration (1)
//        for( Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }


//        //Iteration (2)
//        Set<String> keys = map.keySet();
//        for(String key : keys) {
//            System.out.println(key+ " " + map.get(key));
//        }


//        //Removing
//        map.remove("China");
//        System.out.println(map);


//    }
// }

// =========================================================================================================================================

// HashMap and LinkedHashMap

// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.Map ;

// public class map {

//     public static void main(String[] args) {


//         HashMap<Integer,String> hm = new HashMap(); // not sure about order will retain or not 
//         hm.put(01,"virat"); // put = add 
//         hm.put(21,"virat kholi"); // key value yaha pe integer hai 
//         hm.put(87,"Satyam  ");// no print 
//         hm.put(87,"Satyam raj ");
//         hm.put(null,"Sat ");
//         hm.put(99, null);
//         hm.put(null, null);
//         hm.get(87);

//         System.out.println(hm);
//         System.out.println("------------------------");
        
//         HashMap hmm = new HashMap(); // not sure about order will retain or not 
//         hmm.put(01,"virat"); // put = add 
//         hmm.put(21,"virat kholi"); // key value yaha pe integer hai 
//         hmm.put(87,"Satyam  ");// no print 
//         hmm.put(87,"Satyam raj ");
//         hmm.put(null,"Sat ");
//         hmm.put(99, null);
//         hmm.put(null, null);
        
        
//         System.out.println(hmm);
//         System.out.println("------------------------");

//         HashMap hm1 = new HashMap();// not sure about order will retain or not 
//         hm1.put("one","virat");   // key value yaha pe String hai 
//         hm1.put("two","virat kholi");
//         hm1.put("three","Satyam  ");// no print 
//         hm1.put("anything","Satyam raj ");
//         hm1.put(null,"Sat ");
//         hm1.put("heelo", null);
//         hm1.put(null, null);
        
        
//         System.out.println(hm1);
//         System.out.println("------------------------");


//         LinkedHashMap hm2 = new LinkedHashMap(); //  sure about order will retain or not 
//         hm2.put(01,"virat");
//         hm2.put(21,"virat kholi"); // key value yaha pe integer hai 
//         hm2.put(87,"Satyam");// no print 
//         hm2.put(87,"Satyam raj ");
//         hm2.put(null,"Sat ");
//         hm2.put(99, null);
//         hm2.put(null, null);

//         System.out.println(hm2);
//         System.out.println("------------------------");
//     }
// }

// =========================================================================================================================================

// Accessing the Objects in Map

// import java.util.*;
// import java.util.Map.*;

// public class map {

//     public static void main(String[] args) {
//         Map  map=new HashMap(); // Hashmap ka parent Map hota hai
//         map.put(1, "Rohan");// Entry = key + values ;
//         map.put(2, "Rohit");
//         map.put(3, "Rahul");
//         System.out.println(map); // Entry = key + values ;

//         System.out.println(map.get(2)); //single Entry = key + values ;

//         Set keyset =map.keySet();// to get only keys  ;
//         Iterator itr1=keyset.iterator();
//         while (itr1.hasNext()) 
//         {
//             System.out.println(itr1.next());  // to get only keys  ;
//             // Integer key=(Integer)itr1.next();
//             // System.out.println(key);
            
//         }

//         Collection values=map.values(); // to get only values  ;
//         Iterator itr2=values.iterator();
//         while(itr2.hasNext())
//         {
//                System.out.println(itr2.next());  // to get only values  ;
//             //    String names=(String)itr2.next();
//             //    System.out.println(names);
//         }

//         // Set entrySet=map.entrySet();
//         // Iterator itr3= entrySet.iterator();
//         // while(itr3.hasNext())
//         // {
//         //  System.out.println(itr3.next());  // to get entry = key+ values ;
//         // }

// // // Another Mehhod

//          Map.Entry data=(Entry)itr3.next();
//          System.out.println(data.getKey() + " : " + data.getValue());
         

//     }
// }

// =========================================================================================================================================

// More on HashMap


// import java.util.*;
// import java.util.Map.*;

// class Student
// {
//     private String name;
//     private int age;
//     private String city;

//     public Student(String name, int age, String city)
//     {
//         this.name=name;
//         this.age=age;
//         this.city=city;

//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getCity() {
//         return city;
//     }

//     public String toString()
//     {
//         return name + " " + age + " " + city;
//     }

// }



// public class map 
// {
//     public static void main(String[] args) 
//     {

//         Student st1=new Student("Rohan", 18, "Bengaluru");
//         Student st2=new Student("Rohit", 19, "Delhi");
//         Student st3=new Student("Ramesh", 22, "Mysuru");


//         Map map=new HashMap();
//         map.put(1, st1);
//         map.put(2, st2);
//         map.put(3, st3);

//         System.out.println(map);

//         Set set=map.entrySet();
//         Iterator itr=set.iterator();

//         while(itr.hasNext())
//         {
//             //System.out.println(itr.next());
//             Map.Entry data=(Entry)itr.next();
//             System.out.println(data.getKey() + " : " + data.getValue());
            
//         }

        
//     }
    
// }

// =========================================================================================================================================

import java.util.*;
public class map 
{
    public static void main(String[] args) 
    {
       Hashtable ht=new Hashtable();
       ht.put(1, "Rohit");
       //ht.put(2, "Rohan");
       ht.put(3, "Ramesh");
      // ht.put(null, "Hyder");
      ht.putIfAbsent(2, "Rohan");

       System.out.println(ht);


       TreeMap tm=new TreeMap();
       tm.put(1, "Ramesh");
       tm.put(4, "Rahul");
       tm.put(3, "Rohsn");

       System.out.println(tm);

       System.out.println("))))))))))");

       Integer i=new Integer(5);
       tm.put(i, "Rohit");
       System.out.println(tm);
       
    }
    
}
// =========================================================================================================================================
// HashMap vs WeakHashMap


 // import java.util.*;

// class Employee
// {
//     private String name;
//     private int empId;

//     public Employee(String name, int empId)
//     {
//         this.name=name;
//         this.empId=empId;
//     }

//     public String toString()
//     {
//         return empId + "";
//     }

//     @Override
//     public void finalize()
//     {
//         System.out.println("clean up work  by GC before de allocating memoery from heap");

//     }
// }
// public class map
// {
//     public static void main(String[] args) 
//     {

//         Employee e=new Employee("Hyder", 171);


//         WeakHashMap hm=new WeakHashMap();
//         hm.put(e, "Hyder");
//         System.out.println(hm);

//         e=null;// eligible for garbage collection

//         System.gc(); //invocking garbage collector

//         System.out.println(hm);

//         System.out.println("Last line");

//     }
    
// }

// =========================================================================================================================================
// Hastable 
// import java.util.Hashtable;
// import java.util.Enumeration;

// public class HashtableExample {
//     public static void main(String[] args) {
//         // Creating a Hashtable
//         Hashtable<Integer, String> hashtable = new Hashtable<>();

//         // Adding key-value pairs to the Hashtable
//         hashtable.put(1, "Apple");
//         hashtable.put(2, "Banana");
//         hashtable.put(3, "Cherry");
//         hashtable.put(4, "Date");

//         // Displaying the contents of the Hashtable
//         System.out.println("Initial Hashtable:");
//         Enumeration<Integer> keys = hashtable.keys();
//         while (keys.hasMoreElements()) {
//             int key = keys.nextElement();
//             System.out.println(key + ": " + hashtable.get(key));
//         }

//         // Retrieving a value by its key
//         String value = hashtable.get(2);
//         System.out.println("\nValue associated with key 2: " + value);

//         // Updating a value associated with a key
//         hashtable.put(2, "Blueberry");
//         System.out.println("\nUpdated Hashtable after changing value of key 2:");
//         for (Integer key : hashtable.keySet()) {
//             System.out.println(key + ": " + hashtable.get(key));
//         }

//         // Removing a key-value pair
//         hashtable.remove(3);
//         System.out.println("\nHashtable after removing key 3:");
//         for (Integer key : hashtable.keySet()) {
//             System.out.println(key + ": " + hashtable.get(key));
//         }

//         // Checking if a key or value exists
//         boolean containsKey = hashtable.containsKey(4);
//         boolean containsValue = hashtable.contains("Date");
//         System.out.println("\nContains key 4: " + containsKey);
//         System.out.println("Contains value 'Date': " + containsValue);
//     }
// }




















// =========================================================================================================================================




// =========================================================================================================================================
