/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiswing;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.event.*;

public abstract class Aplikasisiswing implements ActionListener{
    
    public static void createAndShowGUI(){
        // make frame...
        JFrame frame= new JFrame("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout(null);
        //make a button
        JButton butt=new JButton("Click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20,20,200,20);
        
        //instantiate an application object
        Aplikasisiswing app = new Aplikasisiswing(){};
        //make the label
        app.label = new JLabel("nama saya merupakan");
        app.label.setBounds(20,40,200,20);
        frame.getContentPane().add(app.label);
        //set the application object to be the thing which
        //listens to the button
        butt.addActionListener(app);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        //ini akan dieksekusi ketika button diklik
        label.setText("ste cantik sekali");
    }
    public static void main(String[] args){
        //Memulai Swing GUI
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
    // application object fields
    //int clickCount=0;
    JLabel label;
}