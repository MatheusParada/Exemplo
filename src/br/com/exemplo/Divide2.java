package br.com.exemplo;

public class Divide2{
    public static void main (String args[]) {
    try {
        int dividendo = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args [1]);
        divide (dividendo, divisor);
    } catch (ArithmeticException el) {
        System.out.println("Não pode dividir por zero!");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Favor Informar dois números!");
    }
}
    public static void divide (int dividendo, int divisor) {
        System.out.println("Divisão = " + (dividendo/divisor));
    }
    }
