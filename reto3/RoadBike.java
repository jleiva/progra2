public class RoadBike extends Bicycle {
    private int tireWidth;

    /*****************************************************************
     *
     * Constructores
     *
     *****************************************************************/
    public RoadBike() {
        super();
        setTireWidth(23);
    }

    public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth) {
        super(startCadence, startSpeed, startGear);
        setTireWidth(newTireWidth);
    }

    /*****************************************************************
     *
     * Setters
     *
     *****************************************************************/
    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    /*****************************************************************
     *
     * Getters
     *
     *****************************************************************/
    public int getTireWidth() {
        return tireWidth;
    }

    public String toString() {
        String resul = "Estado: " + "\n";

        resul += "Tipo: Road Bike" + "\n";
        resul += "Candece: " + getCadence() + "\n";
        resul += "Speed: " + getSpeed() + "\n";
        resul += "Gear: " + getGear() + "\n";
        resul += "Tire Width: " + getTireWidth() + "\n";
        resul += "==============================" + "\n";

        return resul;
    }
}
