
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

    /*
     * Metodo que mueve la serpiente
     */
    public void animateSnake() 
    {
        snake.borrar(canvas);
        while (snake.mover()) 
        {
            snake.dibujar(canvas);
            canvas.wait(10); //hace que se mueva sin necesidad de invocar el metodo todo el rato
            snake.borrar(canvas);                
                   
        }
        snake.dibujar(canvas);
        //cuando no se pueda mover muestra por pantalla un mensaje
        if (!snake.mover())  {
            canvas.drawString("Game Over",  ANCHO/2,  ALTO/2);
        }

    }

}


