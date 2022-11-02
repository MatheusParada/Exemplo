package br.com.exemplo;

public class Divide {
    public static void main (String args[]) {
        int dividendo = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        try {
            divide (dividendo, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Não pode dividir por zero!");
        }
    }
    public static void divide (int dividendo, int divisor) {
        System.out.println("Divisão = " + (dividendo/divisor));
    }
    }