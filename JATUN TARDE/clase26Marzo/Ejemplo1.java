/**
 * Write a description of class Ejemplo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejemplo1
{
    public String verificarMayoriaDeEdad(int edad){
        String res;
        
        if(edad >= 18){
            //Entra cuando tu condicion es verdadera(osea cuando te dice si)
            res = "Eres Mayor de Edad";
        }else{
            //Entra cuandno tu condicion es falsa(osea cuando te dice no)
            res = "NO eres mayor de edad";
        }
        return res;
    }
}
