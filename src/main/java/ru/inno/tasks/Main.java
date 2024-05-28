package ru.inno.tasks;


public class Main {
    public static void main(String[] args) {

        Fraction fraction = new Fraction(2, 4);
        Fractionable fraction2 = Utils.cache(fraction);
        System.out.println(fraction2.doubleValue());

        fraction2.setNum(5);
        System.out.println(fraction2.doubleValue());
        System.out.println(fraction2.doubleValue());
        fraction2.setDenum(4);
        System.out.println(fraction2.doubleValue());
        System.out.println(fraction2.doubleValue());


    }
}