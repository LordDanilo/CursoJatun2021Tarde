public class Ejemplo{
    private int[] arr;
    
    public Ejemplo(){
        arr = new int[]{2,3,4,5};
    }
    public void modificarDato(){
        arr[0] = 99;
    }
    public int obtenerDato(){
        int res = arr[1];
        return res;
    }
}
