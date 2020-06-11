
public class Meer extends Gewaesser {
    double area;

    Meer(int name, int qStress){
        super(name, qStress, true);
        this.seArea(area);
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
}