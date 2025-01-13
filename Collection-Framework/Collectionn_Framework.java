

// --------------------------------------- ArrayList ---------------------------------------
// ArrayList allows duplicate values to be added to it and maintains its insertion order.

// import java.util.ArrayList;
// import java.util.List;
// public class Collectionn_Framework {

//     public static void main(String[] args) {
//         ArrayList ALL = new ArrayList();
//         ArrayList<Integer> AL = new ArrayList<Integer>();
//         ArrayList<String> AL1 =new ArrayList<String>();
//         List<Integer>list = new ArrayList<Integer>();
        

        
//     }
// }
// ---------------------------------------------------------------------
// Operations :

// Declare an ArrayList of different Types
// Add Element
// Add Element at a specific Index
// Set Element at a specific Index
// Get Element
// Delete Element from an Index
// clear Removes all elements from the list.
// Size of the List
// Loop/Iterate on the List
// Sort the List
// ---------------------------------------------------------------------
// import java.util.ArrayList;
// import java.util.Collections;
// public class Collectionn_Framework  {
//    public static void main(String args[]) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list2 = new ArrayList<String>();
//        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
      
//        //add elements
//        list.add(1);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);


//        //to get an element
//        int element = list.get(0); // 0 is the index
//        System.out.println(element);


//        //add element in between
//        list.add(1,2); // 1 is the index and 2 is the element to be added
//        System.out.println(list);


//        //set element
//        list.set(0,0);
//        System.out.println(list);


//        //delete elements
//        list.remove(0); // 0 is the index
//        System.out.println(list);


//        //size of list
//        int size = list.size();
//        System.out.println(size);


//        //Loops on lists
//        for(int i=0; i<list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();


//        //Sorting the list
//        list.add(0);
//        Collections.sort(list);
//        System.out.println(list);
//    }
// }

// ---------------------------------------------------------------------------------------------------------------------

// import java.util.ArrayList;
// import java.util.Collections;

// public class Collectionn_Framework {

//     public static void main(String[] args) {
//         // ArrayList<Integer> al = new ArrayList<Integer>();
// // yaha pe integer nhi integer ke object add kie hai
//         ArrayList al = new ArrayList();
//         al.add(10);  // yaha pe integer nhi integer ke object add kie hai collection doesn't support primitive Values
//         al.add(100);      // yaha pe integer nhi integer ke object add kie hai
//         al.add(1000);
//         al.add(1,10000);  // integer ke onjects 
//         al.add("Deepak");
//         al.add('c');
//         al.set(0, "papa");
//         System.out.println(al);
//         System.out.println(al.get(0));
//         al.remove(0); // remove only 1 element 
//         System.out.println(al);

//         int size = al.size();
//         System.out.println(size);

        
//         // Collections.sort(al);
//         for (int i = 0; i < al.size(); i++) {
//             System.out.print(al.get(i)+ " ");
            
//         }
    
//         System.out.println("----------------------");

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

//         al.clear(); // to remove all elements in one go 


//     }
// }

// ---------------------------------------------------------------------------------------------------------------------



// --------------------------------------------------------  Enumeration ---------------------------------------------------------
// Enumeration is used to retrieve elements from the collection one by one
// It is applicable for legacy classes.i.e vector and stack ;
// Enumeration e = v.elements(); 

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
// 		Enumeration<String> e=v.elements();
// 	    // apply enumeration methods
// 		while(e.hasMoreElements()){
// 			System.out.println(e.nextElement());
// 		}
// 	}
// }



// 2.  
// --------------------------------------------------------  Iterator Cursor--------------------------------------------------------------

// An iterator is used to retrieve elements from the collection one by one. 


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

// The listiterator is also used to retrieve elements from the collection one by one. 

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

//         System.err.println(list);
//         System.out.println("-------------------------------------");
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
// 		System.out.println("UPDATED List:"+list); // Updated list

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


// ex-1.1 

// import java.util.ArrayList;
// import java.util.Arrays;

// public class Collectionn_Framework {
//     public static void main(String[] args) {
//         // Creating an ArrayList with elements 1, 2, 3, 4, 5, 6, 6 using Arrays.asList
//         ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6));

//         // Printing the ArrayList elements
//         System.out.println("ArrayList:");
//         for (int element : arrayList) {
//             System.out.print(element + " ");
//         }
//     }
// }


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

