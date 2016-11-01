import java.io.*;
import java.util.ArrayList;

public class UIBikes {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    private static ArrayList<Object> listaObjetos = new ArrayList<Object>();
    private static ArrayList<Bicycle> listaBicycle = new ArrayList<Bicycle>();
    private static ArrayList<MountainBike> listaMountainBike = new ArrayList<MountainBike>();

    private static Bicycle bici;
    private static MountainBike biciMtb;
    private static RoadBike biciRuta;

    public static void main(String[] args)throws java.io.IOException{
        bici = new Bicycle();
        biciMtb = new MountainBike();
        biciRuta = new RoadBike();

        listaObjetos.add(bici);
        listaObjetos.add(biciMtb);
        listaObjetos.add(biciRuta);

        out.println();
        out.println("Imprimir Objetos");
        out.println();
        imprimir(listaObjetos);

        listaBicycle.add(bici);
        listaBicycle.add(biciMtb);
        listaBicycle.add(biciRuta);

        out.println();
        out.println("Imprimir Bicycle");
        out.println();
        imprimir(listaBicycle);

        listaMountainBike.add(bici);
        listaMountainBike.add(biciMtb);
        listaMountainBike.add(biciRuta);

    }

    public static void imprimir(ArrayList lista){
        Object obj;
        for(int i = 0; i < lista.size(); i++){
            obj = lista.get(i);
            out.print(obj.toString());
        }
    }
}
