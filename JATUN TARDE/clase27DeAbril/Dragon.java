
/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Criatura
{
    private String elementoPrimario;
    public Dragon(String valorNombre, int valorEdad, String valorElemento){
        setNombre(valorNombre);
        setEdad(valorEdad);
        elementoPrimario = valorElemento;
    }
    public Dragon(){
        elementoPrimario = "Fuego";
    }
    
    @Override
    public String saludar(){
        String res;
        res = "Hola, soy un dragon y tengo "+getEdad()+" años de vida";
        return res;
    }
    @Override
    public String emitirRugido(){
        return "ROOOAAAAR (rugido De Dragon)";
    }
}
