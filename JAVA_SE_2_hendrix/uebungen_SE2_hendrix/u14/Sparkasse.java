class Sparkasse extends Konto {
    private double zinssatz;

    void setZinssatz(double z){
        this.zinssatz = z;
    }

    void setKontonummer(int kontonummer){
        this.kontonummer = kontonummer;
    }
    int getKontonummer(){
        return this.kontonummer;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setKontostand(double kontostand){
        this.kontostand = kontostand;
    }
    double getKontostand(){
        return this.kontostand;
    }

    void setNewKontostand(double kontostand){
        this.kontostand = this.kontostand * (1+this.zinssatz); 
    }



}