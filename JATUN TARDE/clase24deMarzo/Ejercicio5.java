/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio5{
    public int formarNumero(int a, int b, int c){
        int respuesta;
        int primeraMulti = c*10;
        int segundaMulti = b*100;
        respuesta = (primeraMulti+a)+segundaMulti;
        return respuesta;
    }
}
