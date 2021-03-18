import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btnp,btnce,btnd,btn1x,btnx2,btnsqr,btnh,btnj,btnk,btnl,btnb,btnbl,btnt,btn1, btn2, btn3, btn4, btn5,btn6,btn7,btn8,btn9,btn0,btnc;
    JFrame window;

    public Lab7_3() {

        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout( new FlowLayout() );

        // create numberLabel and attach it to content pane
        numberLabel = new JLabel( "Show Number : " );
        container.add( numberLabel );
        numberField = new JTextField( 10 );
        //numberField.setEditable( false );
        container.add( numberField );

        btnp = new JButton(" % ");
        btnp.addActionListener( this);
        btnp.setPreferredSize(new Dimension(60, 30));
        container.add( btnp );

        btnce = new JButton(" CE ");
        btnce.addActionListener( this);
        btnce.setPreferredSize(new Dimension(60, 30));
        container.add( btnce );

        btnc = new JButton(" C ");
        btnc.addActionListener( this);
        btnc.setPreferredSize(new Dimension(60, 30));
        container.add( btnc );
        
        btnd = new JButton(" <- ");
        btnd.addActionListener( this);
        btnd.setPreferredSize(new Dimension(60, 30));
        container.add( btnd );

        btn1x = new JButton(" 1/x ");
        btn1x.addActionListener( this);
        btn1x.setPreferredSize(new Dimension(60, 30));
        container.add( btn1x );

        btnx2 = new JButton(" x^2 ");
        btnx2.addActionListener( this);
        btnx2.setPreferredSize(new Dimension(60, 30));
        container.add( btnx2 );

        btnsqr = new JButton(" sqr ");
        btnsqr.addActionListener( this);
        btnsqr.setPreferredSize(new Dimension(60, 30));
        container.add( btnsqr );

        btnh = new JButton(" / ");
        btnh.addActionListener( this);
        btnh.setPreferredSize(new Dimension(60, 30));
        container.add( btnh );

        btn7 = new JButton(" 7 ");
        btn7.addActionListener( this);
        btn7.setPreferredSize(new Dimension(60, 30));
        container.add( btn7 );

        btn8 = new JButton(" 8 ");
        btn8.addActionListener( this);
        btn8.setPreferredSize(new Dimension(60, 30));
        container.add( btn8 );

        btn9 = new JButton(" 9 ");
        btn9.addActionListener( this);
        btn9.setPreferredSize(new Dimension(60, 30));
        container.add( btn9 );

        btnk = new JButton(" X ");
        btnk.addActionListener( this);
        btnk.setPreferredSize(new Dimension(60, 30));
        container.add( btnk );

        btn4 = new JButton(" 4 ");
        btn4.addActionListener( this);
        btn4.setPreferredSize(new Dimension(60, 30));
        container.add( btn4 );

        btn5 = new JButton(" 5 ");
        btn5.addActionListener( this);
        btn5.setPreferredSize(new Dimension(60, 30));
        container.add( btn5 );

        btn6 = new JButton(" 6 ");
        btn6.addActionListener( this);
        btn6.setPreferredSize(new Dimension(60, 30));
        container.add( btn6 );

        btnl = new JButton(" - ");
        btnl.addActionListener( this);
        btnl.setPreferredSize(new Dimension(60, 30));
        container.add( btnl );

        btn1 = new JButton(" 1 ");
        btn1.addActionListener( this);
        btn1.setPreferredSize(new Dimension(60, 30));
        container.add( btn1 );

        btn2 = new JButton(" 2 ");
        btn2.addActionListener( this);
        btn2.setPreferredSize(new Dimension(60, 30));
        container.add( btn2 );

        btn3 = new JButton(" 3 ");
        btn3.addActionListener( this);
        btn3.setPreferredSize(new Dimension(60, 30));
        container.add( btn3 );

        btnb = new JButton(" + ");
        btnb.addActionListener( this);
        btnb.setPreferredSize(new Dimension(60, 30));
        container.add( btnb );

        btnbl = new JButton(" +/- ");
        btnbl.addActionListener( this);
        btnbl.setPreferredSize(new Dimension(60, 30));
        container.add( btnbl );

        btn0 = new JButton(" 0 ");
        btn0.addActionListener( this);
        btn0.setPreferredSize(new Dimension(60, 30));
        container.add( btn0 );

        btnj = new JButton(" . ");
        btnj.addActionListener( this);
        btnj.setPreferredSize(new Dimension(60, 30));
        container.add( btnj );

        btnt = new JButton(" = ");
        btnt.addActionListener( this);
        btnt.setPreferredSize(new Dimension(60, 30));
        container.add( btnt );

        window.setSize( 280,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed( ActionEvent event )
    {
        String str = numberField.getText();

        if (event.getSource() == btn7) {
            str += "7";
            numberField.setText( str );
        }
        else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText( str );
        }
        else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText( str );
        }
        else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText( str );
        }
        else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText( str );
        }
        else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText( str );
        }
        else if (event.getSource() == btn1) {
            str += "1";
            numberField.setText( str );
        }
        else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText( str );
        }
        else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText( str );
        }
        else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText( str );
        }
        else if (event.getSource() == btnj) {
            str += ".";
            numberField.setText( str );
        }
       
    } // end method actionPerformed
    public static void main(String[] args) {
        Lab7_3 gui = new Lab7_3();
    }
}