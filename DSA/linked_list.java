
// Till now, we were using array data structure to organize the group of similar  elements that are to be stored individually in the memory.

// ------------------------------------------------------- Array contains following limitations: ------------------------------------------------------- 

// 1.The size of array must be known in advance before using it in the program.
// 2.Increasing size of the array(Compile Time ) is a time taking process. ( n to 2n )
// Yes, in Java, the size of an array cannot be directly changed after it has been initialized. Once an array is created, 
// its size is fixed. However, you can achieve a similar effect by creating a new  temp array with the desired size and pointing the  old array  arr[]to the new one temp []. 
//  It is almost impossible to expand the size of the array at run time.
// 3.All the elements in the array need to be contiguously stored in the memory.
//  Inserting any element in the array needs shifting of all its predecessors.

// Ex -  suppose, we have 1000 elements and we have to store int = 9 ; at position 5. (5,9)
// To store 9 at position 5 , we have to first move 995 elements to next contiguous memory 
// arr[i+1]=array , and then store 9 at position 5 .

// Ex -  suppose, we have 1000 elements and we have to delete element at index [0] ;
// To delete at index [0] we simpily delete after delettion we have to move 999 elements to contiguous previous element 
// i.e. arr[i-1]=array ;

//-------------------------------------------------------  Why use linked list over array?------------------------------------------------------- 

//  Linked list is the data structure which can overcome all the limitations of an array. Using linked list is useful because,

//  1.It allocates the memory dynamically.
//   All the nodes of linked list are non-contiguously stored in the memory and linked together with the help of pointers.

// 2.Sizing is no longer a problem since we do not need to define its size at the time of declaration. 
// List grows as per the program's demand and limited to the available memory space

// Linked List

// Linked List can be defined as collection of objects called nodes that are randomly stored in the memory.
// A node contains two fields i.e. data stored at that particular address and the pointer .
// which contains the address of the next node in the memory.
// The last node of the list contains pointer to the null.

// TYpes of linked list 
// 1. single linked list -
// linked list in which every node includes some data and the address part, which means a pointer to the next node in the series.
//  In a singly linked list, we can perform operations like insertion, deletion, and traversal.
// data navigation is done only in one direction i.e. forward by using next field of node .

// 2. Double linked list - 
// When a node holds a data part and two addresses, it is known as a doubly-linked list. Two addresses means a pointer to the previous node and the next node.
//Data navigation in two direction either forward or backward , for forward next field of node is used and for backward previoous field of node is used .

// 3. Circular linked list -
// In a circular linked list, the last node of the series contains the address of the first node to make a circular chain.
//Similar to  Double linked list and only differnece is that  the last node next field in link with first field of the node .

// Basic Operations In Linked List
// When it comes to linked lists, there are five operations supported by the series or list.

// Traversal – Through this operation, we can access elements.
// Insertion – In this operation, elements can be added at the starting of the list.
// Deletion – In this operation, elements can be deleted at the starting of the list.
// Search – Through this operation, we can easily search for an element utilising the provided key.
// Sort – Through this operation, we can sort the nodes of the linked list.

// Advantages of Linked Lists
// A linked list is dynamic, which means it will provide memory whenever needed.
// In a linked list, we can swiftly execute the operations like insertion and deletion.
// We can easily implement stacks and queues.
// It helps in reducing the access time.

// Disadvantages of Linked Lists
// Sometimes the memory gets wasted because pointers need extra memory for storage.
// We can access elements in sequence. You cannot do this process in a random manner.
// In a linked list, reverse traversing is challenging.
// fecting the data in aaraay is simple o(1) ,  but in linkedlist O(n);

// public class linked_list {

//      public static class Node {
//         int data ; // khud ka value store karta hai // store value 
//         Node next ;  // aage walle node ka address store karta hai  // Address of next node 

//         Node(int data){             // constructor 
//              this.data = data ;
//         }

//     }

//     public static void main(String[] args) {
//         Node a = new Node(5) ;
//         System.out.println(a.next); // address print karna chata hu jo isne aalge waale ka stored kia hai .
//         // null kyuki abhi tak humne  b ke address ko a se linked kia hiii nhi hai 
//         Node b = new Node(3) ;
//         Node c = new Node(9) ;
//         Node d = new Node(8) ;
//         Node e = new Node(16) ;

//         System.out.println(a.data);// a ka data
//         System.out.println(a);  // a ka addres 

//         System.out.println(b.data); // b ka data
//         a.next= b ;  // b ke address ko a se linked kar dia a ko
//         System.out.println(a.next);  // address print karna chata hu  b ka jo a ne stored kara hai  // b ka addres 
//         System.out.println(b); // b ka address without even linked 

//         System.out.println(c.data); //  c ka data
//         b.next= c ;  // c ke address ko a se linked kar dia  b ko 
//         System.out.println(b.next); // address print karna chata hu  c ka jo b ne stored kara hai  // c ka addres 
//         System.out.println(c); // c ka address

