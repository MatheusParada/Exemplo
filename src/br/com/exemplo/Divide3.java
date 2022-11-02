package br.com.exemplo;
import javax.swing.JOptionPane;
public class Divide3 {
    public static void main(String args[]) {
        int dividendo, divisor;
        while(true){
            try{
                dividendo = Integer.parseInt(JOptionPane.showInputDialog("digite o dividendo"));
                divisor= Integer.parseInt(JOptionPane.showInputDialog("digite o divisor: "));
                break;
            }catch (ArithmeticException e1){
                JOptionPane.showMessageDialog(null, "nao pode dividir por zero");
            }catch (NumberFormatException e2){
                JOptionPane.showMessageDialog(null, "favor informar apenas numeros inteiros");
            }
        }
    }
    }
