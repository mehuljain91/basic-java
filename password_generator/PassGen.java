// Password Generator

// import packages

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PassGen extends Frame implements ActionListener {
    TextField tf;
    CheckboxGroup cbg;
    Checkbox cb1;
    Checkbox cb2;
    Checkbox cb3;
    Checkbox cb4;

    PassGen() {
        tf = new TextField();
        Label lb = new Label("Password Generator");
        cbg = new CheckboxGroup();

        cb1 = new Checkbox("6 Character", cbg, false);
        cb2 = new Checkbox("8 Character", cbg, false);
        cb3 = new Checkbox("10 Character", cbg, false);
        cb4 = new Checkbox("12 Character", cbg, false);

        Button b = new Button("Generate");

        lb.setBounds(100, 70, 200, 30);
        tf.setBounds(50, 120, 200, 30);
        cb1.setBounds(50, 200, 100, 30);
        cb2.setBounds(50, 230, 100, 30);
        cb3.setBounds(50, 260, 100, 30);
        cb4.setBounds(50, 290, 100, 30);
        b.setBounds(50, 340, 100, 30);

        b.addActionListener(this);

        // adding components
        add(lb);
        add(tf);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(b);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // event handling
    public void actionPerformed(ActionEvent e) {
        if(cb1.getState()) {
            passGenerator(6);
        } else if(cb2.getState()) {
            passGenerator(8);
        } else if(cb3.getState()) {
            passGenerator(10);
        } else if(cb4.getState()) {
            passGenerator(12);
        }
    }

    // event handling method
    public void passGenerator(int len) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        while (0 < len--) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        tf.setText(sb.toString());
    }

    public static void main(String[] args) {
        new PassGen();
    }
}
