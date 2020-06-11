/**
 * Zeit
 * UEBUNG aus JAV9 Java Herd Heft, daher leicht anders als Hendrix Aufgabe
 * 1. Definieren Sie eine Klasse Zeit, die geeignete Getter- und Setter-Methoden zum Ändern
und Ermitteln einer gespeicherten Uhrzeit besitzt (Stunde, Minute).
 */
public class Zeit {

    private int minute;
    private int stunde;

    void setMinute(int m){
        this.minute = m;
    }
    void setStunde(int s){
        this.stunde = s;
    }
    int getMinute(){
        return this.minute;
    }
    int getStunde(){
        return this.stunde;
    }


    Zeit(){
        this(0,0);
    } 
    // ==
    // Zeit(){
    //     minute = 0;
    //     stunde = 0;
    // }

    Zeit(int h, int m){
        this.stunde = h;
        this.minute = m;
    }

}