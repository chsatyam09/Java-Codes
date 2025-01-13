// package Sort;
// public class Student implements Comparable<Student> {
//     private Integer id;
//     private String name;
//     private Integer roll;

//     // Constructor
//     public Student(Integer id, String name, Integer roll) {
//         this.id = id;
//         this.name = name;
//         this.roll = roll;
//     }

//     // Getters
//     public Integer getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public Integer getRoll() {
//         return roll;
//     }

//     // Implementing the compareTo method for natural ordering by roll number
//     @Override
//     public int compareTo(Student o) { // o.roll ka jayda hai this.roll se tooh he will rerun return 1 ;
//                                       // o.roll ka kaam hai this.roll se tooh he will rerun return -1 ;
//         return this.roll - o.roll; // o.roll ka equal hai this.roll se tooh he will rerun return 0;
//     }

//     // toString method for easy printing of Student objects
//     @Override
//     public String toString() {
//         return "Student{id=" + id + ", name='" + name + "', roll=" + roll + '}';
//     }
// }

// Positive Return Value: If this.roll - o.roll is positive, it means this.roll
// is greater than o.roll, indicating that the current Student object should
// come after o in the sorted order.
// Negative Return Value: If this.roll - o.roll is negative, it means this.roll
// is less than o.roll, indicating that the current Student object should come
// before o in the sorted order.
// Zero Return Value: If this.roll - o.roll is zero, it means this.roll is equal
// to o.roll, indicating that the two Student objects are considered equal for
// sorting purposes.



// -------------------------- Comparator

// package Sort;
// public class Student {
// private Integer id;
// private String name;
// private Integer roll;

// // Constructor
// public Student(Integer id, String name, Integer roll) {
// this.id = id;
// this.name = name;
// this.roll = roll;
// }

// // Getters
// public Integer getId() {
// return id;
// }

// public String getName() {
// return name;
// }

// public Integer getRoll() {
// return roll;
// }

// // toString method for easy printing of Student objects
// @Override
// public String toString() {
// return "Student{id=" + id + ", name='" + name + "', roll=" + roll + '}';
// }
// }

// Positive Return Value: If this.roll - o.roll is positive, it means this.roll
// is greater than o.roll, indicating that the current Student object should
// come after o in the sorted order.
// Negative Return Value: If this.roll - o.roll is negative, it means this.roll
// is less than o.roll, indicating that the current Student object should come
// before o in the sorted order.
// Zero Return Value: If this.roll - o.roll is zero, it means this.roll is equal
// to o.roll, indicating that the two Student objects are considered equal for
// sorting purposes.
