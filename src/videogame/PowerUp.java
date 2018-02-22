package videogame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Sergon
 */
public class PowerUp extends Item
{    
    private int pow;        // determines the kind of power
    private Game game;      // to interact with game object
    Random rand = new Random();
    
    public PowerUp(int x, int y, int width, int height, Game game)
    {
        super(x, y, width, height);
        this.game = game;
        pow = rand.nextInt(3) + 1;
    }

    @Override
    public void tick()
    {
        setY(getY() - 5);                
    }

    @Override
    public void render(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }             
    
    public void increaseBar()
    {
        game.getPlayer().setWidth(game.getPlayer().getWidth() * 2);
    }
    
    public void decreaseBar()
    {
        game.getPlayer().setWidth(game.getPlayer().getWidth() / 2);
    }
    
    public void setInstaKill()
    {
        game.getBall().setAttackP(5);        
    }
    
    public void disableInstaKill()
    {
        game.getBall().setAttackP(1);
    }
}
