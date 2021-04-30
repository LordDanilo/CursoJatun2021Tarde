public class Mensaje{
    private int remitente;
    private int destinatario;
    private String estado;
    private String contenido;
    
    public Mensaje(int remitente, int destinatario, String contenido){
        this.remitente    = remitente;
        this.destinatario = destinatario;
        this.contenido    = contenido;
        estado = "enviado";
    }
}