//     System.out.println(list);
// // Traversing list through Iterator  
// Iterator itr=list.iterator();     //  Iterator Cursor
// while(itr.hasNext()){            //    hasNext() - This method checks whether more elements are present inside the collection or not.
// System.out.println(itr.next());   // next()- this method print the value 
// }  
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

// ----------------------------------------linked list implements queue ----------------------------------------
// import java.util.LinkedList;
// import java.util.Queue;

// public class Collectionn_Framework {
//     public static void main(String[] args) {
//         // Create a LinkedList that implements the Queue interface
//         Queue<String> queue = new LinkedList<>();

//         // Adding elements to the queue
//         queue.offer("Apple");
//         queue.offer("Banana");
//         queue.offer("Cherry");

//         // Display the queue
//         System.out.println("Queue: " + queue);

//         // Accessing the head of the queue
//         System.out.println("Head of the queue (peek): " + queue.peek());

//         // Removing elements from the queue
//         System.out.println("Removed from queue (poll): " + queue.poll());
//         System.out.println("Removed from queue (poll): " + queue.poll());

//         // Display the queue after removals
//         System.out.println("Queue after removals: " + queue);

//         // Accessing the head of the queue after removals
//         System.out.println("Head of the queue after removals (peek): " + queue.peek());
//     }
// }

// ----------------------------------------linked list implements deque -----------------------------------------
// import java.util.LinkedList;
// import java.util.Deque;

// public class Collectionn_Framework {
//     public static void main(String[] args) {
//         // Create a LinkedList that implements the Deque interface
//         Deque<String> deque = new LinkedList<>();

//         // Adding elements to both ends of the deque
//         deque.addFirst("Apple");
//         deque.addLast("Banana");
//         deque.addLast("Cherry");
//         deque.addFirst("Mango");

//         // Display the deque
//         System.out.println("Deque: " + deque);

//         // Accessing elements from both ends
//         System.out.println("First element (peekFirst): " + deque.peekFirst());
//         System.out.println("Last element (peekLast): " + deque.peekLast());

//         // Removing elements from both ends
//         System.out.println("Removed from front (removeFirst): " + deque.removeFirst());
//         System.out.println("Removed from end (removeLast): " + deque.removeLast());

//         // Display the deque after removals
//         System.out.println("Deque after removals: " + deque);

//         // Adding more elements to both ends
//         deque.offerFirst("Pineapple");
//         deque.offerLast("Grapes");

//         // Display the deque after adding more elements
//         System.out.println("Deque after adding more elements: " + deque);
//     }
// }




// --------------------------------------------------------------------------------

// Vector
// Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However,
//  It is synchronized and contains many methods that are not the part of Collection framework.

// import java.util.Vector;

// public class Collection_framework_Revison {

//     public static void main(String[] args) {
//         Vector v  = new Vector<>();
//         v.add("Satyam");
//         v.add(12);
//         v.add("Satyam raj");
//         v.add("Satyam choudhary ");
//         v.add(24);

//         System.out.println(v);

//     }
// }


// import java.util.*;  
// public class Collection_framework{  
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

// In summary:
// Vector: Suitable for multi-threaded environments where thread safety is a concern. Slower in single-threaded environments due to synchronization overhead.
// ArrayList: Faster in single-threaded environments due to lack of synchronization overhead. Not thread-safe, requires explicit synchronization in multi-threaded environments.


// --------------------------------------------------------------------------------

// Stack
// The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. 
// The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

// Consider the following example.

// import java.util.*;  
// public class Collectionn_Framework{  
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

// import java.util.*;

// public class StackJCF {
//     public static void main(String args[]) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);

//         while(!stack.isEmpty()) {
//             System.out.println(stack.peek());
//             stack.pop();
//         }
//     }
// }


// import java.util.ArrayList;

// public class Collectionn_Framework {
//     static class Stack {
//         ArrayList<Integer> list = new ArrayList<>();

//         public void push(int data) {
//             list.add(data);
//         }

//         public boolean isEmpty() {
//             return list.size() == 0;
//         }

//         public int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             int top = list.remove(list.size()-1);
//             return top;
//         }

//         public int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String args[]) {
//         Stack stack = new Stack();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);

//         while(!stack.isEmpty()) {
//             System.out.println(stack.peek());
//             stack.pop();
//         }
//     }
// }


// Q.1 //To push an element at the bottom of a stack

// import java.util.*;

