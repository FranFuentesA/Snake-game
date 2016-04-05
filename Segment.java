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
    public static int LONGITUD_SEGMENTO = 30;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
    // Diereccion en la que se dibuja el Segmento
    public final static int DERECHA = 0;
    public final static int ABAJO = 1;
    public final static int IZQUIERDA = 2;
    public final static int ARRIBA = 3;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int xPosicion, int yPosicion, int movimiento)
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
    
    /**
     * Metodo que borra el segmento
     */
    public void erase(Canvas canvas) 
    {
        canvas.erase();
    }
    
    /**
     * Metodo que devuelve la posicion final en el eje X del segmento   
     */
    public int getXPositionFinal()
    {
        int xFinal = xPosicion;
        if(movimiento == IZQUIERDA)
        {
            xFinal -= LONGITUD_SEGMENTO;
        }
        else if(movimiento == DERECHA)
        {
            xFinal += LONGITUD_SEGMENTO;
        }
        return xFinal;
    }

    /**
     * Metodo que devuelve la posicion final en el eje Y del segmento     
     */
    public int getYPositionFinal()
    {
        int yFinal = yPosicion;
        if(movimiento == ARRIBA)
        {
            yFinal -= LONGITUD_SEGMENTO;
        }
        else if(movimiento == ABAJO)
        {
            yFinal += LONGITUD_SEGMENTO;
        }
        return yFinal;
    }
    
    /**
     * Metodo que devuelve hacia que lado se mueve el segmento    
     */
    public int getMovimiento()
    {
        return movimiento;
    }
    
    /**
     * Metodo que dibuja un segmento   
     */
    public void draw(Canvas canvas) 
    {
         canvas.setForegroundColor(color);
         // Dibuja el segmento hacia la derecha
         if (movimiento == DERECHA) 
         {
               canvas.drawLine(xPosicion, yPosicion, xPosicion + LONGITUD_SEGMENTO, yPosicion);
         }
         // Dibuja el segmento hacia la izquierda
         if (movimiento == IZQUIERDA) 
         {
               canvas.drawLine(xPosicion, yPosicion, xPosicion - LONGITUD_SEGMENTO, yPosicion);
         }
          // Dibuja el segmento hacia la arriba
         if (movimiento == ARRIBA) 
         {
               canvas.drawLine(xPosicion, yPosicion, xPosicion + LONGITUD_SEGMENTO, yPosicion);
         }
          // Dibuja el segmento hacia la abajo
         if (movimiento == ABAJO) 
         {
               canvas.drawLine(xPosicion, yPosicion, xPosicion, LONGITUD_SEGMENTO + yPosicion);
         }
    }
}

