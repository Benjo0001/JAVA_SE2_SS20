/**
 * Aufgabe 037 - Die Lampe
Schreiben Sie folgende Klassen:

Lamp:

Attribute (immer private):
int watt
Methoden:
int annualPowerConsumption(int hoursPerDay)

Diese Methode soll den jährlichen Verbrauch (KWh) wie folgt berechnen:

(Leistung [Watt] * Betriebsstunden pro Tag * 365) / 1000
int getWatt()

Bulb die von Lamp erbt mit folgenden eigenen Informationen:

Attribute (immer private): -
Methoden:
String annualConsumptionAsReadableString(int hoursPerDay)
Die Methode soll folgenden Satz zurückgeben: "A bulb consumes XXX KWh per year when on for YYY hours per day."
XXX steht für die Anzahl der verbrauchten Kilowattstunden.
YYY steht für die Anzahl der Stunden, die die Glühbirne pro Tag an ist.
LedBulb die von Lamp erbt mit folgenden eigenen Informationen:

Attribute (immer private): -
Methoden:
String annualConsumptionAsReadableString(int hoursPerDay)
Die Methode soll folgenden Satz zurückgeben: "A led bulb consumes XXX KWh per year when on for YYY hours per day."
XXX steht für die Anzahl der verbrauchten Kilowattstunden.
YYY steht für die Anzahl der Stunden, die die Glühbirne pro Tag an ist.
 */
// public class Lamp {
//     private int watt;


//     int annualPowerConsumption(int hoursPerDay){
//         return (this.watt * hoursPerDay * 365) / 1000;
//     }

//     /**
//      * @return the watt
//      */
//     public int getWatt() {
//         return this.watt;
//     }
    
//     // /**
//     //  * @param watt the watt to set
//     //  */
//     // public void setWatt(int watt) {
//     //     this.watt = watt;
//     // }

//     // Lamp(){
//     //     this(10);
//     // }

//     Lamp(int watt){
//         if(watt <= 0){
//             System.out.println("You entered a negative or zero number for watt. Default to 10 Watt");
//             this.watt = watt;
//         }else{
//             this.watt = watt;
//         }
//     }

// }


// abstract
public abstract class Lamp {
    private int watt;


    int annualPowerConsumption(int hoursPerDay){
        return (this.watt * hoursPerDay * 365) / 1000;
    }

    /**
     * @return the watt
     */
    public int getWatt() {
        return this.watt;
    }
    
    // /**
    //  * @param watt the watt to set
    //  */
    // public void setWatt(int watt) {
    //     this.watt = watt;
    // }

    // Lamp(){
    //     this(10);
    // }

    Lamp(int watt){
        if(watt <= 0){
            System.out.println("You entered a negative or zero number for watt. Default to 10 Watt");
            this.watt = watt;
        }else{
            this.watt = watt;
        }
    }

    public abstract String annualConsumptionAsReadableString(int hoursPerDay);
}