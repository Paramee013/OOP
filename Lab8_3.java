package oop.src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab8_3 extends JFrame implements ActionListener{
    JLabel textLabel;
    JTextField textField;
    JButton saveBtn, clearBtn, showBtn;
    JButton addBtn, subBtn, mulBtn, divBtn,modBtn,sqtrBtn,sinBtn,cosBtn,tanBtn;
    Container container;
    NumberNew obj;

    public Lab8_3(){
        super("Program Calculate Number");
        container = getContentPane();
        container.setLayout( new FlowLayout() );

        textLabel = new JLabel("Enter number :");
        textLabel.setFont(new Font("Courier New",Font.BOLD,20));
        container.add( textLabel );
        textField = new JTextField( 10 );
        textField.setFont(new Font("Courier New",Font.BOLD,24));
        container.add( textField );

        saveBtn = new JButton(" Save ");
        saveBtn.setFont(new Font("Courier New",Font.BOLD,20));
        saveBtn.addActionListener( this);
        container.add( saveBtn );

        clearBtn = new JButton(" Clear ");
        clearBtn.setFont(new Font("Courier New",Font.BOLD,20));
        clearBtn.addActionListener( this);
        container.add( clearBtn );

        showBtn = new JButton(" Show ");
        showBtn.setFont(new Font("Courier New",Font.BOLD,20));
        showBtn.addActionListener( this);
        container.add( showBtn );

        addBtn = new JButton(" + ");
        addBtn.setFont(new Font("Courier New",Font.BOLD,20));
        addBtn.addActionListener( this);
        container.add( addBtn );

        subBtn = new JButton(" - ");
        subBtn.setFont(new Font("Courier New",Font.BOLD,20));
        subBtn.addActionListener( this);
        container.add( subBtn );

        mulBtn = new JButton(" * ");
        mulBtn.setFont(new Font("Courier New",Font.BOLD,20));
        mulBtn.addActionListener( this);
        container.add( mulBtn );

        divBtn = new JButton(" / ");
        divBtn.setFont(new Font("Courier New",Font.BOLD,20));
        divBtn.addActionListener( this);
        container.add( divBtn );

        modBtn = new JButton(" Mod ");
        modBtn.setFont(new Font("Courier New",Font.BOLD,20));
        modBtn.addActionListener( this);
        container.add( modBtn );

        sqtrBtn = new JButton(" Sqrt ");
        sqtrBtn.setFont(new Font("Courier New",Font.BOLD,20));
        sqtrBtn.addActionListener( this);
        container.add( sqtrBtn );

        sinBtn = new JButton(" Sin ");
        sinBtn.setFont(new Font("Courier New",Font.BOLD,20));
        sinBtn.addActionListener( this);
        container.add( sinBtn );

        cosBtn = new JButton(" Cos ");
        cosBtn.setFont(new Font("Courier New",Font.BOLD,20));
        cosBtn.addActionListener( this);
        container.add( cosBtn );

        tanBtn = new JButton(" Tan ");
        tanBtn.setFont(new Font("Courier New",Font.BOLD,20));
        tanBtn.addActionListener( this);
        container.add( tanBtn );

        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Lab8_3 test = new Lab8_3();
        // create obj of class NumberNew
        test.obj = new NumberNew();
        test.textField.setText(test.obj.toString());
    }
    public void actionPerformed( ActionEvent event ){
        if (event.getSource() == saveBtn) {
            if(textField.getText().equals("")){

            }
            else{
            double value = Double.parseDouble(textField.getText());
            obj.setValue(value);
            textField.setText("");
            }
        }
        else if (event.getSource() == clearBtn) {
            obj.setValue( 0 );
            textField.setText("");
        }
         else if (event.getSource() == showBtn) {
            textField.setText(obj.toString());
        }
        else if (event.getSource() == addBtn) {
            double value = Double.parseDouble(textField.getText());
            obj.add(value);
            textField.setText(obj.toString());
        }
        else if (event.getSource() == subBtn) {
            double value = Double.parseDouble(textField.getText());
            obj.subtract(value);
            textField.setText(obj.toString());
        }
        else if (event.getSource() == mulBtn) {
            double value = Double.parseDouble(textField.getText());
            obj.multiply(value);
            textField.setText(obj.toString());
        }
        else if (event.getSource() == divBtn) {
            double value = Double.parseDouble(textField.getText());
            obj.divide(value);
            textField.setText(obj.toString());
        }
        else if (event.getSource() == modBtn) {
            int value = Integer.parseInt(textField.getText());
            obj.mod(value);
            textField.setText(obj.toString());
        }
        else if (event.getSource() == sqtrBtn) {
            double value = Double.parseDouble(textField.getText());
            obj.sqtr(value);
            textField.setText(obj.toString());
        }
        else if (event.getSource() == sinBtn) {
            double value = Double.parseDouble(textField.getText());
            obj.sin(value);
            textField.setText(obj.toString());
        }
        else if (event.getSource() == cosBtn) {
            double value = Double.parseDouble(textField.getText());
            obj.cos(value);
            textField.setText(obj.toString());
        }
        else if (event.getSource() == tanBtn) {
            double value = Double.parseDouble(textField.getText());
            obj.tan(value);
            textField.setText(obj.toString());
        }
    }
}
