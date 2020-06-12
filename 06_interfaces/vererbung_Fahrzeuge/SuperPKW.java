public class SuperPKW {
    @Override
    public SuperPKW(String color){

        // dieser Aufruf ist ein muss wenn der Konstruktor aus der PKW Klasse erbt,
        // welche im Konstruktor einen/mehrere Übergabewerte hat !
        super("Klasse 4", color);
    }
}