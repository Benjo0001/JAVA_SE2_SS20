public class Saenger extends Kuenstler {
    //define an explicit constructor
    public Saenger(String name) {
        super(name);
    }
    
    @Override
    public void performance() {
        System.out.println("Happy birthday");
    }
}