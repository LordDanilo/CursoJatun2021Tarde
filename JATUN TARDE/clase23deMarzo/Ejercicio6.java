/**
 * Write a description of class Ejercicio6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio6{
    public String calcularTiempo(){
        String respuesta;
        int horaDormir       = 2;
        int minutosDormir    = 45;
        int horaDespertar    = 11;
        int minutosDespertar = 25;
        
        int minutosRes = (minutosDespertar+60)-minutosDormir;
        int horaRes    = horaDespertar-(horaDormir+1);
        
        respuesta = horaRes+":"+minutosRes;
        return respuesta;
    }
    public int calcularTiempoMinutos(){
        int respuesta;
        int horaDormir       = 2;
        int minutosDormir    = 45;
        int horaDespertar    = 11;
        int minutosDespertar = 25;
        
        int minutosRes = (minutosDespertar+60)-minutosDormir;
        int horaRes    = horaDespertar-(horaDormir+1);
        
        respuesta = (horaRes*60)+minutosRes;
        return respuesta;
    }
}
