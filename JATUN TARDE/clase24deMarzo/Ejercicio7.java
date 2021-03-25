
/**
 * Write a description of class Ejercicio7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio7{
    public String evaluarVida(int poderBase, int vida){
        String respuesta;
        int residuo = vida%poderBase;
        if(residuo==0){
            respuesta = "SI";
        }else{
            respuesta = "NO";
        }
        return respuesta;
    }
}
