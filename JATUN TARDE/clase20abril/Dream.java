public class Dream{
    private String nombre;
    private String descripcion;
    
    public Dream(String valNombre, String valDesc){
        nombre      = valNombre;
        descripcion = valDesc;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
}
