public class MautTransponder {

    private String mautID;
    private String hersteller;

    public MautTransponder(){
        this.mautID = "2hvo3748z872liuf3";
        System.out.println("ich bin ein MautTransponder");
    }

    public String getID(){
        return this.mautID;
    }
    public String getHersteller(){
        return this.hersteller;
    }
}