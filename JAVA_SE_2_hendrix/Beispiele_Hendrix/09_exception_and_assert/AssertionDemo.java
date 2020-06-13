/**
 * 
 * BY DEFAULT assertions are SWITCHED OFF !!!
 * 
 * RUN FILE WITH:
 * java -ea AssertionDemo
 * 
 * https://www.youtube.com/watch?v=o8QtJw_1Ve8&list=PLxjiywUr53VYLN31AT4oIO54MfNzgYDh4&index=18     TutorialBull
 */

public class AssertionDemo {
    public static void main(String[] args) {
        
        //assert AssertConditionExpression : MessageExpression;
        double erg, erg2;
        erg = erg2 = 0;

        erg = addDouble(5.0, 1.0);
        erg2 = addDouble(5.0, -1.0);
        System.out.println(erg + "\n"+ erg2);
    }

    public static double addDouble(double wert1, double wert2){
        // der wert von double wert2 darf nicht unter 0 sein
        assert wert2 > 0.0 :"Wert 2 darf nicht kleiner als 0 sein";
        return wert1 + wert2;
    }
}