public class RechteckSpeicher{
    // erstellt 64 (Rechteck)-Speicherplätze 
    //  [0][0] bis 
    //  [7][7] 
    //  [breite][länge]
    // Bsp. das Rechteck an der Stelle (tabelle: 0Zeile 2Spalte)    [0][1]          hat die Maße: breite = 1 und laenge = 2
    //                                               Rechnung :     [index_1][index_2]      breite = index_1 +1  laenge= index_2 +1



    //erstelle ein Array mit Werten vom Typ Rechteck
    private Rechteck[][] rs;


    
    // weise den Wert "0" ALLEN Array Felder zu
    RechteckSpeicher(){
        rs = new Rechteck[8][8];
        for(int i=0; i<this.rs.length; i++){
            for(int j=0; j<this.rs[i].length; j++){
                // this.rs[i][j] = null;        //hendrix variante, scheiße zur Darstellung

                //Zusatz siehe unten (Zeichnen)     setzt ALLE Rechtecke auf den Wert 0 x 0 zur Darstellung
                Rechteck r0 = new Rechteck(0,0);
                this.rs[i][j] = r0;
            }
        }
    }


    // Methode zum "Eintragen" eines Rechtecks in die Array-Tabelle"
        // setzt im Prinzip einfach den Wert der Zelle aufen ihren Index + 1
        // weil Array ja von 0 - n angesprochen werden und wir von 1-8 zählen

    public void eintragen(Rechteck r){
        this.rs[r.getBreite()-1][r.getLaenge()-1] = r;
        // minus 1 weil wir array 0 0 das rechteck mit 1 x 1
    }





    // Methode löscht im Prizip ein eingetragenes Rechteck wieder (also setzt den Wert auf "0")
    public void löschen(int laenge, int breite){            //hier werden die Werte des Rechtecks eingegeben

        // rs[breite-1][laenge-1]=null;       hendrix Variante

        Rechteck r0 = new Rechteck(0,0);
        this.rs[laenge-1][breite-1] = r0;
    }



    //Methode fragt ob ein Rechteck in diesem Array-Feld eingetragen wurde
    public Rechteck abfragen(int laenge, int breite){
        return rs[laenge-1][breite-1];
        //return vom Typ Rechteck!
    }





    // Zusatz für besseres Verständnis
    public void zeichnen(){
        // System.out.println("Array Darstellung (Methode: zeichnen)\n");
        //unwichtig..........
        System.out.print("    ");
        for(int i = 0; i<rs.length; i++){
            System.out.print(" "+i+"  | ");
        }
        System.out.println("\n    -----------------------------------------------");

        //ab hier wichig für ausgabe
        for(int i=0; i<rs.length; i++){
            System.out.println("\n    -----------------------------------------------");
            System.out.print(" "+i+" || ");
            for(int j=0; j<rs[i].length; j++){
                System.out.print(rs[i][j].getBreite() + "|" + rs[i][j].getLaenge() + " | " );
            }
        }
    }

}