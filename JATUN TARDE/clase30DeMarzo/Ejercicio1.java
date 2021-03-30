public class Ejercicio1{
    public String capicua(int numero){
        String respuesta;
        int ultimoDig = numero%10;
        int primerDig = numero/100;
        if(ultimoDig == primerDig){
            respuesta = "Si";
        }else{
            respuesta = "No";
        }
        
        return respuesta;
    }
}
