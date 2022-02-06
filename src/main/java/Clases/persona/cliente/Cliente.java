package Clases.persona.cliente;

import clases.persona.Persona;

public class Cliente extends Persona {

    //Atributos
    private String usuario;
    private String contrasena;

    
    //Constructor
    public Cliente() {
    }

    
    
    public Cliente(String usuario, String contraseña, String nombre, String celular, String correo) {
        super(nombre, celular, correo);
        this.usuario = usuario;
        this.contrasena = contraseña;
    }
    
    
    //Get & Set
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
