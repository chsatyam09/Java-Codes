// Car class that depends on the Engine interface
public class Carr {
    private Enginee enginee;

    // Constructor injection
    public Carr(Enginee enginee) {
        this.enginee = enginee;
    }

    public void startCar() {
        enginee.start();
    }
}

// In the Carr class, an Enginee object is injected via the constructor.
// This makes the car loosely coupled to the engine because it doesn’t directly
// create an Enginee instance.
// Instead, it relies on an Enginee object provided to it, allowing any class
// implementing Enginee to be used.

// Main class to test the setup
public static void main(String[] args) {
    Enginee enginee = new GasolineEngine(); // Dependency
    Carr carr = new Carr(enginee); // Inject dependency
    carr.startCar(); // Calls engine.start()
}
// In the Main class, an instance of GasolineEngine is created and passed to Carr.
//  When car.startCar() is called, it internally calls engine.start(), 
//  which outputs "Bruum-Bruum", simulating the sound of a gasoline engine starting.
