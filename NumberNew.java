package oop.src;

import java.text.DecimalFormat;

public class NumberNew {
    private double number;
    DecimalFormat df = new DecimalFormat("#.######");

    public NumberNew() {
        setValue((double) (Math.random() * 100));
    }
    
    public NumberNew(double n){
        setValue( n );
    }

    public void setValue(double n){
        n = Double.valueOf(df.format(n));
        number = n;
    }

    public double getValue(){
        return (number);
    }

    public String toString(){
        return (Double.toString(getValue()));
    }

    public void add(double n ){
        setValue(getValue() + n);
    }

    public void subtract(double n ){
        setValue(getValue() - n);
    }

    public void multiply(double n ){
        setValue(getValue() * n);
    }

    public void divide(double n ){
        setValue(getValue() / n);
    }

    public void mod(double n ){
        setValue(getValue() % n);
    }

    public void sqtr(double n ){
        setValue((double)Math.sqrt(n));
    }

    public void sin(double n ){
        setValue((double)Math.sin(n));
    }

    public void cos(double n ){
        setValue((double)Math.cos(n));
    }

    public void tan(double n ){
        setValue((double)Math.tan(n));
    }
}
