/**
 * ZeitFormat12
 * * UEBUNG aus JAV9 Java Herd Heft, daher leicht anders als Hendrix Aufgabe
 * 
 * 3. Leiten Sie von der abstrakten Klasse ZeitFormat die Klassen ZeitFormat24 und ZeitFormat12 ab und implementieren Sie dort die abstrakten Methoden der Klasse ZeitFormat.
 */
public class ZeitFormat12 extends ZeitFormat {
    ZeitFormat12(){
        this(0,0);
    }
    ZeitFormat12(int stunde, int minute){
        super(stunde, minute);
    }

    
    public void printTime(){
        boolean pm = false;
        int hour;

        if(this.getStunde()>12){
            pm = true;
            hour = this.getStunde()-12;
        }else{
            pm = false;
            if(this.getStunde()==0){
                hour = 12;
            }else{
                hour = this.getStunde();
            }
        }
        int h1 = hour/10;
        int h2 = hour%10;
        int m1 = getMinute()/10;
        int m2 = getMinute()%10;
        if(pm){
            System.out.printf("Uhrzeit: %d%d:%d%d PM%n", h1,h2,m1,m2 );
        }else{
            System.out.printf("Uhrzeit: %d%d:%d%d AM%n", h1,h2,m1,m2 );
            // System.out.println("Uhrzeit: "+ hour + ":" + this.getMinute() +"AM" );
        }
    }

    
}