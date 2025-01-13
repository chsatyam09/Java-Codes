

// public class Car {

//     public static void main(String[] args) {
//         Engine obj = new Engine();
//         obj.Start();
//     }
    
// }


public class Car {  // In Java, a class is a blueprint for creating objects.
    // The private keyword means that this field can only be accessed within the Car class.
    // It's part of encapsulation, which helps in hiding the internal state of the object and only exposing the necessary methods.

    private Engine engine; // Declaring an instance of Engine
    // Engine is the data type, representing the class Engine, and engine is the variable name, representing an instance of the Engine class.


    // A constructor is a special method that is called when an instance of the class is created.
    public Car() { //   // Constructor to initialize the engine
        this.engine = new Engine();
    }

    // The Car() method is a constructor, a special method that’s called whenever you create a new Car object.
    //  Here, we’re saying that every time a new car is created, it should automatically come with a new Engine.
    //   The line this.engine = new Engine(); creates a new Engine object and assigns it to the engine variable.

    public void startEngine() { //    // Method to start the engine
        engine.Start(); // Calling the start method of Engine
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();  // This will call the start() method of the Engine class and print "Bruum -Bruum"
    }
}

// Understanding Tight Coupling
// In your implementation, the Car class is tightly coupled with the Engine class for the following reasons:

// Instantiation within the Class: The Car class creates an instance of Engine directly in its constructor with this.
// engine = new Engine();. This means that every time a Car object is created, it creates a new Engine object. 
// This hardwires the relationship between the Car and Engine classes.

// Dependency on Implementation: The Car class depends on the specific implementation of the Engine class. 
// If you need to change the Engine class (for instance, if you want to use a different type of engine),
//  you will have to modify the Car class itself.

