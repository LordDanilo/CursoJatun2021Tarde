public class EjemploArreglo2{
    private int[] arr;
    public EjemploArreglo2(int[] valorArr){
       arr = valorArr;
    }
    public int[] crearArray(){
        int[] res = {1,2,3,4};
        return res;
    }
    public void modificarDato(){
        arr[0] = 99;
    }
    public int obtenerDato(){
        int res = arr[0];
        return res;
    }
}
