package Clases.producto;

public abstract class Producto {
    
    //Atributos
    private String nombre;
    private String descripcion;
    private int id;
    private String tipo;
    private int precio;
    
    //Constructores

    public Producto() {
    }

    public Producto(String nombre, String descripcion, int id, String tipo, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    
    //Get & Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
