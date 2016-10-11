import java.util.Date;

public class Cuenta {
    private int cantCuentas = 0;
    private int numCuenta;
    private double saldo;
    private Date fechaCreacion;
    private String dueno;

    private String numCuentaSerie;
    private static int countSerie;

    /*****************************************************************
     *
     * Constructores
     *
     *****************************************************************/
    public Cuenta(String pNombre, double pMonto) {
        setDueno(pNombre);
        setSaldo(pMonto);
        setNumCuenta();
        setFechaCreacion();
        setCantCuentas();
    }

    /*****************************************************************
     *
     * Setters
     *
     *****************************************************************/
    public void setCantCuentas() {
        this.cantCuentas = cantCuentas;
    }

    public int setNumCuenta() {
        numCuenta = ++countSerie;

        return numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setFechaCreacion() {
        this.fechaCreacion = new Date();
    }

    /*****************************************************************
     *
     * Getters
     *
     *****************************************************************/
    public int getCantCuentas() {
        return cantCuentas;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getDueno() {
        return dueno;
    }

    /*****************************************************************
     * Rutina:  depositar
     *
     * Propósito: Aumentar el saldo de la Cuenta
     *
     *****************************************************************/
    public String depositar(double pMonto) {
        return "Deposite";
    }

    /*****************************************************************
     * Rutina:  retirar
     *
     * Propósito: Disminuye el saldo de la Cuenta
     *
     *****************************************************************/
    public String retirar(double pMonto) {
        return "Retire";
    }

    /*****************************************************************
     * Rutina:  toString
     *
     * Propósito: Muestra Estado
     *
     *****************************************************************/
    public String toString() {
        String resul = "Estado actual de la Cuenta: " + "\n";

        resul += "Numero de Cuenta: " + getNumCuenta() + "\n";
        resul += "Dueño de Cuenta: " + getDueno() + "\n";
        resul += "Saldo de Cuenta: " + getSaldo() + "\n";
        resul += "Fecha creacion de Cuenta: " + getFechaCreacion() + "\n";
        resul += "Cantidad de Cuentas: " + getCantCuentas() + "\n";

        return resul;
    }
}
