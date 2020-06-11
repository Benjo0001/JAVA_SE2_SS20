/**
 * Interfaces Main
 * https://www.youtube.com/watch?v=3mAEVVCnbR8
 * YT: Kim Peter Mesenhöller
 */
class Main {
    public static void main(String[] args) {
        
            Webshop w1 = new Webshop("Shop 1", new PayPal());
            Webshop w2 = new Webshop("Shop 2", new EC());
            Webshop w3 = new Webshop("Shop 3", new Kreditkarte());
        
        
            w1.zahlen();
            w2.zahlen();
            w3.zahlen();
        
    }

}