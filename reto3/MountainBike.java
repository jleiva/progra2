public class MountainBike extends Bicycle {
    private String suspension;

    /*****************************************************************
     *
     * Constructores
     *
     *****************************************************************/
    public MountainBike() {
        super();
        setSuspensionType("Delantera");
    }
    public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType) {
        super(startCadence, startSpeed, startGear);
        setSuspensionType(suspensionType);
    }

    /*****************************************************************
     *
     * Setters
     *
     *****************************************************************/
    public void setSuspensionType(String suspensionType) {
        if (suspensionType == "Delantera" || suspensionType == "Trasera") {
            this.suspension = suspensionType;
        } else {
            this.suspension = "Tipo no valido";
        }
    }

    /*****************************************************************
     *
     * Getters
     *
     *****************************************************************/
    public String getSuspensionType() {
        return suspension;
    }

    public String toString() {
        String resul = "Estado: " + "\n";

        resul += "Tipo: Mountain Bike" + "\n";
        resul += "Candece: " + getCadence() + "\n";
        resul += "Speed: " + getSpeed() + "\n";
        resul += "Gear: " + getGear() + "\n";
        resul += "Suspension Type: " + getSuspensionType() + "\n";
        resul += "==============================" + "\n";

        return resul;
    }
}
