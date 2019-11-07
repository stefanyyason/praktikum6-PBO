/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
public class aplikasiwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("title");
        JPanel p = new JPanel();
        JButton b = new JButton("press me");
        
        f.setSize(400, 400);
        
        p.add(b); //add button to panel
        f.setContentPane(p); //add panel to frame
        
        f.show();
    }
}
