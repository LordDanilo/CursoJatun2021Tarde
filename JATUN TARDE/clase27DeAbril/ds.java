
/**
 * Write a description of class ds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ds extends Gato implements ElemetoJuego, Vida, Poder
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ds
     */
    public ds()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public String saludar(){
        return "Hola";
    }
}
