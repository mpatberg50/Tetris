package tetris;

import java.awt.Graphics;

//the block set of a single block
public class BlockSetsSingle extends BlockSets
{
    private Block b;
    public BlockSetsSingle(int X, int Y)
    {
        
        x=X;
        y=Y;
        b = new Block(0,0,super.blockSize,color.yellow);
     
        this.add(b);
         b.paint(null);  
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