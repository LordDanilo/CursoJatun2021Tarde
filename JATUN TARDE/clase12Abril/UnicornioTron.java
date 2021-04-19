public class UnicornioTron{
    private int numSecreto;
    
    public UnicornioTron(){
        numSecreto = generarNumAleatorio(); //0- 0.9999....
        // 20-100
    }
    public int generarNumAleatorio(){
        return (int)((Math.random()*67)+15);
    }
}
