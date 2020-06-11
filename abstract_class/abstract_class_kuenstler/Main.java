public class Main {
    public static void main(String[] args) {
        Kuenstler x = new Saenger("John");
        Kuenstler k = new Taenzer("Tim");

        x.vorstellen();
        x.performance();    //abstract class in Kuenstler
        x.verbeugung();

        k.vorstellen();
        k.performance();    //abstract class in Kuenstler
        k.verbeugung();


    }
}