// import java.util.LinkedList;
// import java.util.List;

// public class hello26 {

//     private static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     private static class LinkedList {

//         Node headA = null;
//         Node headB = null;

//         List<Integer> getCommonElements(Node headA, Node headB) {
//             List<Integer> commonElements = new LinkedList<>();
//             Node tempA = headA;
//             Node tempB = headB;

//             while (tempA != null && tempB != null) {
//                 if (tempA.data == tempB.data) {
//                     commonElements.add(tempA.data);
//                     tempA = tempA.next;
//                     tempB = tempB.next;
//                 } else if (tempA.data < tempB.data) {
//                     tempA = tempA.next;
//                 } else {
//                     tempB = tempB.next;
//                 }
//             }

//             return commonElements;
//         }

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

//         ll.headA = new Node(17380);
//         ll.headA.next = new Node(1078);
//         ll.headA.next.next = new Node(12890);
//         ll.headA.next.next.next = new Node(1980120);
//         ll.headA.next.next.next.next = new Node(6783120);
//         ll.headA.next.next.next.next.next = new Node(162720);
//         ll.headA.next.next.next.next.next.next = new Node(880120);

//         ll.headB = new Node(198017720);
//         ll.headB.next = new Node(6783120);
//         ll.headB.next.next = new Node(16276720);
//         ll.headB.next.next.next = new Node(8801720);

//         List<Integer> commonElements = ll.getCommonElements(ll.headA, ll.headB);

//         System.out.println("The first linked list is: ");
//         ll.display(ll.headA);

//         System.out.println("\nThe second linked list is: ");
//         ll.display(ll.headB);

//         System.out.println("\nThe common elements are: " + (commonElements.isEmpty() ? "No common elements" : commonElements));
//     }
// }


public class hello26 {

    public static void main(String[] args) {
        System.out.println("heelo commit ");
    }
}