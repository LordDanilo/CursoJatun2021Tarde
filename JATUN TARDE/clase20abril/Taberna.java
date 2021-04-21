public class Taberna{
    private Dream[] memoria;
    private int posLibre;
    public Taberna(int tam){
        memoria  = new Dream[tam];
        posLibre = 0;
    }

    public String almacenarDream(Dream nuevo){
        String res;
        if(posLibre < memoria.length){
            memoria[posLibre] = nuevo;
            buscarPosicionLibre();
            res = "Se guardo el elemento exitosamente";
        }else{
            res = "No se puede guardar el elemento, no hay espacio disponible";
        }
        return res;
    }
    public String eliminarDream(int pos){
        String res;
        if(pos>=0 && pos<memoria.length){
            if(memoria[pos] != null){
                memoria[pos] = null;
                buscarPosicionLibre();
                res = "Dato eliminado";
            }else{
                res = "La posicion indicada, no contiene ningun Dream";
            }
        }else{
            res = "Posicion no valida";
        }
        return res;
    }
    private void buscarPosicionLibre(){
        boolean bandera = false;
        for(int pos = 0; pos<memoria.length && bandera==false; pos++){
            Dream actual = memoria[pos];
            if(actual == null){
                bandera = true;
                posLibre = pos;
            }
        }
        if(bandera == false){
            posLibre = memoria.length;
        }
    }
    public String generarReporte(){
        String res = "";
        for(int pos=0; pos<memoria.length; pos++){
            Dream aux = memoria[pos];
            if(aux != null){
                String nombre = aux.getNombre();
                String desc = aux.getDescripcion();
                res = res+nombre+" "+desc+"\n";
            }
        }
        return res;
    }
}
