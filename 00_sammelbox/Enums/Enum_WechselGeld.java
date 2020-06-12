import java.util.LinkedList;

public class Enum_WechselGeld {

    /**
     * Implementieren Sie eine Methode die das Wechselgeld in Münzen umwandelt (möglichst wenig Münzen)
     */
    public static void main(String[] args) {
        
        LinkedList<Muenze> wechselgeld = Muenze.getWechselgeld(526);

        for(Muenze m : wechselgeld){
            System.out.println(m);
        }
    }
}