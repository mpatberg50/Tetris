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


public abstract class BlockSets {
    protected Color color;
    
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
    public abstract void rotateLeft();
    public abstract void rotateRight();
}
