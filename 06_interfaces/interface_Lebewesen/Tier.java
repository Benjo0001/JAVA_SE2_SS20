// implements == erfüllt / implementiert
public class Tier implements Lebewesen {
    int beine;
    String name;
    int augen;

    public String macheDichBemerkbar() {
        return "hey";
    }

    // add unimplemented methods
    @Override
    public void atme() {
        System.out.println("schnauf");
    }
}