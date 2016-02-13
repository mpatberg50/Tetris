package tetris;

import java.awt.Color;

public class BlockSetsDouble extends BlockSets
{
    private Block b1,b2;
    public BlockSetsDouble(int X, int Y)
    {
        super.color=Color.cyan;
        x=X;
        y=Y;
        b1 = new Block(0,0,super.blockSize,Color.CYAN);
        b2 = new Block(super.blockSize,0,super.blockSize,super.color);
        this.add(b1,b2);
    }
    
    public  void moveDown()
    {
        
    }
    public  void moveLeft()
    {
        
    }
    public void moveRight()
    {
        
    }
    public void rotateLeft()
    {
        
    }
    public void rotateRight()
    {
        
    }
}