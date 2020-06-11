/**
 * ZeitFormat24
 * 
 * 3. Leiten Sie von der abstrakten Klasse ZeitFormat die Klassen ZeitFormat24 und ZeitFormat12 ab und implementieren Sie dort die abstrakten Methoden der Klasse ZeitFormat.
 */
public class ZeitFormat24 extends ZeitFormat {

    ZeitFormat24(){
        this(0,0);
    }
    ZeitFormat24(int stunde, int minute){
        super(stunde, minute);
    }

    public void printTime(){
        int h1 = getStunde()/10;
        int h2 = getStunde()%10;
        int m1 = getMinute()/10;
        int m2 = getMinute()%10;
        System.out.printf("Uhrzeit: %d%d:%d%d%n", h1,h2,m1,m2 );
        // System.out.println("Uhrzeit: "+ this.getStunde() + ":" + this.getMinute() );
    }
    
}