// public class Collectionn_Framework {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }

//         int temp = s.pop();
//         pushAtBottom(s, data); // Recursion
//         s.push(temp);
//     }

//     public static void main(String args[]) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         pushAtBottom(stack, 4);

//         while(!stack.isEmpty()) {
//             System.out.println(stack.pop());
//         }
//     }
// }

// Q.2 //Code to Reverse a Stack

// import java.util.*;
// public class Collectionn_Framework {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }

//         int temp = s.pop();
//         pushAtBottom(s, data);
//         s.push(temp);
//     }

//     public static void reverse(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }

//         int top = s.pop();
//         reverse(s);
//         pushAtBottom(s, top);
//     }

//     public static void main(String args[]) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);

//         while(!stack.isEmpty()) {
//             System.out.println(stack.pop());
//         }
//     }
// }


// --------------------------------------------------------------------------------// --------------------------------------------------------------------------------
// HashSet 

// import java.util.*;  
// class Collectionn_Framework{  
//  public static void main(String args[]){  
//   //Creating HashSet and adding elements  
//     HashSet<String> set=new HashSet();  
//            set.add("One");    
//            set.add("Two");    
//            set.add("Three");   
//            set.add("Four");  
//            set.add("Five");  
//            Iterator<String> it=set.iterator();  
//            while(it.hasNext())  
//            {  
//            System.out.println(i.next());  
//            }  
//  }  
// }

// import java.util.HashSet;
// import java.util.Set;

// public class Collectionn_Framework{
//     public static void main(String[] args) {
//         // Create a HashSet
//         Set<String> set = new HashSet<>();

//         // Adding elements to the HashSet
//         set.add("Apple");
//         set.add("Banana");
//         set.add("Cherry");
//         set.add("Apple"); // Duplicate element, will not be added

//         // Display the HashSet
//         System.out.println("HashSet: " + set); // Output might be: [Apple, Banana, Cherry]

//         // Checking if an element exists
//         boolean containsBanana = set.contains("Banana");
//         System.out.println("Contains Banana: " + containsBanana); // Output: true

//         // Removing an element
//         set.remove("Cherry");
//         System.out.println("HashSet after removal: " + set); // Output might be: [Apple, Banana]

//         // Checking if the HashSet is empty
//         boolean isEmpty = set.isEmpty();
//         System.out.println("Is HashSet empty? " + isEmpty); // Output: false

//         // Getting the size of the HashSet
//         int size = set.size();
//         System.out.println("Size of HashSet: " + size); // Output: 2
//     }
// }

// --------------------------------------------------------------------------------// --------------------------------------------------------------------------------
// Treeset 

// import java.util.TreeSet;
// import java.util.Set;

// public class Collection_framework {
//     public static void main(String[] args) {
//         // Create a TreeSet
//         Set<String> treeSet = new TreeSet<>();

//         // Adding elements to the TreeSet
//         treeSet.add("Apple");
//         treeSet.add("Banana");
//         treeSet.add("Cherry");
//         treeSet.add("Date");

//         // Display the TreeSet
//         System.out.println("TreeSet: " + treeSet); // Output: [Apple, Banana, Cherry, Date]

//         // Checking if an element exists
//         boolean containsBanana = treeSet.contains("Banana");
//         System.out.println("Contains Banana: " + containsBanana); // Output: true

//         // Removing an element
//         treeSet.remove("Cherry");
//         System.out.println("TreeSet after removal: " + treeSet); // Output: [Apple, Banana, Date]

//         // Finding the first and last elements
//         String first = treeSet.first();
//         String last = treeSet.last();
//         System.out.println("First element: " + first); // Output: Apple
//         System.out.println("Last element: " + last); // Output: Date

//         // Navigating to the lower and higher elements
//         String lower = treeSet.lower("Cherry"); // Element less than "Cherry" (not found)
//         String higher = treeSet.higher("Banana"); // Element greater than "Banana"
//         System.out.println("Lower than Cherry: " + lower); // Output: Banana
//         System.out.println("Higher than Banana: " + higher); // Output: Date

//         // Subset of elements
//         Set<String> subset = ((TreeSet<String>) treeSet).subSet("Apple", true, "Date", false);
//         System.out.println("Subset from Apple to Date: " + subset); // Output: [Apple, Banana]
//     }
// }
// --------------------------------------------------------------------------------// --------------------------------------------------------------------------------
// 