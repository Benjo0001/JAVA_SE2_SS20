public class Rechteck{
    private int laenge;
    private int breite;

    Rechteck(){
        this.setLaenge(1);
        this.setBreite(1);
    }

    Rechteck(int b, int l){
        this.setBreite(b);
        this.setLaenge(l);
        //ist das gleiche wie
        // this.laenge = l;
        // this.breite = b;
    }




    // SETTER

    public void setLaenge(int x){
            this.laenge = x;
    }

    public void setBreite(int x){
            this.breite = x;
    }

    // GETTER
    
    public int getLaenge(){
        return this.laenge;
    }

    public int getBreite(){
        return this.breite;
    }

}//end of Rechteck

