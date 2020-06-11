public class Webshop {

    private String name = null;

    // erzeuge objekt für Zahlungsart
    private IZahlung zahlungsart = null;
    
    public Webshop(String name, IZahlung iz) {
        this.name = name;
        this.zahlungsart = iz;
    }

    // Diese Methoden wären eigentlich notwendig für die verschiedenen Zahlungsvorgänge
    // jedoch müssten Änderungen auch immer direkt hier stattfinden

    // public void zahleViaEC(){
    //     System.out.println("Zahlungslogik EC");
    // }


    // public void zahleViaKredit(){
    //     System.out.println("Zahlungslogik Kreditkarte");
    // }


    // public void zahleViaPayPal(){
    //     System.out.println("Zahlungslogik PayPal");
    // }

    // neue Methode für die Zahlungsvorgänge
    public void zahlen(){
        zahlungsart.erzeugeZahlung();
    }
}