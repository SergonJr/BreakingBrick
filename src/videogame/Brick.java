package videogame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Sergon et Noe
 */
public class Brick extends Item
{

    private Game game;
    private int speed = 5;
    
    public Brick(int x, int y, int width, int height, Game game) 
    {
        super(x, y, width, height);
        this.game = game;
    }

    @Override
    public void render(Graphics g) 
    {
        g.setColor(Color.blue);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public void tick()
    {
        
    }
}