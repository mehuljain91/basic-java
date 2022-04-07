// Temperature Converter

import javax.swing.*;
import java.awt.event.*;

// Using JFrame from swing

public class Temp_Converter extends JFrame {
    JLabel toLabel, enterLabel, convertLabel, fromLabel;
    JComboBox tc1, tc2;
    JTextField t1, t2;
    JButton convertBtn, dot, ac, bs, pm;
    JButton a0, a1, a2, a3, a4, a5, a6, a7, a8, a9;

    public Temp_Converter(String s) {
        super(s);
    }

    // Setting Components

    public void setComp() {
        String arr1[] = {"Celsius", "Fahrenheit", "Kelvin"};
        String arr2[] = { "Celsius", "Fahrenheit", "Kelvin" };

        toLabel= new JLabel("To");
        enterLabel = new JLabel("Enter the value: ");
        convertLabel = new JLabel("Converted value: ");
        fromLabel = new JLabel("From");

        tc1 = new JComboBox(arr1);
        tc2 = new JComboBox(arr2);

        t1 = new JTextField();
        t2 = new JTextField();

        convertBtn = new JButton("Convert");
        dot = new JButton(".");
        pm = new JButton("±");
        bs = new JButton("<--");
        ac = new JButton("AC");

        a0 = new JButton("0");
        a1 = new JButton("1");
        a2 = new JButton("2");
        a3 = new JButton("3");
        a4 = new JButton("4");
        a5 = new JButton("5");
        a6 = new JButton("6");
        a7 = new JButton("7");
        a8 = new JButton("8");
        a9 = new JButton("9");

        setLayout(null);

        // Setting component position and size

        tc1.setBounds(75, 50, 100, 20);
        tc2.setBounds(75, 100, 100, 20);

        t1.setBounds(200, 50, 100, 20);
        t2.setBounds(200, 100, 100, 20);

        toLabel.setBounds(100, 75, 50, 20);
        fromLabel.setBounds(90, 25, 50, 20);
        enterLabel.setBounds(200, 35, 100, 20);
        convertLabel.setBounds(200, 85, 100, 20);

        convertBtn.setBounds(138, 150, 100, 20);
        ac.setBounds(238, 200, 50, 100);
        pm.setBounds(238, 350, 50, 50);
        bs.setBounds(238, 300, 50, 50);
        dot.setBounds(188, 350, 50, 50);
        a0.setBounds(88, 350, 100, 50);
        a1.setBounds(88, 200, 50, 50);
        a2.setBounds(138, 200, 50, 50);
        a3.setBounds(188, 200, 50, 50);
        a4.setBounds(88, 250, 50, 50);
        a5.setBounds(138, 250, 50, 50);
        a6.setBounds(188, 250, 50, 50);
        a7.setBounds(88, 300, 50, 50);
        a8.setBounds(138, 300, 50, 50);
        a9.setBounds(188, 300, 50, 50);

        // Adding ActionListener Handler

        convertBtn.addActionListener(new Handler());
        ac.addActionListener(new Handler());
        pm.addActionListener(new Handler());
        bs.addActionListener(new Handler());
        dot.addActionListener(new Handler());
        a0.addActionListener(new Handler());
        a1.addActionListener(new Handler());
        a2.addActionListener(new Handler());
        a3.addActionListener(new Handler());
        a4.addActionListener(new Handler());
        a5.addActionListener(new Handler());
        a6.addActionListener(new Handler());
        a7.addActionListener(new Handler());
        a8.addActionListener(new Handler());
        a9.addActionListener(new Handler());

        // Adding Component

        add(tc1);
        add(tc2);

        add(toLabel);
        add(enterLabel);
        add(convertLabel);
        add(fromLabel);

        add(t1);
        add(t2);

        add(convertBtn);
        add(ac);
        add(dot);
        add(pm);
        add(bs);

        add(a0);
        add(a1);
        add(a2);
        add(a3);
        add(a4);
        add(a5);
        add(a6);
        add(a7);
        add(a8);
        add(a9);

        t2.setEditable(false);
    }

    // ActionListener
    
    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String x, y;
            x = (String)tc1.getSelectedItem();
            y = (String)tc2.getSelectedItem();

            if(ae.getSource() == a0) {
                t1.setText(t1.getText() + "0");
            }
            if(ae.getSource() == a1) {
                t1.setText(t1.getText() + "1");
            }
            if(ae.getSource() == a2) {
                t1.setText(t1.getText() + "2");
            }
            if(ae.getSource() == a3) {
                t1.setText(t1.getText() + "3");
            }
            if(ae.getSource() == a4) {
                t1.setText(t1.getText() + "4");
            }
            if (ae.getSource() == a5) {
                t1.setText(t1.getText() + "5");
            }
            if (ae.getSource() == a6) {
                t1.setText(t1.getText() + "6");
            }
            if (ae.getSource() == a7) {
                t1.setText(t1.getText() + "7");
            }
            if (ae.getSource() == a8) {
                t1.setText(t1.getText() + "8");
            }
            if (ae.getSource() == a9) {
                t1.setText(t1.getText() + "9");
            }
            if(ae.getSource() == dot) {
                t1.setText(t1.getText() + ".");
            }
            if(ae.getSource() == ac) {
                t1.setText("");
                t2.setText("");
            }
            if(ae.getSource() == pm) {
                String spm = new String();
                spm = t1.getText();
                if(spm.length() == 0) {
                    t1.setText("-");
                } else if(spm.charAt(0) != '-') {
                    t1.setText("-" + t1.getText());
                } else {
                    t1.setText("" + spm.substring(1));
                }
            }
            if(ae.getSource() == bs) {
                int n;
                String bsp = new String();
                bsp = t1.getText();
                n = bsp.length();
                t1.setText("" + bsp.substring(0, n-1));
            }
            if(ae.getSource() == convertBtn) {
                if(x == "Celsius" && y == "Celsius") {
                    t2.setText("" + t1.getText());
                } else if(x == "Fahrenheit" && y == "Fahrenheit") {
                    t2.setText("" + t1.getText());
                } else if(x == "Kelvin" && y == "Kelvin") {
                    t2.setText("" + t1.getText());
                }

                else if (x == "Celsius" && y == "Fahrenheit") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a * 9 / 5) + 32);
                    t2.setText("" + b);
                } else if (x == "Celsius" && y == "Kelvin") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a + 273.15);
                    t2.setText("" + b);
                }

                else if (x == "Fahrenheit" && y == "Celsius") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32) * 5 / 9);
                    t2.setText("" + b);
                } else if (x == "Fahrenheit" && y == "Kelvin") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32) * 5 / 9 + 273.15);
                    t2.setText("" + b);
                }

                else if (x == "Kelvin" && y == "Celsius") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a - 273.15);
                    t2.setText("" + b);
                } else if (x == "Kelvin" && y == "Fahrenheit") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 273.15) * 9 / 5 + 32);
                    t2.setText("" + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        Temp_Converter jf = new Temp_Converter("Temperature Converter");
        jf.setComp();
        jf.setSize(400, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}