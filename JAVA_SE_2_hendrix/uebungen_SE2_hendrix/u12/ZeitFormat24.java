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
    
    @Override
    public void printTime(){
        int h1 = super.getStunde()/10;
        int h2 = super.getStunde()%10;
        int m1 = super.getMinute()/10;
        int m2 = super.getMinute()%10;
        System.out.printf("Uhrzeit: %d%d:%d%d%n", h1,h2,m1,m2 );
        // System.out.println("Uhrzeit: "+ this.getStunde() + ":" + this.getMinute() );
    }
    
}