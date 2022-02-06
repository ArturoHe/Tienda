package logica;

import Clases.persona.cliente.Cliente;
import Clases.persona.proveedor.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Arturo
 */
public class Listas {

    //-----------------------------------------------Agenda-----------------------------------------------
    public Listas() {
        ArrayList<Proveedor> listaProveedores = new ArrayList<>();
        listaProveedores = crearListaInicial();
    }

    //Atributo
    private static ArrayList<Proveedor> listaProveedores = new ArrayList<>();

    private static int comienzoAgenda = 0;

    //Get & Set
    public static int getComienzoAgenda() {
        return comienzoAgenda;
    }

    public static void setComienzoAgenda(int comienzoAgenda) {
        Listas.comienzoAgenda = comienzoAgenda;
    }

    public static ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public static void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
        Listas.listaProveedores = listaProveedores;
    }

    public static ArrayList crearListaInicial() {
        ArrayList<Proveedor> listaContactos = new ArrayList<>();

        ProveedorEmpresa manifiesta = new ProveedorEmpresa(215116516, "Daniel Rios", true, "Ropa", "Colombia",
                "Anori", "Cll 4 #10 - 25", "Manifiesta Confecciones",
                "3051651654", "manifiesta@gmil.com");

        ProveedorEmpresa tercerAcuerdo = new ProveedorEmpresa(995626266, "Camila Gonzales", true, "Cafe El tercer Acuerdo", "Colombia",
                "Planadas", "Cll 7 #11 - 17", "Cafe El tercer acuerdo",
                "3194156838", "teceracuerdo@gmil.com");

        ProveedorEmpresa paramillo = new ProveedorEmpresa(154895416, "Bernardo Cifuentes", true, "Cafe Paramillo", "Colombia",
                "Ituango", "Cll 1 #20 - 17", "Cooperativa Multiactiva de Emprendedores del Campo Colombiano",
                "3216519888", "manifiesta@cmecc.com");

        ProveedorPersonaNatural mielMontaña = new ProveedorPersonaNatural(489516599, "Lunes", false, "Miel de la Montaña", "Colombia", "Anori",
                "Cll 1 #8 - 10", "Mauricio Torres - Miel de la Montaña", "31891658", "mielmontaña@gmil.com");

        ProveedorPersonaNatural confeccionesLaMontaña = new ProveedorPersonaNatural(569485698, "Miercoles", true, "Ropa", "Colombia", "Anori",
                "Cll 3 #8 - 06", "Diana Gomez - Confecciones La Montaña", "3054297748", "atencion@confemon.com");

        ProveedorPersonaNatural laRoja = new ProveedorPersonaNatural(889149885, "Viernes", true, "Cerveza La Roja", "Colombia", "Vereda la Fila",
                "Km 4 via Principal", "Carlos Bejarano - Cerveza La Roja", "31891658", "laroja@gmil.com");

        listaContactos.add(manifiesta);
        listaContactos.add(tercerAcuerdo);
        listaContactos.add(paramillo);
        listaContactos.add(mielMontaña);
        listaContactos.add(confeccionesLaMontaña);
        listaContactos.add(laRoja);

        return listaContactos;

    }

    //---------------------------------------------Fin Agenda---------------------------------------------
    //-----------------------------------------------Loogin-----------------------------------------------
    //Atributo
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    private static int comienzoLogin = 0;

    private static String usuarioActual;
    
    private static Map<String, String> baseClientes = new HashMap<>();

    //Get & Set
    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static void setListaClientes(ArrayList<Cliente> aListaClientes) {
        listaClientes = aListaClientes;
    }

    public static int getComienzoLogin() {
        return comienzoLogin;
    }

    public static void setComienzoLogin(int aComienzoLogin) {
        comienzoLogin = aComienzoLogin;
    }

    public static ArrayList crearListaInicialClientes() {
        ArrayList<Cliente> listaClientesLoc = new ArrayList<>();

        Cliente cliente01 = new Cliente("a", "a", "Admin", "celAdmin", "CorreoAdmin");

        listaClientesLoc.add(cliente01);
        return listaClientesLoc;
    }

    public static Map<String, String> getBaseClientes() {
        return baseClientes;
    }

    public static void setBaseClientes(Map<String, String> baseClientes) {
        Listas.baseClientes = baseClientes;
    }
    
    public static String getUsuarioActual() {
        return usuarioActual;
    }

    public static void setUsuarioActual(String aUsuarioActual) {
        usuarioActual = aUsuarioActual;
    }
    

    //---------------------------------------------Fin Loogin---------------------------------------------
}
