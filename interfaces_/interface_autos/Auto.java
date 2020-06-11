public class Auto extends Fahrzeug implements Fahrzeug_Interface {
    
    public Auto() {
        reparieren();
    }

    @Override
    public void reparieren() {
        repariert = true;
        System.out.println(repariert);
    }
}