package model;

/**
 * @author Siyuan He
 * @create 2021-10-28 12:48
 */
public class Encounter {
    private VitalSigns bloodPressure;

    public Encounter(VitalSigns bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Encounter() {
    }

    public VitalSigns getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(VitalSigns bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return bloodPressure.toString();
    }
    
}
