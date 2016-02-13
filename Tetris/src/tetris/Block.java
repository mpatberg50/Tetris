
package tetris;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Graphics;

//the individual blocks
public class Block extends JComponent{
    private int x, y, height;
    private Color color;
    public Block(int X, int Y, int Height,Color c)
    {
        x=X;
        y=Y;
        height = Height;
        color = c;
        
    }
    
    public void moveX(int length)
    {
        x+=length;
    }
    public void moveY(int length)
    {
        y+=length;
    }
    public void paintComponent(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x,y,height,height);
        g.setColor(Color.black);
        g.drawRect(x, y, height, height);
    }
    
}