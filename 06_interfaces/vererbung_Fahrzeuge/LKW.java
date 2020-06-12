public class LKW extends Automobil {
    private String fahrtenSchreiber;
    private MautTransponder mautTrapo;

    public LKW(MautTransponder mt) {
        this.mautTrapo = mt;
        System.out.println("Ich bin ein LKW mit Mauttransponder");
    }

    public LKW(MautTransponder trapo, int anzahlSitze, String kennzeichen, String fs) {
        this.mautTrapo = trapo;
        this.anzahlSitze = anzahlSitze;
        this.kennzeichen = kennzeichen;
        this.fahrtenSchreiber = fs;
    }

    public String getFahrtenSchreiber() {
        return this.fahrtenSchreiber;
    }

    public void setFahrtenSchreiber(String fahrtenSchreiber) {
        this.fahrtenSchreiber = fahrtenSchreiber;
    }

    public MautTransponder getTrapo() {
        return mautTrapo;
    }

}