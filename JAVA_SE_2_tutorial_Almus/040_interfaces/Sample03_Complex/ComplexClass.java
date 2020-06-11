/**
 * This class does it all!
 * It inherits all the fun stuff from ComplexClassBase AND implements IOtherInterface.
 */
public class ComplexClass extends ComplexClassBase implements IOtherInterface {

    // Ask yourself:
    // Do I need to do this here?
    public void DoSomething() {
        System.out.println("The method DoSomething was called. (ComplexClass)");
    }

    // Again: Do I need to do this here?
    public void PrintMyClassName() {
        System.out.println(this.getClass());
    }

    // This one is nice too:
    // What would happen to the output of the test program if I uncomment this code?
    // public void PrintSomethingOther() {
    //     System.out.println("Value of MyValue is: " + MyValue);
    // }
}