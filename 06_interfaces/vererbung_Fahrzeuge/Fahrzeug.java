public interface Fahrzeug {
    // alle Fahrzeuge egal welcher Art haben:
    public void setAnzahlSitze(int anzahlSitze);
    public int getAnzahlSitze();

    public void setKennzeichen(String kennzeichen);
    public String getKennzeichen();
    // damit wird erzwungen, dass alle diese Methoden in der "implementierenden " Klasse (xxx implements Fahrzeug) 
    // erstellt werden MÜSSEN
}