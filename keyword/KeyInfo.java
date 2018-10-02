 import javax.swing.JFrame;
 import javax.swing.*;
 import javax.swing.event.*;
 import java.awt.*;
 import java.io.*;
 public class KeyInfo {
 public static void main(String[] args)
    {
        JFrame frm = new JFrame();
        frm.setSize(100, 100);
        JTextField tf = new JTextField();
        tf.setSize(80, 25);
        tf.setLocation(10, 10);
        tf.addKeyListener(new KeyListener()
            {
            public void keyPressed(KeyEvent e)
            {
                System.out.println("keyPressed");
                System.out.println(e.getKeyCode());
            }

            public void keyReleased(KeyEvent e)
            {
                System.out.println("keyReleased");
                System.out.println(e.getKeyCode());
            }

            public void keyTyped(KeyEvent e)
            {
                System.out.println("keyTyped");
                System.out.println(e.getKeyChar());
            }
        });
        
        frm.getContentPane().setLayout(null);
        frm.getContentPane().add(tf);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
    }}