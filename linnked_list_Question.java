// try to make minimal changes in given code and correct this code and please
// highlight the error in code by using comments

// Q.1 Creating and printing a linkelist

// public class linnked_list_Question {

// public static class Node {
// int data ;
// Node next ;

// Node(int data){
// this.data = data ;
// this.next = null ;
// }
// }

// public static void main(String[] args) {
// Node a = new Node(10);
// Node b = new Node(100);
// Node c = new Node(1000);
// Node d = new Node(10000);
// Node e = new Node(100000);

// Node head = a ;

// a.next = b ;
// b.next = c ;
// c.next = d ;
// d.next = e ;

// Node current = head ;
// while(current!=null){
// System.out.print(current.data + " ");
// current = current.next ;
// }

// }
// }

// ================================================================== Another
// method ==================================================================

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;
// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();

// ll.head = new Node(10);
// ll.head.next = new Node(100);
// ll.head.next.next = new Node(100);
// ll.head.next.next.next = new Node(1000);

// Node current = ll.head; // Use ll.head instead of head
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// }
// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q>2.1 How To Add An Element To Linked List
// CASE -1 WHEN linkedlist is empty
// CASE -2 WHEN linkedlist is not empty then (at last) ;

// public class linnked_list_Question {
// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// }
// }

// public static class linkedlist {
// Node head = null;
// Node tail = null;

// void insertAtend(int val) { // inserton at end
// Node temp = new Node(val); // temp name ka node baan gyaa jisme val vaalue
// store ho gayi
// if (head == null) {
// head = temp;
// tail = temp;
// } else {
// tail.next = temp;
// tail = temp;

// }

// }

// void display() {
// while (head != null) {
// System.out.println(head.data + " ");
// head = head.next;

// }
// }
// }

// public static void main(String[] args) {
// // int arr[]= new int [10] ;
// linkedlist ll = new linkedlist();
// ll.insertAtend(10);
// ll.insertAtend(11);

// ll.display();
// }
// }

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q>2.2 How To Add An Element To Linked List
// CASE -1 WHEN linkedlist is empty
// CASE -2 WHEN linkedlist is not empty then (at beginning) ;

// public class linnked_list_Question {
// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class linkedlist {
// Node head = null;
// Node tail = null;

// void insertAtHead(int val) { // insertion at head

// Node temp = new Node(val);
// if (head == null) {
// head = temp;
// tail = temp;
// } else {
// temp.next = head ;
// head = temp;
// }
// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.println(current.data + " ");
// current = current.next;
// }

// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist();
// ll.insertAtHead(10);
// ll.insertAtHead(11);

// ll.display();

