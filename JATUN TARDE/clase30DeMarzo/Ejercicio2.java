public class Ejercicio2{
    public int menorCosto(int a, int b, int c){
        int respuesta;
        int sum1 = a+b;
        int sum2 = a+c;
        int sum3 = b+c; 
        //a>b && b>c  ->  a>c
        //sum1 = 9
        //sum2 = 7
        //sum3 = 6
        if(sum1<sum2){
            if(sum1<sum3){
                respuesta = sum1;
            }else{
                respuesta = sum3;
            }
        }else{
            if(sum2 < sum3){
                respuesta = sum2;
            }else{
                respuesta = sum3;
            }
        }
        return respuesta;
    }
}
