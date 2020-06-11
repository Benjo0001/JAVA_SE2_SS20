/**
 * ZeitFormat
 * * UEBUNG aus JAV9 Java Herd Heft, daher leicht anders als Hendrix Aufgabe
 */
public abstract class ZeitFormat extends Zeit {

    ZeitFormat(){
        this(0,0);
    }
    // ZeitFormat(){
    //     Zeit(0, 0);
    // }

    ZeitFormat(int h, int m){
        super(h, m);
    }
    // ZeitFormat(int h, int m){
    //     Zeit(h, m);
    // }

    public abstract void printTime();

}