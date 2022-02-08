package logica;

import Clases.persona.cliente.Cliente;
import Clases.persona.proveedor.*;
import Clases.producto.Producto;
import Clases.producto.tipos.*;
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
    //Atributos
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    private static int comienzoLogin = 0;

    private static String usuarioActual;
    
    private static int indexActualListaClientes;
    
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
        Cliente cliente02 = new Cliente("daniel35", "XcY1256", "Daniel Perez", "316856940", "danielper@gmoil.com");
        Cliente cliente03 = new Cliente("sofia846", "CiLsU35", "Sofia Carmona", "318545369", "soficar@joutluk.com");
        

        listaClientesLoc.add(cliente01);
        listaClientesLoc.add(cliente02);
        listaClientesLoc.add(cliente03);
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
    
    public static int getIndexActualListaClientes() {
        return indexActualListaClientes;
    }

    public static void setIndexActualListaClientes(int aIndexActualLista) {
        indexActualListaClientes = aIndexActualLista;
    }
    
    

    //---------------------------------------------Fin Loogin---------------------------------------------
    //--------------------------------------------- Productos---------------------------------------------
    //Atributos
    private static ArrayList<Producto> listaProductos = new ArrayList<>();
    
    //Get & Set
    public static ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public static void setListaProductos(ArrayList<Producto> aListaProductos) {
        listaProductos = aListaProductos;
    }
    
    public static ArrayList crearListaInicialProductos(){
        
        ArrayList<Producto> listaProductosLocal = new ArrayList<>();
        
        Fruta fruta1 = new Fruta(true, 500, "Malus Domestica", false, "Manzana", "Manzana roja nacional", 0, "Fruta", 1000);
        Fruta fruta2 = new Fruta(true, 1000, "Musa Paradisiaca", false, "Banano", "Banano Cavendish Nacional", 1, "Fruta", 3000);
        Fruta fruta3 = new Fruta(true, 500, "Prunus domestica", true, "Chile", "Ciruela", "Ciruela roja importada", 2, "fruta", 4500);
        
        Verdura verdura1 = new Verdura(true, 500, "Beta vulgaris", false, "Acelga", "Acelga nacinal", 3, "Verdura", 1800);
        Verdura verdura2 = new Verdura(true, 2500, "Solanum phureja", false, "Papa Criolla", "Papa Criolla", 4, "Verdura", 4000);
        Verdura verdura3 = new Verdura(true, 3000, "Dioscorea alata", true, "Nigeria", "Name", "Name importado", 5, "Verdura", 4000);
        
        Cereal cereal1 = new Cereal(false, 1000, "Triticum", false, "Harina de trigo", "Trigo Nacional", 6, "Cereal", 2000);
        Cereal cereal2 = new Cereal(false, 1000, "Oryza sativa", false, "Arroz", "Arroz llanero Nacional", 7, "Cereal", 3100);
        Cereal cereal3 = new Cereal(false, 1000, "Zea mays", false, "Maiz", "Maiz nacional", 50003, "Cereal", 8);
        
        Carne carne1 = new Carne(false, 1000, "Cerdo", false, "Carne de Cerdo", "Carne de Cerdo nacional", 9, "Carne", 7000);
        Carne carne2 = new Carne(false, 1000, "Res", false, "Carne de Res", "Carne de Res nacional", 10, "Carne", 15000);
        Carne carne3 = new Carne(false, 1000, "Pollo", true,"Ecueador", "Pollo", "Pollo importado", 11, "Carne", 8000);
        
        Aseo aseo1 = new Aseo(false, 4000, "Ariol", false, "Jabon en polvo", "Jabon Ariol en Polvo", 12, "Aseo", 32000);
        Aseo aseo2 = new Aseo(true, 500, "Panteno", true,"USA", "Shampoo", "Shampoo Panteno", 13, "Aseo", 18100);
        Aseo aseo3 = new Aseo(true, 90, "Dova", true,"USA", "Jabon", "Jabon Dova", 14, "Aseo", 10710);
        
        Otro otro1 = new Otro(true, false, 189, false, "Cerveza La Roja", "Cerveza de la paz", 15, "Otro", 3400);
        Otro otro2 = new Otro(false, true, 50, false, "Bolso", "Bolso Rojo Manifiesta", 16, "Otro", 140000);
        Otro otro3 = new Otro(true, false, 356, false, "Cafe Paramillo", "Cafe de la paz", 17, "Otro", 8000);
        
        listaProductosLocal.add(fruta1);
        listaProductosLocal.add(fruta2);
        listaProductosLocal.add(fruta3);
        
        listaProductosLocal.add(verdura1);
        listaProductosLocal.add(verdura2);
        listaProductosLocal.add(verdura3);
        
        listaProductosLocal.add(cereal1);
        listaProductosLocal.add(cereal2);
        listaProductosLocal.add(cereal3);
        
        listaProductosLocal.add(carne1);
        listaProductosLocal.add(carne2);
        listaProductosLocal.add(carne3);
        
        listaProductosLocal.add(aseo1);
        listaProductosLocal.add(aseo2);
        listaProductosLocal.add(aseo3);
        
        listaProductosLocal.add(otro1);
        listaProductosLocal.add(otro2);
        listaProductosLocal.add(otro3);
        
        
        return listaProductosLocal;
   }
    //-------------------------------------------Fin Productos--------------------------------------------
    //----------------------------------------------Carrito-----------------------------------------------
    //Atributos
    private static ArrayList<Producto> listaCarrito = new ArrayList<>();
    
    //Get & Set
    public static ArrayList<Producto> getListaCarrito() {
        return listaCarrito;
    }

    public static void setListaCarrito(ArrayList<Producto> aListaCarrito) {
        listaCarrito = aListaCarrito;
    }
    
    
}
