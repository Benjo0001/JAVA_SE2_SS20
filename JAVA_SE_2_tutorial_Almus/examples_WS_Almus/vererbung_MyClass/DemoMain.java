import demopaket1.*;
import demopaket1.nochmal.MyTest2;
import demopaket1.nochmal.nochmal.*;
public class DemoMain {
    public static void main(String[] args) {
        // MyClass ist abstract
        // MyNiceClass erbts von MyClass
        MyClass myClassVariable = new MyNiceClass();

        //nicht möglich:
        MyNiceClass mnc = new MyClass();

        demopaket1.MyTest test = new MyTest();
        MyTest2 = new MyTest2();
        demopaket1.nochmal.nochmal.MyTest test3 = new demopaket1.nochmal.nochmal.MyTest();


        // Basisklasse ... die Klasse von der wir erben wollen
        // Superklasse ... ist die Klasse von der Sie direkt geerbt haben
        // aus Sicht von MyClass wäre Objekt die Superklasse, aus Sicht von MyNiceClass ist die Superklasse MyClass


        // final Klasse : ist ein spezieller Klassentyp, so eine art statische Klasse
    }
}