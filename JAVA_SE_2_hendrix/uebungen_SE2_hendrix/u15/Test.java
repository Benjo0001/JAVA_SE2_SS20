public class Test{
    public static void main(String[] args) {
        
        //bisschen Abstand zu Ausgabe einfügen
        System.out.println("\n\n\n\n\n--- Programmstart - 2D-arssray-table-retangle ---\n\n");

        /**
         * Aufgabe Dumm.. Rechtecke können (immer) nur werte von einer Länge/Breite 1 bis 8 enthalten
         * -> Array wird mit 8 x 8 Tabelle ausgestattet und genau in diese Plätze können die Rechtecke eingetragen werden
         * also Zugriff dann auch  
         */

        // erzeugen der Recheck-Speicher Tabelle => alle Speicherzelle des Array haben noch den Wert "0"
        RechteckSpeicher rechteckSpeicherTabelle = new RechteckSpeicher();



        //test ob wirklich "0" der Zelle [3][5]  dessen breite x länge  == 4 x 6
        //neues Rechteck erstellen um dieses zur Ausgabe zwischen zu speichern
        Rechteck r_antwort = new Rechteck();
        r_antwort = rechteckSpeicherTabelle.abfragen(4, 6);
        System.out.println("\n\nAbfrage 1:\tBreite: "+ r_antwort.getBreite() + "\tLänge: " + r_antwort.getLaenge());

        // zeichnen der Gesamten Tabelle (2-Dimensionales-Array)
        System.out.println("\n\nZeichnung 1: ");
        rechteckSpeicherTabelle.zeichnen();

        //Eintrag vom Rechteck -> dazu muss neues Rechteck erst erstellt werden..
        //da die Klasse: RechteckSpeicher ein Rechteck als Übergabeparameter erwartet

        //erstellen eines Rechtecks         breite x länge  == 4 x 6
        Rechteck r1 = new Rechteck(4, 6);

        //Eintragen in das Objekt/Klasse RechteckSpeicher
        rechteckSpeicherTabelle.eintragen(r1);
        System.out.println("\tEintragen von Rechteck 4x6 ...");

        //Abfragen von Rechteck in Zelle [3][5]  dessen breite x länge  == 4 x 6
        r_antwort = rechteckSpeicherTabelle.abfragen(4, 6);
        System.out.println("\n\nAbfrage 2:\tBreite: "+ r_antwort.getBreite() + "\tLänge: " + r_antwort.getLaenge());
        

        // zeichnen der Gesamten Tabelle (2-Dimensionales-Array)
        System.out.println("\n\nZeichnung 2: ");
        rechteckSpeicherTabelle.zeichnen();






        //löschen des Rechtecks in Zelle [3][5]  dessen breite x länge  == 4 x 6
        rechteckSpeicherTabelle.löschen(4, 6);
        System.out.println("\tLöschen von Rechteck 4x6 ...");



        //Abfragen von Rechteck in Zelle [3][5]  dessen breite x länge  == 4 x 6
        r_antwort = rechteckSpeicherTabelle.abfragen(4, 6);
        System.out.println("\n\nAbfrage 3:\tBreite: "+ r_antwort.getBreite() + "\tLänge: " + r_antwort.getLaenge());
       

        // zeichnen der Gesamten Tabelle (2-Dimensionales-Array)
        System.out.println("\n\nZeichnung 3: ");
        rechteckSpeicherTabelle.zeichnen();
    }
}