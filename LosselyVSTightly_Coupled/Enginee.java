// Define an Engine interface
public interface Enginee {
    void start();
}

// you created an interface named Enginee, which has a single method start(). 
// This interface sets the contract that any engine should have a start method, 
// but it doesn't define how that method should behave. 
// This allows different types of engines to have their own specific start implementations.