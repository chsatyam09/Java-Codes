

// import java.util.ArrayList;

// public class Collectionn_Framework {

//     public static void main(String[] args) {
//         // ArrayList<Integer> al = new ArrayList<>();
// yaha pe integer nhi integer ke object add kie hai
//         ArrayList al = new ArrayList();
//         al.add(10);  // yaha pe integer nhi integer ke object add kie hai
//         al.add(100);      // yaha pe integer nhi integer ke object add kie hai
//         al.add(1000);
//         al.add(10000);
//         al.add("Deepak");
//         al.add('c');
//         System.out.println(al);

//         ArrayList al2 = new ArrayList<>();
//         al2.add("hello");
//         al2.add("world");
//         System.out.println(al2);
//         al.addAll(al2);
//         System.out.println(al);



//         System.out.println(al.add(900));
//         System.out.println(al.contains(200));
//         System.out.println(al.isEmpty());
//         // System.out.println(al.remove(100));   // nhi chalega index hata raha hai na ki value 
//         System.out.println(al.remove("Deepak"));   //  chalega kyu String ek object hai wo direct delete kar dega 
//         System.out.println(al.remove(0));
//         System.out.println(al.remove("Deppak"));
//         System.out.println(al.size());


//     }
// }


// Difference Between List and Set in Java

// {
//     // List declaration
//     List<Integer> list = new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(5);
//     list.add(4);
    
//     System.out.println("List = " + list);
//     }


// // Set declaration
// Set<Integer> s = new HashSet<>();
// s.add(1);
// s.add(2);
// s.add(3);
// s.add(5);
// s.add(4);

//     System.out.println("s = " + s);
//     }




// --------------------------------------------------------  Enumeration ---------------------------------------------------------

// import java.util.*;

// class abc{
// 	public static void main(String args[]){
// 		Vector v=new Vector();
// 		v.add("Abhishek");
// 		v.add("Harshit");
// 		v.add("Shruti");
// 		v.add("Pranav");
// 		v.add("Arpit");
// 		v.add("Ishika");
//         //Create enumeration object
// 		Enumeration e=v.elements();
// 	    // apply enumeration methods
// 		while(e.hasMoreElements()){
// 			System.out.println(e.nextElement());
// 		}
// 	}
// }


// 2.  
// --------------------------------------------------------  Iterator Cursor--------------------------------------------------------------

// import java.util.*;

// class Collectionn_Framework{

// 	public static void main(String args[]){
// 		ArrayList list=new ArrayList();
// 		list.add("Abhishek");
// 		list.add("Harshit");
// 		list.add("Shruti");
// 		list.add("Pranav");
// 		list.add("Arpit");
// 		list.add("Ishika");

//         //Create iterator object
// 		Iterator  itr=list.iterator();
// 	    // apply Iterator  methods
// 		while(itr.hasNext()){
// 			String str=String.valueOf(itr.next());
// 			if(str.equals("Abhishek")){
// 				// apply remove method
// 				itr.remove();
// 			}
// 			else{
// 				System.out.println(str);
// 			}
// 		}
// 		// Updated list
// 		System.out.println("List:"+list);
// 	}
// }

// 
// 3.  --------------------------------------------------------   ListIterator Cursor --------------------------------------------------------------


// import java.util.*;

// class Collectionn_Framework{

// 	public static void main(String args[]){
// 		ArrayList list=new ArrayList();
// 		list.add("Abhishek");
// 		list.add("Harshit");
// 		list.add("Shruti");
// 		list.add("Pranav");
// 		list.add("Arpit");
// 		list.add("Ishika");

//         //Create ListIterator object
// 		ListIterator itr=list.listIterator();
// 	    // ListIterator forward direction methods,remove() and add() method

// 		System.out.println("List is:");
// 		while(itr.hasNext()){
// 			String str=String.valueOf(itr.next());
// 			System.out.println(str);
// 			if(str.equals("Abhishek")){
// 				// remove method
// 				itr.remove();
// 			}
// 			else if(str.equals("Pranav")){
// 				itr.remove();
// 				// add method
// 				itr.add("Reena");
// 			}
// 		}

// 		// Updated list
// 		System.out.println("List:"+list);

