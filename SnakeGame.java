
/**
/**
 * Clase SnakeGame
 * 
 * @author Fran Fuentes
 * @version 1.0
 */
public class SnakeGame
{
    private Canvas canvas;
    
    private Snake snake;
    
    private static final int ALTO = 400;
    
    private static final int ANCHO = 400;
    
    /*
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
        canvas = new Canvas("lienzo",ALTO,ANCHO);        
       
    }
            
    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
        snake = new Snake(ANCHO,ALTO);
        canvas.erase();
        snake.dibujar(canvas);
    }
    
}











