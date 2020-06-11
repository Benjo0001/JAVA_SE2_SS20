/**
 Wir wollen Klassen zur Repräsentation von Gewässern, Flüssen und Meeren schreiben. Dabei sollten wir folgendes beachten:

Jedes Gewässer hat einen Namen sowie Angaben zur Schiffbarkeit (ja/nein) und zur Schadstoffbelastung (reelle Zahl).
Meere verfügen zusätzlich (zu einem Gewässer) über eine Fläche und sind immer schiffbar.
Flüsse haben zusätzlich (zu einem Gewässer) eine Länge. Weiterhin mündet jeder Fluss in genau ein Gewässer. Durch diese Mündungsbeziehung erreicht man von einem Fluss aus (evtl. über andere Flüsse) irgendwann ein Meer. Für Flüsse sollten eine Methode vorgesehen werden, um dieses Gewässer zu ermitteln.
Schreiben Sie Klassen zur Repräsentation von Gewässern, Flüssen und Meeren, wobei zu jeder Klasse die notwendigen Variablen, ein Konstruktor und für Flüsse die verlangte Methode anzugeben sind. Benutzen Sie dabei auf sinnvolle Art abstrakte Klassen und Vererbung.
Schreiben Sie ein Testprogramm, um die angegebenen Testfälle nachzustellen.
 */
public class Gewaesser {
    private int name;
    private int qStress;            //quality stress
    private boolean ng;   //navigability == schiffbar



    Gewaesser(int name, int qStress, int ng){
        this.SetName(name);
        this.setqStress(qStress);
        this.setNg(ng);
    }

    /**
     * @param name the name to set
     */
    public void setName(int name) {
        this.name = name;
    }

    /**
     * @param qStress the qStress to set
     */
    public void setqStress(int qStress) {
        this.qStress = qStress;
    }
    /**
     * @param ng the ng to set
     */
    public void setNg(boolean ng) {
        this.ng = ng;
    }
    /**
     * @return the name
     */
    public int getName() {
        return name;
    }
    /**
     * @return the qStress
     */
    public int getqStress() {
        return qStress;
    }
    
    public boolean getNg(){
        return this.ng;
    }
    
}