package src.lab3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuedFraction {
    public int n;
    public int x;
    public ArrayList<Integer> a;
    public double value;

    public ContinuedFraction(int n, int x, ArrayList<Integer> a){
        this.n = n;
        this.x = x;
        this.a = a;
        this.value = 0.0;
        calc();
    }

    public double sum(ContinuedFraction term){
        return this.value + term.value;
    }

    public double sub (ContinuedFraction term){
        return this.value - term.value;
    }

    public double mul(ContinuedFraction term){
        return this.value * term.value;
    }

    public double div(ContinuedFraction term){
        return this.value / term.value;
    }

    public void calc(){
        double temp = 0.0;
        for (int i = n-1; i >= 1; i--) {
            temp = x / (temp + this.a.get(i));
        }
        value = temp;
    }

    public static void main(String[] args) {
        ContinuedFraction frac = new ContinuedFraction(3, 2, new ArrayList<Integer> (Arrays.asList(1, 2, 3)));
        ContinuedFraction frac2 = new ContinuedFraction(3, 2, new ArrayList<Integer> (Arrays.asList(1, 2, 3)));
        System.out.println("Значение 1: ");
        System.out.println(frac.value);
        System.out.println("Значение 2: ");
        System.out.println(frac2.value);
        System.out.println("Сложение: ");
        System.out.println(frac.sum(frac2));
        System.out.println("Вычитание: ");
        System.out.println(frac.sub(frac2));
        System.out.println("Умножение: ");
        System.out.println(frac.mul(frac2));
        System.out.println("Деление: ");
        System.out.println(frac.div(frac2));
    }
}
