
public class Bulb extends Lamp {

    // musst declare this Method!!!
    String annualConsumptionAsReadableString(int hoursPerDay){
        return ("A bulb consumes " + annualPowerConsumption(hoursPerDay) + " KWh per year when on for " + hoursPerDay + " hours per day.");
    }

    Bulb(int watt){
        super(watt);
    }


}