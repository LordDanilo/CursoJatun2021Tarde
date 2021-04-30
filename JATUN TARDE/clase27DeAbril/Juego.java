import java.util.ArrayList;
public class Juego{
    private ArrayList<Criatura> lista;
    public Juego(){
        lista = new ArrayList<>();
    }
    public void agregarCriatura(Criatura nuevo){
        lista.add(nuevo);
    }
}
