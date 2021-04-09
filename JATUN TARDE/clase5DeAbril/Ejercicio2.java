public class Ejercicio2{
    public String verificarNumero(int numero){
        String res;
        boolean bandera = true;
        for(int div=2; div<=(numero/2) && bandera==true; div++){
            if(numero%div == 0){
                bandera = false;
            }
        }
        if(bandera==true){
            res = "Es un numero Primo";
        }else{
            res = "Es numero Compuesto";
        }
        return res;
    }
}
