package logica;

import Clases.persona.proveedor.*;
import java.util.ArrayList;

/**
 *
 * @author Arturo
 */
public class Listas {

    //Atributo
    private static ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    
    private static int comienzo = 0;
    
    //Get & Set
    public static int getComienzo() {
        return comienzo;
    }

    public static void setComienzo(int comienzo) {
        Listas.comienzo = comienzo;
    }
   

    public static ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    
    public static void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
        Listas.listaProveedores = listaProveedores;
    }

    public Listas() {
        ArrayList<Proveedor> listaProveedores = new ArrayList<>();
        listaProveedores = crearListaInicial();
    }

    public static ArrayList crearListaInicial() {
        ArrayList<Proveedor> listaContactos = new ArrayList<>();

        ProveedorEmpresa manifiesta = new ProveedorEmpresa(21321855, "Ropa", "Colombia", "Anori", "Cll 145 #82 - 57",
                "Manifiesta Confecciones", "318599632", "manifiesta@gmail.com");

        ProveedorEmpresa colorines = new ProveedorEmpresa(21321855, "Ropa", "Colombia", "Anori", "Cll 145 #82 - 57",
                "Manifiesta Confecciones", "318599632", "manifiesta@gmail.com");

        ProveedorEmpresa colorones = new ProveedorEmpresa(21321855, "Ropa", "Colombia", "Anori", "Cll 145 #82 - 57",
                "Manifiesta Confecciones", "318599632", "manifiesta@gmail.com");

        listaContactos.add(manifiesta);

        listaContactos.add(colorines);

        listaContactos.add(colorones);

        return listaContactos;

    }

    public static ArrayList subirCambio(ArrayList listaSubir) {
        ArrayList<Proveedor> listaProveedoresSubir = new ArrayList<>();
        listaProveedoresSubir = listaSubir;

        return listaProveedoresSubir;
    }

}
