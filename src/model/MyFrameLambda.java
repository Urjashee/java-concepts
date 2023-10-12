package model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameLambda extends JFrame {
    JButton button = new JButton("My button");
    JButton button2 = new JButton("Button #2");
//    JButton button3 = new JButton("Button #3");
    public MyFrameLambda() {

        button.setBounds(100,100,200,100);
        button2.setBounds(100,200,200,100);

        button.addActionListener(
           (e) -> {
                System.out.println("This is the first button !");
            }
        );

        button2.addActionListener(
           (e) -> {
                System.out.println("This is the second button !");
            }
        );

        this.add(button);
        this.add(button2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
}