//     }
// }
// -------------------------------------------------------------------------------------------------------------- 

// Q.1  Creating a linked_list

// ex-2 similar example with proper manner 
// public class linked_list {

//     public  static class Node{
//         int data ;
//         Node next ; 

//         Node (int data){
//             this.data = data ;

//         }

//     }

//     public static void main(String[] args) {
//         Node  a = new Node(1);
//         Node  b = new Node(10);
//         Node  c = new Node(100);
//         Node  d = new Node(1000);
//         Node  e = new Node(10000);

//         a.next = b ;
//         b.next = c ;
//         c.next = d ;
//         d.next = e ;

// print data 
// System.out.println(a.data);
// System.out.println(b.data);
// System.out.println(c.data);

// print address 
// System.out.println(a);
// System.out.println(b);
// System.out.println(a.next);
// System.out.println(b.next);

//  both 
// System.out.println(b.data);  //  b ka data
// System.out.println(a.next); // b ka addres 
// System.out.println(b); // b ka addres

//     }
// }

// -------------------------------------------------------------------------------------------------------------- 

// Q.1// Creating a linked_list

// ex-3 
// public class linked_list {

//     public  static class Node{
//         int data ;
// Node next ; 

//         Node (int data){   // constructor
//             this.data = data ;

//         }

//     }

//     public static void main(String[] args) {
//         Node  a = new Node(1);
//         Node  b = new Node(10);
//         Node  c = new Node(100);
//         Node  d = new Node(1000);
//         Node  e = new Node(10000);

// a.next = b ;
// b.next = c ;
// c.next = d ;
// d.next = e ;

// System.out.println(a.data);
// System.out.println(b.data);
// System.out.println(c.data);
// System.out.println(d.data);
// System.out.println(e.data);

// System.out.println(a.data+ "    Address-  " + a.next);
// System.out.println(b.data+ "   Address-   " + b.next);
// System.out.println(c.data+ "   Address-   " + c.next);
// System.out.println(d.data+ "   Address-   " + d.next);
// System.out.println(e.data);

// System.out.println(a.data);
// System.out.println(a.next.data);
// System.out.println(a.next.next.data);
// System.out.println(a.next.next.next.data);
// System.out.println(a.next.next.next.next.data);
// System.out.println(a.next.next.next.next.next.data);

//     }
// }

// -------------------------------------------------------------------------------------------------------------- 

// Q.1// Creating a linked_list
// // ex-4  for loop se print karwa rahe hai 

// public class linked_list {

//     public  static class Node{
//         int data ;
//         Node next ; 

//         Node (int data){
//             this.data = data ;

//         }

//     }

//     public static void main(String[] args) {
//         Node  a = new Node(1);
//         Node  b = new Node(10);
//         Node  c = new Node(100);
//         Node  d = new Node(1000);
//         Node  e = new Node(10000);

//         a.next = b ;
//         b.next = c ;
//         c.next = d ;
//         d.next = e ;

// loop se data print karwana hia 

// Node  temp = a ;  // naya data nhi bana hai // a bhi wahi point kar raha or temp bhi wahi point kar raha hai 
// for (int i = 1; i <=5; i++) {
//     System.out.print(temp.data + " ");
//      temp = temp.next ;
// }

// or 

// for (int i = 1; i <=5; i++) {
//     System.out.print(a.data + " ");
//      a = a.next ;
// }

//     }
// }
// -------------------------------------------------------------------------------------------------------------- 

// Q.1// Creating a linked_list

// ex-5 when only head is known  we don't know kitne elemets hai total

// public class linked_list {

//     public  static class Node{
//         int data ;
//         Node next ; 

//         Node (int data){
//             this.data = data ;

//         }

//     }

//     public static void main(String[] args) {
//         Node  a = new Node(1);
//         Node  b = new Node(10);
//         Node  c = new Node(100);
//         Node  d = new Node(1000);
//         Node  e = new Node(10000);

//         a.next = b ;
//         b.next = c ;
//         c.next = d ;
//         d.next = e ;

//         // loop se data print karwana hia 

//         Node temp = a ;
//         while (temp!=null) {
//             System.out.println(temp.data + " ");
//             temp = temp.next;

//         }  

//     }
// }

// -------------------------------------------------------------------------------------------------------------- 

// ex-6  by creating a function/ method  

// public class linked_list {

//     public static void  display(Node head){  // ek head ban gaya jo ki a ko point kar raha hai 
//         Node temp = head ;
//         while (temp!=null) {
//             System.out.print(temp.data+ " ");
//             temp = temp.next;
//         }

//     }

// ------------------------------------------------------------- 
//     public static void  display(Node a){
//         Node temp = a ;
//         while (temp!=null) {
//             System.out.print(temp.data+ " ");
//             temp = temp.next;
//         }

