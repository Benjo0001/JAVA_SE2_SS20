/**
 * Enums == Aufzählungs-Typ von Java
 * 
 * https://www.youtube.com/watch?v=Fp-wWI_QMi0
 */
public class EnumsTest {

    public static void main(String[] args) {
        
        int wert = Muenze.einCent.getWert();
        System.out.println("Ein Cent: "+wert);
        
        
        // alle Enum Werte ausgeben in der Reihenfolge der Aufzählung im Enum
        for(Muenze m : Muenze.values()){
            System.out.println(m.getWert());
        }
    }

}

