package calc;

import java.text.DecimalFormat;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return  a-b;
    }
    public int multiply(int a, int b){
        return  a*b;
    }
    public int divide(int a, int b){
        return  a/b;
    }
    public int exponents(int a, int b){
        return  (int)Math.pow(a,b);
    }
    public int square(int a){
        return  (int)Math.pow(a,2);
    }
    public int squareRoot(int a){
        return  (int)Math.sqrt(a);
    }
    public double sine(int a){
        DecimalFormat df = new DecimalFormat("#.##");
        return  Double.parseDouble(df.format(Math.sin(a)));
    }

}
