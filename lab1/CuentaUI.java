/**
 * Desc: Laboratorio 1.
 *
 * Desarrollado por: Jose Leiva
 * Fecha de Creacion: 7 de Octubre 2016
 * Fecha Modificacion: 10 de Octubre 2016
 * Modificado por: Jose Leiva
 *
 */
import java.io.*;
public class CuentaUI {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;
    private static int cantCuentas = 0;
    private static Cuenta[] listadoCuentas = new Cuenta[3]; /** Alambro la cantidad de Cuentas **/

    public static void main(String[] args)throws java.io.IOException{
        int opc;
        int noSalir;

        do{
            menu();
            opc = leerOpcionSelecionada();
            noSalir = ejecutarAccionSeleccionada(opc);
        }while (noSalir != 0);
    }

    public static void menu(){
        out.println();
        out.println("============== Menu =========================");
        out.println("1. Crear Cuenta");
        out.println("0. Salir");
        out.println();
    }

    public static int leerOpcionSelecionada()throws java.io.IOException{
        int opcion;

        out.print("Seleccione accion a realizar: ");
        opcion = Integer.parseInt(in.readLine());
        out.println();

        return opcion;
    }

    public static int ejecutarAccionSeleccionada(int opcion)throws java.io.IOException {
        int    noSalir = -1;

        if (opcion == 1) {
            if(cantCuentas < listadoCuentas.length) {
                String nombreDueno;
                double depositoInicial;

                out.println("Indique Nombre del dueño: ");
                nombreDueno = in.readLine();
                out.println("Indique deposito inicial: ");
                depositoInicial = Double.parseDouble(in.readLine());

                listadoCuentas[cantCuentas] = new Cuenta(nombreDueno, depositoInicial);
                out.println();
                out.println("Cuenta creada!");
                out.println();

                out.println(listadoCuentas[cantCuentas].toString());

                cantCuentas++;
            } else {
                out.println("-----------------------------");
                out.println("No hay espacio para crear Cuentas, por el momento solo hay espacio para 3.");
                out.println("-----------------------------");
            }
        } else {
            noSalir = 0;
        }

        return noSalir;
    }
}