// }
// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q>2.3 How To Add An Element To Linked List
// CASE -1 WHEN linkedlist is empty
// CASE -2 WHEN linkedlist is not empty then (at given index)

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class linkedlist {
// Node head = null;
// Node tail = null;

// void insertAtIndex(int idx, int val) {
// Node t = new Node(val);
// Node temp = head;
// // for (int i = 0; i <=idx-1; i++) {
// for (int i = 0; i < idx-1; i++) { // ye condition tooh satisfied hii nhi ho
// rahi hai
// temp = temp.next;

// }

// t.next = temp.next; // temp.next = t.next ;
// temp.next = t; // t = temp.next ;

// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// }
// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist();
// ll.head = new Node(1097);
// ll.head.next = new Node(112);
// ll.head.next.next = new Node(237868);
// ll.head.next.next.next = new Node(43898);
// // ll.head.next.next = new Node(68);

// ll.display();
// System.out.println();

// ll.insertAtIndex(1, 26);

// ll.display();
// }
// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// final - 2.1,2.2.,2.3
// How To Add An Element To Linked List
// WHEN linkedlist is Not empty (at Beginning,End,Specified Position);
// Q.2 Insertion of a Node in Linked List(at Beginning,End,Specified Position);

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;

// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;

// void insertAtend(int val) { //End
// Node temp = new Node(val);
// if (head == null) {
// head = temp;
// tail = temp;

// } else {

// tail.next = temp;
// tail = temp;
// }
// }

// void insertAtHead(int val) { // beginning
// Node temp = new Node(val);
// if (head == null) {
// head = temp;
// tail = temp;
// } else {

// temp.next = head;
// head = temp;
// }
// }

// void insertAtIndex(int idx, int val) { // any specified postion
// Node t = new Node(val);
// Node temp = head;
// for (int i = 0; i <= idx - 1; i++) {
// temp = temp.next;

// }
// t.next = temp.next;
// temp.next = t;
// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// }

// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();
// ll.insertAtend(10); // 10
// // ll.display();
// ll.insertAtend(1000); // 10,1000
// // ll.display();
// ll.insertAtend(10111); // 10,1000,10111
// // ll.display();

// ll.insertAtHead(20); // 20,10,1000,10111
// // ll.display();

// ll.insertAtIndex(1, 123); // 20,123,10,1000,10111

// ll.display();

// }
// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.3. Delettion of a Node in Linked List(at Beginning,End,Specified Position);

// 2:38:54

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class linkedlist {
// Node head = null;
// Node tail = null;

// //
// -----------------------------------------------------------------------------------------------------------------

// void deleteAt(int idx) {
// if (idx == 0) {
// head = head.next;
// }
// Node temp = head;
// // for (int i = 0; i <= idx - 1; i++) { // ye kyu work nhi kar raha
// for (int i = 0; i < idx - 1; i++) { // ye condition tooh satisfied hii nhi ho
// rahi hai
// temp = temp.next;

// }
// temp.next = temp.next.next;
// tail = temp;

// }

// //
// //
// -----------------------------------------------------------------------------------------------------------------

// // void deleteAt(int idx) {
// // Node temp = head;
// // for (int i = 0; i < idx - 1; i++) {
// // temp.next=temp.next.next;
// // tail = temp;

// // }
// // }
// //
// -----------------------------------------------------------------------------------------------------------------

// // void deleteAt(int idx) {
// // Node temp = head;
// // for (int i = 0; i < idx - 1; i++) {
// // temp=temp.next;

// // }
// // temp.next = temp.next.next;
// // tail = temp;
// // }

// //
// //
// -----------------------------------------------------------------------------------------------------------------

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;

// }
// }
// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist();
// ll.head = new Node(10);
// ll.head.next = new Node(11);
// ll.head.next.next = new Node(12);
// ll.head.next.next.next = new Node(13);

// ll.display();
// System.out.println();

// ll.deleteAt(1);

// ll.display();
// }

// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.4 Sorting Node of linked_list

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.5 Remove duplicates Node in singly linked_list
// 1. sorted linkedlist ;

// 2. unsorted linkedlist ;

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// // // Q.6 Searching node in a LinkedList or Getelement in a linkelist

// element dalo ye bata de kon se index pe hai

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;

// void getElement(int val) {
// Node temp = head;
// int index = 0;

// while (temp != null) {
// if (val == temp.data) {
// System.out.println("Element found at index: " + index);
// return; // Exit the method once the element is found
// }
// temp = temp.next;
// index++;
// }

// System.out.println("Element not present in the linked list");
// }
// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();

// ll.head = new Node(10);
// ll.head.next = new Node(100);
// ll.head.next.next = new Node(1009);
// ll.head.next.next.next = new Node(1000);

// Node current = ll.head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }

// System.out.println();
// ll.getElement(1009); // Example: Search for the element 100
// }
// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// // Q.7 Size of a LinkedList

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;

// int size() {
// int count = 0;
// Node temp = head;
// while (temp != null) {
// count++;
// temp = temp.next;
// }
// return count;
// }

// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();

// ll.head = new Node(10);
// ll.head.next = new Node(100);
// ll.head.next.next = new Node(100);
// ll.head.next.next.next = new Node(1000);

// Node current = ll.head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }

// System.out.println("\nSize of the linked list: " + ll.size());
// }
// }

// =======================================================================================================================================--------------------------------------------------------------------------------------------------------------
// 5 hour lecture started

// Q.1 can we delete a node given node itself as a parameter ? Is there any
// efficient way , provided that the given node is not the last node ?

// THS IS NOT WORKING

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;
// }

// // Delete a given node (assuming it is not the last node)

// static void deleteNode(Node nodeToDelete) {
// if (nodeToDelete != null && nodeToDelete.next != null) {
// nodeToDelete.data = nodeToDelete.next.data;
// nodeToDelete.next = nodeToDelete.next.next;
// }
// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();

// // Example: Creating a linked list with nodes
// ll.head = new Node(1);
// ll.head.next = new Node(2);
// ll.head.next.next = new Node(3);
// ll.head.next.next.next = new Node(4);
// ll.head.next.next.next.next = new Node(5);

// // Deleting the node with data 4 (assuming it is not the last node)
// Node nodeToDelete = ll.head.next.next.next; // Node with data 4
// ll.deleteNode(nodeToDelete);

// // Displaying the updated linked list
// Node current = ll.head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// }
// }

// // ============================================================ Another
// solution ==================================================================

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;
// }

// // Delete a given node (assuming it is not the last node)
// void deleteNode(Node val) {
// if (val != null && val.next != null) {
// val.data = val.next.data;
// val.next = val.next.next;
// }

// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();

// // Example: Creating a linked list with nodes
// ll.head = new Node(1);
// ll.head.next = new Node(2);
// ll.head.next.next = new Node(3);
// ll.head.next.next = new Node(4);
// ll.head.next.next = new Node(5);

// // Deleting the node with data 2 (assuming it is not the last node)

// ll.deleteNode(4);

// // Displaying the updated linked list
// Node current = ll.head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// }
// }

// //
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Q.2 Find the Nth node form the starting of the linkedlist .. return node
// only head is given

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {

// Node head = null;
// Node tail = null;

// Node getElement(int idx) {
// Node temp = head;
// for (int i = 0; i < idx; i++) {
// if (temp == null) {
// throw new IndexOutOfBoundsException("Index " + idx + " is out of bounds");
// }
// temp = temp.next;
// }

// return temp;
// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {

// LinkedList ll = new LinkedList();

// ll.head = new Node(1190);
// ll.head.next = new Node(12870);
// ll.head.next.next = new Node(1470);
// ll.head.next.next.next = new Node(17840);

// ll.display();

// ll.getElement(1); // Fix: Store the result in a variable // not working

// Node nthNode = ll.getElement(1); // Fix: Store the result in a variable

// if (nthNode != null) {
// System.out.println("Value of the 1st node: " + nthNode.data);
// } else {
// System.out.println("Node not found.");
// }
// }
// }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// // Q.2.1 Find the Nth node form the end of the linkedlist .. return node
// // only head is given

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {

// Node head = null;
// Node tail = null;

// int size() {
// int count = 0;
// Node temp = head;
// while (temp != null) {
// count++;
// temp = temp.next;
// }
// return count;
// }

// Node getElementFromEnd(int idx) {
// int listSize = size();
// if (idx <= 0 || idx > listSize) {
// throw new IndexOutOfBoundsException("Index " + idx + " is out of bounds");
// }

// Node temp = head;
// for (int i = 0; i < listSize - idx+1; i++) {
// temp = temp.next;
// }

// return temp;
// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {

// LinkedList ll = new LinkedList();
// ll.head = new Node(11980);
// ll.head.next = new Node(134780);
// ll.head.next.next = new Node(14780);
// ll.head.next.next.next = new Node(1280);
// ll.head.next.next.next.next = new Node(11230);

// ll.display();

// int x = ll.size();
// System.out.println("Size of the linked list: " + x);

// Node nthNodeFromEnd = ll.getElementFromEnd(3);
// if (nthNodeFromEnd != null) {
// System.out.println("Value of the 3rd node from the end: " +
// nthNodeFromEnd.data);
// } else {
// System.out.println("Node not found.");
// }
// }
// }

// ======================================= Another method for intervview
// ==================================================================
// ==================================================================

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;

// Node getElementFromEnd(int idx) {
// Node slow = head;
// Node fast = head;

// // Move the fast pointer ahead by n steps
// for (int i = 0; i <=idx-1 ; i++) {
// fast = fast.next;
// }

// // Move both pointers until the fast one reaches the end
// while (fast != null) {
// slow = slow.next;
// fast = fast.next;
// }

// return slow;
// }

// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();
// ll.head = new Node(11980);
// ll.head.next = new Node(134780);
// ll.head.next.next = new Node(14780);
// ll.head.next.next.next = new Node(1280);
// ll.head.next.next.next.next = new Node(11230);

// // Example: Finding the 3rd node from the end
// int n = 3;
// Node nthNodeFromEnd = ll.getElementFromEnd(n);

// if (nthNodeFromEnd != null) {
// System.out.println("Value of the " + n + "rd node from the end: " +
// nthNodeFromEnd.data);
// } else {
// System.out.println("Node not found.");
// }
// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.3 Removing Nth node from the Starting of linkedlist .

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class linkedlist {
// Node head = null;
// Node tail = null;

// void deleteAtHead(int idx) {
// Node temp = head;
// for (int i = 0; i < idx - 1; i++) {
// temp = temp.next;
// }
// temp.next = temp.next.next;

// }

// void display() {
// Node current = head;

// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;

// }
// }

// }

// public static void main(String[] args) {

// linkedlist ll = new linkedlist();
// ll.head = new Node(17380);
// ll.head.next = new Node(1078);
// ll.head.next.next = new Node(12890);
// ll.head.next.next.next = new Node(1980120);
// ll.head.next.next.next.next = new Node(453120);
// ll.head.next.next.next.next.next = new Node(162720);
// ll.head.next.next.next.next.next.next = new Node(880120);

// ll.display();
// System.out.println();

// ll.deleteAtHead(3);

// ll.display();

// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q.3 Removing Nth node from the End of linkedlist .

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;

// int size() {
// int count = 0;
// Node temp = head;
// while (temp != null) {
// count++;
// temp = temp.next;
// }
// return count;
// }

// void deleteAtTail(int idx) {
// Node temp = head;
// int listSize = size();

// for (int i = 0; i < listSize - idx; i++) {
// temp = temp.next;
// }

// if (temp.next != null) {
// temp.next = temp.next.next;
// }
// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// }
// }

// public static void main(String[] args) {

// LinkedList ll = new LinkedList();

// ll.head = new Node(17380);
// ll.head.next = new Node(1078);
// ll.head.next.next = new Node(12890);
// ll.head.next.next.next = new Node(1980120);
// ll.head.next.next.next.next = new Node(162720);
// ll.head.next.next.next.next.next = new Node(880120);

// int sizeBeforeDeletion = ll.size();
// System.out.println("Size before deletion: " + sizeBeforeDeletion);
// ll.display();
// System.out.println();

// ll.deleteAtTail(3);

// ll.display();

// int sizeAfterDeletion = ll.size();
// System.out.println("\nSize after deletion: " + sizeAfterDeletion);
// }
// }

// ==================================================================== Another
// method for interview ==========================================

// public class linnked_list_Question {
// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }
// public static class LinkedList {
// Node head = null;
// Node tail = null;

// void deleteAtTail(int idx) {
// Node slow = head;
// Node fast = head;

// for (int i = 0; i < idx; i++) {
// fast = fast.next;
// }

// while ( fast.next != null) {
// slow = slow.next;
// fast = fast.next;
// }
// slow.next = slow.next.next;
// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {

// LinkedList ll = new LinkedList();
// ll.head = new Node(17380);
// ll.head.next = new Node(1078);
// ll.head.next.next = new Node(12890);
// ll.head.next.next.next = new Node(1980120);
// ll.head.next.next.next.next = new Node(6783120);
// ll.head.next.next.next.next.next = new Node(162720);
// ll.head.next.next.next.next.next.next = new Node(880120);

// ll.display();
// System.out.println();
// ll.deleteAtTail(3); // 7th element delete nhi hoga
// ll.display();
// }
// }

// ==================================================================== Another
// method for interview ==========================================

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;

// // Fix: Change return type to Node
// Node deleteAtTail(int idx) {
// Node slow = head;
// Node fast = head;

// for (int i = 0; i < idx; i++) { // Fix: Change loop condition to <
// if (fast == null) {
// return head; // Fix: Handle the case where idx is greater than or equal to
// the size of the linked list
// }
// fast = fast.next;
// }

// if (fast == null) {
// head = head.next;
// return head;
// }

// while (fast.next != null) { // Fix: Check for fast.next
// slow = slow.next;
// fast = fast.next;
// }
// slow.next = slow.next.next;

// return head; // Fix: Return head after deletion
// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();

// ll.head = new Node(17380);
// ll.head.next = new Node(1078);
// ll.head.next.next = new Node(12890);
// ll.head.next.next.next = new Node(1980120);
// ll.head.next.next.next.next = new Node(6783120);
// ll.head.next.next.next.next.next = new Node(162720);
// ll.head.next.next.next.next.next.next = new Node(880120);

// ll.display();
// System.out.println();
// ll.deleteAtTail(7); // 7th element delete nhi hoga
// ll.display();
// }
// }

// ==================================================================== Another
// method for interview ==========================================

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {
// Node head = null;
// Node tail = null;

// void deleteAtTail(int idx) {
// if (head == null || idx <= 0) {
// return 0 ; // Handle the case where the linked list is empty or idx is
// invalid
// }

// Node slow = head;
// Node fast = head;

// // Move the fast pointer ahead by idx + 1 steps
// for (int i = 0; i <= idx; i++) {
// if (fast == null) {
// // head = head.next;
// return ; // Handle the case where idx is greater than the size of the linked
// list
// }
// fast = fast.next;
// }

// // Move both pointers until the fast one reaches the end
// while (fast != null && fast.next != null) {
// slow = slow.next;
// fast = fast.next;
// }

// // Remove the node at the tail
// if (slow != null && slow.next != null) {
// slow.next = slow.next.next;
// }
// }

// void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {

// LinkedList ll = new LinkedList();
// ll.head = new Node(17380);
// ll.head.next = new Node(1078);
// ll.head.next.next = new Node(12890);
// ll.head.next.next.next = new Node(1980120);
// ll.head.next.next.next.next = new Node(6783120);
// ll.head.next.next.next.next.next = new Node(162720);
// ll.head.next.next.next.next.next.next = new Node(880120);

// ll.display();
// System.out.println();
// ll.deleteAtTail(3); // 7th element delete nhi hoga
// ll.display();
// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 51:00 Q4 : Intersection of two linked lists

// import java.util.LinkedList;

// public class linnked_list_Question {

// private static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// private static class LinkedList {

// Node headA = null;
// Node headB = null;

// // Node getIntersectionNode(Node headA, Node headB) {
// Node getIntersectionNode() {
// Node tempA = headA;
// Node tempB = headB;

// int lengthA = 0;
// while (tempA != null) {
// lengthA++;
// tempA = tempA.next;
// }

// int lengthB = 0;
// while (tempB != null) {
// lengthB++;
// tempB = tempB.next;
// }

// // Reset tempA and tempB to the beginning
// tempA = headA;
// tempB = headB;

// // Move the longer list's pointer ahead by the difference in lengths
// if (lengthA > lengthB) {
// int steps = lengthA - lengthB;
// for (int i = 1; i <= steps; i++) {
// tempA = tempA.next;
// }
// } else {
// int steps = lengthB - lengthA;
// for (int i = 1; i <= steps; i++) {
// tempB = tempB.next;
// }
// }

// // Move both pointers until intersection or end of the lists
// while (tempA != null && tempB != null && tempA != tempB) {
// tempA = tempA.next;
// tempB = tempB.next;
// }

// return tempA; // Return the intersection node (or null if no intersection)

// }
// private void display(Node head) {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {

// LinkedList ll = new LinkedList();

// ll.headA = new Node(2);
// ll.headA.next = new Node(5);
// ll.headA.next.next = new Node(6);
// ll.headA.next.next.next = new Node(7);
// ll.headA.next.next.next.next = new Node(9);
// ll.headA.next.next.next.next.next = new Node(11);
// ll.headA.next.next.next.next.next.next = new Node(13);

// ll.headB = new Node(19);
// ll.headB.next = new Node(22);
// ll.headB.next.next = new Node(9);
// ll.headB.next.next.next = new Node(79);

// // Node intersectionNode = ll.getIntersectionNode(ll.headA, ll.headB);
// Node intersectionNode = ll.getIntersectionNode();

// System.out.println("The first linked list is: ");
// ll.display(ll.headA);

// System.out.println("\nThe second linked list is: ");
// ll.display(ll.headB);

// // System.out.println("\nThe intersection node is: " + (intersectionNode !=
// null ? intersectionNode.data : "No intersection"));
// ll.getIntersectionNode() ;

// }

// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// 1:04:09 Q5 : Find middle element of linked list

// length nikal lo phir
// divide by 2 kar do phir wahi element hoga middle element

// public class linnked_list_Question {

// public static class Node {
// int data ;
// Node next ;

// Node(int data){
// this.data = data ;
// this.next= next ;
// }

// }
// public static class linkedlist {

// Node head = null ;
// Node tail = null ;

// int size(){
// Node temp = head ;
// int count =0 ;
// while (temp!=null) {
// count++ ;
// temp = temp.next;

// }
// return count ;
// }

// int MidElement(){
// int listSize = size();
// int x = listSize / 2;

// Node temp = head;
// for (int i = 0; i < x; i++) {
// temp = temp.next;
// }

// return temp.data;
// }

// private void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist() ;

// ll.head = new Node(2);
// ll.head.next = new Node(5);
// ll.head.next.next = new Node(6);
// ll.head.next.next.next = new Node(7);
// ll.head.next.next.next.next = new Node(9);
// ll.head.next.next.next.next.next = new Node(11);

// ll.display();

// System.out.println( ll.MidElement());

// }
// }

// ===================================================================================================
// Another method
// odd No.of element
// both left and right Midlle ek hii hoga

// public class linnked_list_Question {

// public static class Node {
// int data ;
// Node next ;

// Node(int data){
// this.data = data ;
// this.next= next ;
// }

// }
// public static class linkedlist {

// Node head = null ;
// Node tail = null ;

// int MidElement(){
// Node slow = head ;
// Node fast = head ;

// // while ( fast.next!=null) { // this is not working
// while (fast != null &&fast.next!=null) {
// slow = slow.next ;
// fast = fast.next.next ;
// }
// return slow.data;

// }

// private void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist() ;

// ll.head = new Node(2);
// ll.head.next = new Node(5);
// ll.head.next.next = new Node(6);
// ll.head.next.next.next = new Node(7);
// ll.head.next.next.next.next = new Node(9);
// ll.head.next.next.next.next.next = new Node(11);
// ll.head.next.next.next.next.next.next = new Node(101);

// ll.display();

// int midElement = ll.MidElement();
// System.out.println("The middle element is: " + midElement);

// }
// }

// ===================================================================================================
// Another method
// // Even No.of element
// // left middle

// public class linnked_list_Question {

// public static class Node {
// int data ;
// Node next ;

// Node(int data){
// this.data = data ;
// this.next= next ;
// }

// }
// public static class linkedlist {

// Node head = null ;
// Node tail = null ;

// int MidElement(){
// Node slow = head ;
// Node fast = head ;

// // while ( fast != null && fast.next != null && fast.next.next != null) {
// while ( fast.next.next != null) {
// slow = slow.next ;
// fast = fast.next.next ;

// }

// return slow.data ;

// }

// private void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist() ;

// ll.head = new Node(2);
// ll.head.next = new Node(5);
// ll.head.next.next = new Node(6);
// ll.head.next.next.next = new Node(7);
// ll.head.next.next.next.next = new Node(9);
// ll.head.next.next.next.next.next = new Node(11);

// ll.display();

// int midElement = ll.MidElement();
// System.out.println("The middle element is: " + midElement);

// }
// }

// =======================================================================
// Another method
// // Even No.of element
// // Right middle

// public class linnked_list_Question {

// public static class Node {
// int data ;
// Node next ;

// Node(int data){
// this.data = data ;
// this.next= next ;
// }

// }
// public static class linkedlist {

// Node head = null ;
// Node tail = null ;

// int MidElement(){
// Node slow = head;
// Node fast = head ;

// // while ( fast.next.next == null) {
// while (fast != null && fast.next != null) {
// slow = slow.next ;
// fast = fast.next.next ;

// }
// return slow.data ;
// }

// private void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist() ;

// ll.head = new Node(2);
// ll.head.next = new Node(5);
// ll.head.next.next = new Node(6);
// ll.head.next.next.next = new Node(7);
// ll.head.next.next.next.next = new Node(9);
// ll.head.next.next.next.next.next = new Node(11);

// ll.display();

// int midElement = ll.MidElement();
// System.out.println("The middle element is: " + midElement);

// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// 1:27:36 Q6 : Delete middle element of linked list

// odd case

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = next;
// }

// }

// public static class linkedlist {

// Node head = null;
// Node tail = null;

// Node DeleteMidElement() {
// Node slow = head;
// Node fast = head;

// if(head.next==null || head.next.next==null){
// return null ;
// }

// while (fast.next != null && fast.next.next != null && fast.next.next.next !=
// null) {
// slow = slow.next;
// fast = fast.next.next;

// }

// slow.next = slow.next.next;
// return head;

// }

// private void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist();

// ll.head = new Node(2);
// // ll.head.next = new Node(5);
// // ll.head.next.next = new Node(6);
// // ll.head.next.next.next = new Node(7);
// // ll.head.next.next.next.next = new Node(9);
// // ll.head.next.next.next.next.next = new Node(11);
// // ll.head.next.next.next.next.next.next = new Node(13);

// ll.display();

// ll.DeleteMidElement();

// ll.display();

// }
// }

// ========================================================================even
// case left-mid
// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = next;
// }

// }

// public static class linkedlist {

// Node head = null;
// Node tail = null;

// Node DeleteMidElement() {
// Node slow = head;
// Node fast = head;

// if(head.next==null || head.next.next==null){
// return null ;
// }

// while (fast.next != null && fast.next.next != null && fast.next.next.next !=
// null && fast.next.next.next.next!=null) {
// slow = slow.next;
// fast = fast.next.next;

// }

// slow.next = slow.next.next;
// return head;

// }

// private void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist();

// ll.head = new Node(2);
// ll.head.next = new Node(5);
// ll.head.next.next = new Node(6);
// ll.head.next.next.next = new Node(7);
// ll.head.next.next.next.next = new Node(9);
// ll.head.next.next.next.next.next = new Node(11);

// ll.display();

// ll.DeleteMidElement();

// ll.display();

// }
// }

// ======================e===========e===========e===========e=========== even
// case Right-mid
// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = next;
// }

// }

// public static class linkedlist {

// Node head = null;
// Node tail = null;

// Node DeleteMidElement() {
// Node slow = head;
// Node fast = head;

// if(head.next==null || head.next.next==null){
// return null ;
// }

// while (fast.next != null && fast.next.next != null ) {
// slow = slow.next;
// fast = fast.next.next;

// }

// slow.next = slow.next.next;
// return head;

// }

// private void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist();

// ll.head = new Node(2);
// ll.head.next = new Node(5);
// ll.head.next.next = new Node(6);
// ll.head.next.next.next = new Node(7);
// ll.head.next.next.next.next = new Node(9);
// ll.head.next.next.next.next.next = new Node(11);

// ll.display();

// ll.DeleteMidElement();

// ll.display();

// }
// }
// ========================================================================//
// ========================================================================
// 1:44:13 Q7 : Linked List Cycle

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = next;
// }

// }

// public static class linkedlist {

// Node head = null;
// Node tail = null;

// boolean Cycle() {
// Node slow = head;
// Node fast = head;

// if(slow.next == null || fast.next == null){
// return false ;
// }

// while (fast != null) {
// slow = slow.next;
// fast = fast.next.next;

// if (fast == slow) {
// return true;
// }
// }
// return false ;
// }

// private void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// }

// public static void main(String[] args) {
// linkedlist ll = new linkedlist();

// ll.head = new Node(2);
// ll.head.next = new Node(5);
// ll.head.next.next = new Node(6);
// ll.head.next.next.next = new Node(7);
// ll.head.next.next.next.next = new Node(9);
// ll.head.next.next.next.next.next = new Node(11);
// ll.head.next.next.next.next.next.next = ll.head.next.next;

// System.out.println(ll.Cycle());

// }
// }
// ========================================================================//
// ========================================================================
// 2:00:02 Q8 : Linked List Cycle 2

// public class linnked_list_Question {

// public static class Node{
// int data ;
// Node next ;

// Node(int data){
// this.data = data ;
// this.next = null ;
// }
// }

// public static class linkedlist{
// Node head = null;
// Node tail = null ;

// int Cycle(){
// Node slow = head ;
// Node fast = head ;

// while (fast!=null) {
// slow = slow.next ;
// fast=fast.next.next;
// if(slow == fast){
// break ;
// }

// }
// Node temp =head ;
// while (temp!=slow) {
// temp = temp.next;
// slow = slow.next;
// }
// return slow.data ;
// }

// }

// public static void main(String[] args) {

// linkedlist ll = new linkedlist();

// ll.head = new Node(2);
// ll.head.next = new Node(5);
// ll.head.next.next = new Node(6);
// ll.head.next.next.next = new Node(7);
// ll.head.next.next.next.next = new Node(9);
// ll.head.next.next.next.next.next = new Node(11);
// ll.head.next.next.next.next.next.next = ll.head.next.next.next;

// System.out.println(ll.Cycle());

// }
// }

// ========================================================================//
// ========================================================================
// 2:19:14 Q10 : Merge 2 sorted Linked Lists - O(n) space , uisng extra space

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {

// Node headA = null;
// Node headB = null;
// Node tail = null;

// Node merge(Node headA, Node headB) {
// Node temp1 = headA;
// Node temp2 = headB;
// Node head = new Node(100); // Create a dummy node
// Node temp = head;

// while (temp1 != null && temp2 != null) {
// if (temp1.data < temp2.data) {
// temp.next = new Node(temp1.data);
// temp = temp.next;
// temp1 = temp1.next;
// } else {
// temp.next = new Node(temp2.data);
// temp = temp.next;
// temp2 = temp2.next;
// }
// }

// // Check if any list is remaining and append it to the merged list
// if (temp1 == null) {
// temp.next = temp2;
// } else {
// temp.next = temp1;
// }

// return head.next; // Skip the dummy node and return the merged list
// }
// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();

// ll.headA = new Node(2);
// ll.headA.next = new Node(5);
// ll.headA.next.next = new Node(6);
// ll.headA.next.next.next = new Node(7);
// ll.headA.next.next.next.next = new Node(9);
// ll.headA.next.next.next.next.next = new Node(11);
// ll.headA.next.next.next.next.next.next = new Node(13);

// ll.headB = new Node(19);
// ll.headB.next = new Node(22);
// ll.headB.next.next = new Node(9);
// ll.headB.next.next.next = new Node(79);

// Node mergedList = ll.merge(ll.headA, ll.headB);

// // Display the merged list
// while (mergedList != null) {
// System.out.print(mergedList.data + " ");
// mergedList = mergedList.next;
// }
// }
// }

// ========================================================================//
// ========================================================================
// 2:34:43 Q11 : Merge 2 sorted Linked Lists - O(1) space , without uisng extra
// space

// public class linnked_list_Question {

// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static class LinkedList {

// Node headA = null;
// Node headB = null;
// Node tail = null;

// Node merge(Node headA, Node headB) {

// Node temp1 = headA;
// Node temp2 = headB;
// Node head = new Node(100); // Create a dummy node
// Node temp = head;

// while (temp1 != null && temp2 != null) {
// if (temp1.data < temp2.data) {

// temp.next = temp1; // temp1 = temp.next ;

// temp = temp1;
// temp1 = temp1.next;
// } else {
// temp.next = temp2;
// temp = temp2 ;
// temp2 = temp2.next;
// }
// }

// // Check if any list is remaining and append it to the merged list
// if (temp1 == null) {
// temp.next = temp2;
// } else {
// temp.next = temp1;
// }

// return head.next; // Skip the dummy node and return the merged list
// }
// }

// public static void main(String[] args) {
// LinkedList ll = new LinkedList();

// ll.headA = new Node(2);
// ll.headA.next = new Node(5);
// ll.headA.next.next = new Node(6);
// ll.headA.next.next.next = new Node(7);
// ll.headA.next.next.next.next = new Node(9);
// ll.headA.next.next.next.next.next = new Node(11);
// ll.headA.next.next.next.next.next.next = new Node(13);

// ll.headB = new Node(19);
// ll.headB.next = new Node(22);
// ll.headB.next.next = new Node(9);
// ll.headB.next.next.next = new Node(79);

// Node mergedList = ll.merge(ll.headA, ll.headB);

// // Display the merged list
// while (mergedList != null) {
// System.out.print(mergedList.data + " ");
// mergedList = mergedList.next;
// }
// }
// }

// ========================================================================// ========================================================================
// 2:47:21 HW 12 : Split LL into 2 lists with odd and even values./

// public class linnked_list_Question {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static class LinkedList {

//         Node head = null;
//         Node tail = null;

//         // Method to split the linked list into two lists with odd and even values
//         void splitOddEven() {
//             Node oddHead = null;
//             Node evenHead = null;
//             Node oddTail = null;
//             Node evenTail = null;

//             Node current = head;

//             while (current != null) {
//                 if (current.data % 2 == 0) { // Even value
//                     if (evenHead == null) {
//                         evenHead = new Node(current.data);
//                         evenTail = evenHead;
//                     } else {
//                         evenTail.next = new Node(current.data);
//                         evenTail = evenTail.next;
//                     }
//                 } else { // Odd value
//                     if (oddHead == null) {
//                         oddHead = new Node(current.data);
//                         oddTail = oddHead;
//                     } else {
//                         oddTail.next = new Node(current.data);
//                         oddTail = oddTail.next;
//                     }
//                 }

//                 current = current.next;
//             }

//             // Print the odd values list
//             System.out.println("Odd Values List:");
//             display(oddHead);

//             // Print the even values list
//             System.out.println("Even Values List:");
//             display(evenHead);
//         }

//         // Method to display a linked list
//         private void display(Node head) {
//             Node current = head;
//             while (current != null) {
//                 System.out.print(current.data + " ");
//                 current = current.next;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();

//         ll.head = new Node(2);
//         ll.head.next = new Node(5);
//         ll.head.next.next = new Node(6);
//         ll.head.next.next.next = new Node(7);
//         ll.head.next.next.next.next = new Node(9);
//         ll.head.next.next.next.next.next = new Node(11);

//         System.out.println("Original Linked List:");
//         ll.display(ll.head);

//         ll.splitOddEven();
//     }
// }

// ========================================================================// ========================================================================

// 2:59:58 HW 13 : Remove duplicates from sorted linked list ;

// public class linnked_list_Question {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static class LinkedList {
//         Node head = null;
//         Node tail = null;

//         Node removeDuplicates() {
//             Node current = head;

//             while (current != null && current.next != null) {
//                 if (current.data == current.next.data) {
//                     current.next = current.next.next;
//                 } else {
//                     current = current.next;
//                 }
//             }

//             return head;
//         }

//         private void display() {
//             Node current = head;
//             while (current != null) {
//                 System.out.print(current.data + " ");
//                 current = current.next;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();

//         ll.head = new Node(2);
//         ll.head.next = new Node(2);
//         ll.head.next.next = new Node(6);
//         ll.head.next.next.next = new Node(7);
//         ll.head.next.next.next.next = new Node(7);
//         ll.head.next.next.next.next.next = new Node(11);

//         System.out.println("Original Linked List:");
//         ll.display();

//         ll.removeDuplicates();

//         System.out.println("Linked List after removing duplicates:");
//         ll.display();
//     }
// }

// ========================================================================//
// ========================================================================

// 2:59:58 HW 13 : Remove duplicates from unsorted linked list

// ========================================================================//
// ========================================================================
// 3:03:49 Q14 : Reverse a linked list - recursive

// public class linnked_list_Question {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void displayrev(Node head) {

//         if (head == null)
//             return;

//             // System.out.print(head.data + " ");
//         displayrev(head.next);

//         System.out.print(head.data + " ");
//     }

//     public static void main(String[] args) {
//         Node a = new Node(10);
//         Node b = new Node(100);
//         Node c = new Node(1000);
//         Node d = new Node(10000);
//         Node e = new Node(100000);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;

//         System.out.println("Linked List:");
//         displayrev(a);

//     }
// }

// Another merhtod 

// public class linnked_list_Question {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node reverse(Node head) {
//         // Base case: empty list or single node
//         if (head == null || head.next == null)
//             return head;

//         // Recursive case
//         Node newHead = reverse(head.next);
//         head.next.next = head;
//         head.next = null; // Set the next of the original head to null to avoid a cycle

//         return newHead;
//     }

//     public static void display(Node head) {
//         while (head != null) {
//             System.out.print(head.data + " ");
//             head = head.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node a = new Node(10);
//         Node b = new Node(100);
//         Node c = new Node(1000);
//         Node d = new Node(10000);
//         Node e = new Node(100000);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;

//         System.out.println("Original Linked List:");
//         display(a);

//         Node reversedHead = reverse(a);

//         System.out.println("Reversed Linked List:");
//         display(reversedHead);
//     }
// }

// ========================================================================//
// ========================================================================
// 3:42:57 Q15 : Reverse a Linked List - Iterative