package Clases.persona.cliente;

import clases.persona.Persona;

public class Cliente extends Persona {

    //Atributos
    private String usuario;
    private String contraseña;

    //Constructor
    public Cliente() {
    }

    //Get & Set
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