// 		System.out.println("List is:");
// 		// ListIterator backward direction methods and add() method
// 		while(itr.hasPrevious()){
// 		String str=String.valueOf(itr.previous());
// 			System.out.println(str);
// 			if(str.equals("Arpit")){
// 				// set method
// 				itr.set("Manu");
// 			}
// 		}
// 		// Updated list
// 		System.out.println("List:"+list);
// 	}
// }



// --------------------------------------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------------------------------

// list - ArrayList, LinkedList, Vector, and Stack.

// ArrayList



// ex-1 

//  import java.util.*;  
// class  Collectionn_Framework{  
// public static void main(String args[]){  
//     // ArrayList<String> list=new ArrayList<String>();                 //Creating arraylist  
//  //   ArrayList list=new ArrayList(6);                                    //Creating arraylist  
//     ArrayList list=new ArrayList();                                    //Creating arraylist  
//     list.add("Ravi");            //Adding object in arraylist  
//     list.add("Vijay");  
//     list.add("Ravi");  
//     list.add("Ajay");  

// // Traversing list through Iterator  
// Iterator itr=list.iterator();     //  Iterator Cursor
// while(itr.hasNext()){            //    hasNext() - This method checks whether more elements are present inside the collection or not.
// System.out.println(itr.next());  
// }  

// or 
// System.out.println(list);

// }  
// } 

// ex-2 

// import java.util.*;  
// class  Collectionn_Framework{  
// public static void main(String args[]){  
// ArrayList<Integer> list=new ArrayList<Integer>();                    //Creating arraylist  
// list.add(1);//Adding object in arraylist  
// list.add(2);//Adding object in arraylist  
// list.add(3);//Adding object in arraylist  

// //Traversing list through Iterator  
// Iterator itr=list.iterator();    // Iterator Cursor
// while(itr.hasNext()){  
// System.out.println(itr.next());  
// }  
// }  
// } 

// ex-3 



// --------------------------------------------------------------------------------

// LinkedList
// LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. 
// It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.

// import java.util.*;  
// public class Collectionn_Framework {  
// public static void main(String args[]){  
// LinkedList<String> al=new LinkedList<String>();  
// al.add("Ravi");  
// al.add("Vijay");  
// al.add("Ravi");  
// al.add("Ajay");  
// Iterator<String> itr=al.iterator();  
// while(itr.hasNext()){  
// System.out.println(itr.next());  
// }  
// }  
// }  

// --------------------------------------------------------------------------------

// Vector
// Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However,
//  It is synchronized and contains many methods that are not the part of Collection framework.

 

// import java.util.*;  
// public class TestJavaCollection3{  
// public static void main(String args[]){  
// Vector<String> v=new Vector<String>();  
//  // Vector v = new Vector();
// v.add("Ayush");  
// v.add("Amit");  
// v.add("Ashish");  
// v.add("Garima");  
// Iterator<String> itr=v.iterator();  
// while(itr.hasNext()){  
// System.out.println(itr.next());  
// }  
// }  
// }  

// --------------------------------------------------------------------------------

// Stack
// The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. 
// The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

// Consider the following example.

// import java.util.*;  
// public class TestJavaCollection4{  
// public static void main(String args[]){  
// Stack<String> stack = new Stack<String>();  
// stack.push("Ayush");  
// stack.push("Garvit");  
// stack.push("Amit");  
// stack.push("Ashish");  
// stack.push("Garima");  
// stack.pop();  
// Iterator<String> itr=stack.iterator();  
// while(itr.hasNext()){  
// System.out.println(itr.next());  
// }  
// }  
// }  

// --------------------------------------------------------------------------------// --------------------------------------------------------------------------------
// HashSet 

// import java.util.*;  
// class HashSet1{  
//  public static void main(String args[]){  
//   //Creating HashSet and adding elements  
//     HashSet<String> set=new HashSet();  
//            set.add("One");    
//            set.add("Two");    
//            set.add("Three");   
//            set.add("Four");  
//            set.add("Five");  
//            Iterator<String> i=set.iterator();  
//            while(i.hasNext())  
//            {  
//            System.out.println(i.next());  
//            }  
//  }  
// }

// Treeset 


