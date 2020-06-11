/**
 * Very simple sample Interface.
 * This is the base for the inheriting class.
 */
public interface ISimpleInterface {
    // A non static constant
    public final String Greeting = "Hello!";

    // A static constant
    public static final String StaticGreeting = "Static Hello!";

    // An abstract method which needs to be implemented when inheriting this
    // interface (non static)
    public void SayHello();

    
    public static void doSomething(){
        System.out.println("I am doing something");
    }
}