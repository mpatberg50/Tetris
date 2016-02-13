/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
//This cont
public class Field extends JPanel{
    
    public Field()
    {
        super();
        Block b = new Block(10,10,50,Color.black);
        b.paint(null);
    }
}
