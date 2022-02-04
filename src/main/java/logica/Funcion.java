
package logica;

import Clases.persona.cliente.Cliente;
import java.util.ArrayList;

public class Funcion {
    
    public static ArrayList agregarClienteArray(Cliente nuevoCliente, ArrayList listaClientes) {
        
        listaClientes.add(nuevoCliente);
        
        return listaClientes;        
    }
    
}
