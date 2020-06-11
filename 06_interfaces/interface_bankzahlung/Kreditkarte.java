/**
 * Kreditkarte
 */
public class Kreditkarte implements IZahlung{
    @Override
    public void erzeugeZahlung() {
        System.out.println("Zahlungslogik Kreditkarte");
    }
    
}