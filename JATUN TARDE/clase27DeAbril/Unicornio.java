public class Unicornio extends Criatura{
    private int cantidadCuernos;
    public Unicornio(String valorNombre, int valorEdad, int valorCuernos){
        setNombre(valorNombre);
        setEdad(valorEdad);
        cantidadCuernos = valorCuernos;
    }
    
    @Override
    public String emitirRugido(){
        return "WIIIIIIIIIIIIIIIIIIIIIIIIIII(Sonido de Unicornio)";
    }
}
