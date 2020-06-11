// extends == erweitert
public class Hund extends Tier {
    private String rasse ="dalmatiner";

    public String getRasse() {
        return rasse;
    }
    public void setRasse(String r){
        this.rasse = r;
    }

    public String macheDichBemerkbar(){
            return "wau";
    }
    public void atme(){
        System.out.println("hechelll");
    }
    public void laufe() {
        System.out.println("hüpf");
  }

}