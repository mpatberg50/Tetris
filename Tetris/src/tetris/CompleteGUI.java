package tetris;

import javax.swing.JFrame;
import java.awt.Color;

//The overall final GUI with all components on it
public class CompleteGUI extends JFrame
{
    private enum blockType{
    IBlock,
    OBlock,
    TBlock,
    SBlock,
    ZBlock,
    JBlock,
    LBlock
};
    private final Color blockColors[]=
    {Color.yellow,
        Color.cyan,
        Color.MAGENTA,
        Color.orange,
        Color.red,
        Color.darkGray,
        Color.GREEN  
    };
    
    
    public CompleteGUI()
    {   
        super("Tetris");
        Block b1 = new Block(50,50,100,Color.yellow);
        this.add(b1);
        BlockSetsSingle b = new BlockSetsSingle(10,10);
        this.getContentPane().add(b);
    }
    
    public void createBlock(blockType b)
    {
        Color c;
            
        
        switch(b)
        {
            case IBlock:
                c = blockColors[0];
                break;
            case OBlock:
                c = blockColors[1];
                 break;
            case TBlock:
                c = blockColors[2];
                break;
            case SBlock:
                c = blockColors[3];
                break;                
            case ZBlock:
                c = blockColors[4];
                break;            
            case JBlock:
                c = blockColors[5];
                break;            
            case LBlock:
                c = blockColors[6];
                break;
        }
    }
}