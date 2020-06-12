/**
 * Vorteile von Vererbung?
 * Kapselung von Funktionen + Wiederverwendbarkeit && Objektorientierung
 * 
 * Modularisierung , gekapselter Code, Speicher sauber trennen
 * 
 * https://www.youtube.com/watch?v=Qg6v5obLUV0&list=RDCMUCPaUjOPs59pdlkSRDdJ6ZDQ&index=14       DeBukkIt
 * 
 * Bsp class object wurde auch leicht angeschnitten im Video
 */
public class Main {
    public static void main(String[] args) {
        //Automobil car1 = new PKW();  NICHT möglich da Automobil eine abstract class ist
        Flugzeug flugzeug1 = new Flugzeug();

        LKW lkw = new LKW(new MautTransponder());
        System.out.println(lkw.getTrapo().getID());
        System.out.println(lkw.getAnzahlRaeder());

        PKW pkw = new PKW();
        System.out.println(pkw.getAnzahlRaeder());
    }
}