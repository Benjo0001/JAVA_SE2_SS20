/**
 * Entry point class for the simple interface demo.
 */
public class SimpleClassMain {
    public static void main(String[] args) {
        // Not working --> interfaces cannot be instanciated
        // ISimpleInterface simpleInterface = new ISimpleInterface();

        // Working
        // Instanciate new SimpleClass
        SimpleClass simpleClass = new SimpleClass();
        simpleClass.SayHello();
        System.out.println("Non static greeting constant: " 
        + simpleClass.Greeting);

        System.out.println("---------------------------");

        // Working too
        // Ask yourself: Do I know WHY this works?
        ISimpleInterface simpleClass2 = new SimpleClass();
        simpleClass2.SayHello();
        System.out.println("Non static greeting constant: " 
        + simpleClass2.Greeting);

        System.out.println("---------------------------");

        // Using the static constant of ISimpleInterface
        // Ask yourself: Do I know WHY this works?
        System.out.println("Static greeting constant: " 
        + ISimpleInterface.StaticGreeting);


        //Call static constant
        String str = ISimpleInterface.StaticGreeting;
        String str2 = ISimpleInterface.Greeting;

        //Call static method
        // ...
    }
}