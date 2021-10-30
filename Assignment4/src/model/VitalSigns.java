package model;

/**
 * @author Siyuan He
 * @create 2021-10-28 12:38
 */
public class VitalSigns {
    private int highPressure;
    private int lowPressure;

    public VitalSigns(int highPressure, int lowPressure) {
        this.highPressure = highPressure;
        this.lowPressure = lowPressure;
    }

    public VitalSigns() {
    }

    public int getHighPressure() {
        return highPressure;
    }

    public void setHighPressure(int highPressure) {
        this.highPressure = highPressure;
    }

    public int getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(int lowPressure) {
        this.lowPressure = lowPressure;
    }

    @Override
    public String toString() {
        return highPressure + ", " + lowPressure;
    }
    
}
