
public class LedBulb extends Lamp {

    String annualConsumptionAsReadableString(int hoursPerDay){
        return ("A led bulb consumes " + annualPowerConsumption(hoursPerDay) + " KWh per year when on for " + hoursPerDay + " hours per day.");
    }

    public LedBulb(int watt){
        super(watt);
    }
}