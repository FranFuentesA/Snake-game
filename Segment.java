import java.awt.*;
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    // instance variables - replace the example below with your own
    private int xPosicion;    
    private int yPosicion;
    private Canvas canvas;
    private int movimiento;
    private Color color;
    public static int LONGITUD_SEGMENTO = 4;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
    public final static int DERECHA = 0;
    public final static int ABAJO = 1;
    public final static int IZQUIERDA = 2;
    public final static int ARRIBA = 3;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int xPosicion, int yPosicion, int movimiento, Color color)
    {
        this.xPosicion = xPosicion;
        this.yPosicion = yPosicion;
        this.movimiento = movimiento;        
        color = Color.BLACK;
    }
        
    /**
     * Metodo que devuelve la posicion del eje x del segmento
     */
    public int getXPosicion()
    {
        return xPosicion;
    }

    /**
     * Metodo que devuelve la posicion del eje y del segmento
     */
    public int getYPosicion()
    {
        return yPosicion;
    }

}
