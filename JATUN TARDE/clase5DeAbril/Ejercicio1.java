public class Ejercicio1{
    public int contarDigitos(int num){
        int res=0;
        while(num>0){
            res = res+1;
            num = num/10;
        }
        return res;
    }
}
