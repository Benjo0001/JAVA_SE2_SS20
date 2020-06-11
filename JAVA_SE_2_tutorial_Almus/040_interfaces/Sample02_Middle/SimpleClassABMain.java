/**
 * Entry point class for the this interface demo.
 */
public class SimpleClassABMain {

    public static void main(String[] args) {

        // Try to answer the questions BEFORE you try to compile this program.
        // Just seeing the result would spoil all the fun :)

        // AND: How would you visualize the inheritance chain?
        // Take a look at the tips and tricks section of the tutorium.
        // There you can find a sample tool you could use to create a relationship diagram (UML).

        // This is the easiest case. Will this code block compile and work?
        // Can you explain why it does or does not work?
        SimpleClassAB simple = new SimpleClassAB();
        simple.MethodA();
        simple.MethodB();
        simple.MethodC();
        simple.MethodD();

        // This is another scenario. Will this code block compile and work?
        // Can you explain why it does or does not work?
        ISimpleInterfaceAB simple1 = new SimpleClassAB();
        simple1.MethodA();
        simple1.MethodB();
        simple1.MethodC();
        simple1.MethodD();

        // This is another way to instanciate the type.
        // Will this code block compile and work?
        // Again: Can you explain why it does or does not work?
        ISimpleInterfaceA simple2 = new SimpleClassAB();
        simple2.MethodA();
        simple2.MethodB();
        simple2.MethodC();
        simple2.MethodD();

        // Last one for this sample. You can instanciate the class like this.
        // Will this code block compile and work?
        // Again: Can you explain why it does or does not work?
        ISimpleInterfaceB simple3 = new SimpleClassAB();
        simple3.MethodA();
        simple3.MethodB();
        simple3.MethodC();
        simple3.MethodD();
    }
}