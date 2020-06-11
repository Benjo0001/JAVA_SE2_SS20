/**
 * InheritanceDemo
 * how to use inheritace (Vererbung)
 * -> extends
 * https://www.youtube.com/watch?v=_9R_in_7cT4
 * YT: Telusko
 */
// first version of calculator
class Calculator {                      // Super-class (JAVA-context)  / Parent (UPS)   / Base (C C++)
    public int add(int i, int j) {
        return i+j;
    }
    InputField f = new InputField();
}

// extended Version of calculator (has even all functions of calculator version1)
// single level inheritance
class CalcAdv extends Calculator {       //Sub-class (JAVA-context)   /Child (UPS)  /Derived (C C++)
    public int sub(int i, int j){
        return i-j;
    }
}

// multi level inheritance
class CalcVerryAdv extends CalcAdv {       //Sub-class (JAVA-context)   /Child (UPS)  /Derived (C C++)
    public int multi(int i, int j){
        return i*j;
    }
}

// just to show HAS-A-relationship
class InputField {
    String[] inputfield1 = new String[10];
    // ...
}

public class InheritanceDemo {
    public static void main(String[] args) {
        CalcAdv c1 = new CalcAdv();
        CalcVerryAdv c2 = new CalcVerryAdv();

        int result1 = c1.add(5, 4);
        int result2 = c1.sub(6, 3);
        int result3 = c2.multi(6, 3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

// IS-A
// using extend:  is-a-relationship
// CalcAdv is a sub-class of Calculator

// HAS-A
// object using/calling objects:      has-a-relationship
// Calculator has a InputField (object)



