/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

/**
 *
 * @author Patberg
 */
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

public abstract class BlockSets extends JPanel {
    protected Color color;
    protected final int blockSize = 10;
    protected int x,y;
    
    
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
    public abstract void rotateLeft();
    public abstract void rotateRight();
}