//     }
// ------------------------------------------------------------- 

//     public  static class Node{
//         int data ;
//         Node next ; 

//         Node (int data){
//             this.data = data ;

//         }

//     }

//     public static void main(String[] args) {
//         Node  a = new Node(1);
//         Node  b = new Node(10);
//         Node  c = new Node(100);
//         Node  d = new Node(1000);
//         Node  e = new Node(10000);

//         a.next = b ;
//         b.next = c ;
//         c.next = d ;
//         d.next = e ;

//     display(a);

//     }
// }
// -------------------------------------------------------------------------------------------------------------- 
// // ex-7 by recurively

// public class linked_list {

//     public static void  displayr(Node head){

//         if(head==null) return ; // return ka mtlb khtm karo 
//         System.out.print(head.data+ " ");
//         displayr(head.next);  

//     public  static class Node{
//         int data ;
//         Node next ; 

//         Node (int data){
//             this.data = data ;
//         }
//     }

//     public static void main(String[] args) {
//         Node  a = new Node(1);
//         Node  b = new Node(10);
//         Node  c = new Node(100);
//         Node  d = new Node(1000);
//         Node  e = new Node(10000);

//         a.next = b ;
//         b.next = c ;
//         c.next = d ;
//         d.next = e ;

//     displayr(a);
//     }
// }

// -------------------------------------------------------------------------------------------------------------- 
// Q.2  Insertion of a Node in Linked List(at Beginning,End,Specified Position)

// -------------------------------------------------------------------------------------------------------------- 
// Q.3 Delettion of a Node in Linked List(at Beginning,End,Specified Position)

// -------------------------------------------------------------------------------------------------------------- 
// Q.4 Sorting Node  of linked_list

// -------------------------------------------------------------------------------------------------------------- 

// Q.5 Remove duplicates Node in singly linked_list

// -------------------------------------------------------------------------------------------------------------- 

// -------------------------------------------------------------------------------------------------------------- 

// -------------------------------------------------------------------------------------------------------------- 

// -------------------------------------------------------------------------------------------------------------- 
// ex-7  Reverse print of linked_list 

// public class linked_list {

//     public static void  displayreverse(Node head){

//         if(head==null) return ;    
//          displayreverse(head.next);
//         System.out.print(head.data+ " "); // ye samjh nhi aaya kyuki recursion nhi aata apko
//     }
//     public  static class Node{
//         int data ;
//         Node next ; 

//         Node (int data){
//             this.data = data ; }
//     }

//     public static void main(String[] args) {
//         Node  a = new Node(1);
//         Node  b = new Node(10);
//         Node  c = new Node(100);
//         Node  d = new Node(1000);
//         Node  e = new Node(10000);

//         a.next = b ;
//         b.next = c ;
//         c.next = d ;
//         d.next = e ;

//     displayreverse(a);

//     }
// }
// -------------------------------------------------------------------------------------------------------------- 
// ex-8  find the length of a linked list 

// public class linked_list {

//     public static int  length(Node head) {
//         int count = 0 ;
//         while (head!=null) {
//            count++ ;
//             head = head.next ;

//         }
//         return count ;

//     }

//     public static class Node{
//         int data ;
//         Node next ;

//        Node(int data){
//         this.data = data ;

//        }

//     }

//     public static void main(String[] args) {
//         Node a  =  new Node(2) ;
//         Node b  =  new Node(3) ;
//         Node c =  new Node(4) ;
//         Node d  =  new Node(5) ;
//         Node e  =  new Node(44) ;

//         a.next =  b ;
//         b.next =  c ;
//         c.next =  d ;
//         d.next =  e ;

//         System.out.println(length(a));

//     }
// }

// -------------------------------------------------------------------------------------------------------------- 
// 1/28/12
// implementation of singly linkedlist in another way 
// --------------------------------------------------------------------------------------------------------------
// 1:28:19

// public class linked_list {
//         public static class Node {
//                 int data;
//                 Node next;

//                 Node(int data) {
//                         this.data = data;
//                 }
//         }
//         public static class linkedlist {
//                 Node head = null;
//                 Node tail = null;

//                 void insertAtend(int val) {
//                         Node temp = new Node(val); // temp name ka node baan gyaa jisme val vaalue store ho gayi
//                         if (head == null) {
//                                 head = temp;
//                                 tail = temp;
//                         } else {
//                                 tail.next = temp;
//                                 tail = temp;

//                         }

//                 }

//                 void display() {
//                         while (head != null) {
//                                 System.out.println(head.data + " ");
//                                 head = head.next;

//                         }
//                 }
//         }

//         public static void main(String[] args) {
//                 // int arr[]= new int [10] ;
//                 linkedlist ll = new linkedlist();
//                 ll.insertAtend(10);
//                 ll.insertAtend(11);

//                 ll.display();
//         }
// }