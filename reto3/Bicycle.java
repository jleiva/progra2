/**
 * Created by jdleiva on 10/30/16.
 */
public class Bicycle {
    protected int cadence;
    protected int gear;
    protected int speed;

    /*****************************************************************
     *
     * Constructores
     *
     *****************************************************************/
    public Bicycle() {
        this.cadence = 0;
        this.gear = 1;
        this.speed = 0;
    }

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        this.cadence = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    /*****************************************************************
     *
     * Setters
     *
     *****************************************************************/
    public void setCadence(int newValue) {
        this.cadence = newValue;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    /*****************************************************************
     *
     * Getters
     *
     *****************************************************************/
    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    /*****************************************************************
     * Rutina: applyBreak
     * Propósito: indicará la disminución en velocidad
     * Parámetro: recibe un entero
     *
     * Retorna:
     *****************************************************************/
    public void applyBreak(int decrement) {
        int newSpeed;
        int currentSpeed = getSpeed();

    }

    /*****************************************************************
     * Rutina: speedUp
     * Propósito: recibr el aumento en la velocidad
     * Parámetro: recibe un entero
     *
     * Retorna:
     *****************************************************************/
    public void speedUp(int increment) {
        int newSpeed;
        int currentSpeed = getSpeed();

    }

    public String toString() {
        String resul = "Estado: " + "\n";

        resul += "Tipo: Bicycle" + "\n";
        resul += "Cadence: " + getCadence() + "\n";
        resul += "Speed: " + getSpeed() + "\n";
        resul += "Gear: " + getGear() + "\n";
        resul += "==============================" + "\n";

        return resul;
    }

}
