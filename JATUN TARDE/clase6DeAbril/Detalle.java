public class Detalle{
    public String prueba(){
        //variable de control local; condicion(en base al contador local); variacion 
        int x = 0;
        int y = 1;
        int numero = (int)Math.pow(x,y); //Math.pow(base, exp)
        String res="";
        for(;x<4; x++, y=y+3){
            res = res+"a";
        }
        
        if(x<5){
            res = "algo";
        }
        return res;
    }
}
