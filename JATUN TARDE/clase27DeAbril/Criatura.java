
/**
 * Abstract class Criatura - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Criatura
{
    private String nombre;
    private int edad;
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public String saludar(){
        return "Hola";
    }
    public abstract String emitirRugido();
}
