import java.util.ArrayList;
public class Contacto{
    private String nombre;
    private int edad;
    private int celular;
    private ArrayList<Contacto> contactos;
    private ArrayList<Mensaje> bandejaRecibidos;
    private ArrayList<Mensaje> bandejaEnviados;

    public Contacto(String valorNombre, int valorEdad, int valorCelular){
        nombre  = valorNombre;
        edad    = valorEdad;
        celular = valorCelular;
        contactos        = new ArrayList<>();
        bandejaRecibidos = new ArrayList<>();
        bandejaEnviados  = new ArrayList<>();
    }

    public void agregarAmigo(Contacto amigo){
        contactos.add(amigo);
    }
    public Contacto buscarPorNumero(int numeroBuscado){
        Contacto res = null;
        boolean bb = false;
        for(int pos=0; pos<contactos.size() && bb==false; pos++){
            Contacto actual   = contactos.get(pos);
            int celularActual = actual.getCelular();
            if(numeroBuscado == celularActual){
                res = actual;
                bb  = true;
            }
        }
        return res;
    }
    public int getCelular(){
        return celular;
    }
}
