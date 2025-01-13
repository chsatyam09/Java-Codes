// How to create Object - 
// Using new keyword 
// Using newInstance( ) method 
// Using Clone( ) method 
// Using Deserialization
// Using Factory Method 

// public class Car {
//     String model;

//     public Car(String model) {
//         this.model = model;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car car1 = new Car("Toyota");
//         System.out.println(car1.model);
//     }
// }
// --------------------------------------------------
// public class Car {
//     String model = "Default Model";

//     public Car() {
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         try {
//             Car car2 = Car.class.getDeclaredConstructor().newInstance();
//             System.out.println(car2.model);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
// // --------------------------------------------------
// public class Car implements Cloneable {
//     String model;

//     public Car(String model) {
//         this.model = model;
//     }

//     @Override
//     protected Object clone() throws CloneNotSupportedException {
//         return super.clone();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         try {
//             Car car3 = new Car("Ford");
//             Car car3Clone = (Car) car3.clone();
//             System.out.println(car3Clone.model);
//         } catch (CloneNotSupportedException e) {
//             e.printStackTrace();
//         }
//     }

// }

// // --------------------------------------------------

// import java.io.*;

// public class Car implements Serializable {
//     String model;

//     public Car(String model) {
//         this.model = model;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Serialization
//         try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
//             Car car4 = new Car("Honda");
//             out.writeObject(car4);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // Deserialization
//         try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("car.ser"))) {
//             Car car4Deserialized = (Car) in.readObject();
//             System.out.println(car4Deserialized.model);
//         } catch (IOException | ClassNotFoundException e) {
//             e.printStackTrace();
//         }
//     }
// }
// // --------------------------------------------------

// public class Car {
//     String model;

//     private Car(String model) {
//         this.model = model;
//     }

//     public static Car createCar(String model) {
//         return new Car(model);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car car5 = Car.createCar("BMW");
//         System.out.println(car5.model);
//     }
// }
