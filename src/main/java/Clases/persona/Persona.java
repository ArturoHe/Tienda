package clases.persona;

public abstract class Persona {

    //Atributos
    private String nombre;
    private String celular;
    private String correo;

    //Constructor
    public Persona() {
    }

    public Persona(String nombre, String celular, String correo) {
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
    }
    
    

    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
