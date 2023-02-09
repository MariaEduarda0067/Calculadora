
package javaapplication30;

import javax.swing.JOptionPane;

public class JavaApplication30 {

    public static void main(String[] args) {
        
        
       
        String firstNumber = 
        JOptionPane.showInputDialog( " Digite o primeiro número:" );
        String secondNumber =
        JOptionPane.showInputDialog( " Digite o segundo número: " );
        String op= JOptionPane.showInputDialog("Digite a operação que deseja realizar\n1=Soma\n2=Subtração\n3=Multiplicação\n4=Divisão");
        
       
       int number1 = Integer.parseInt( firstNumber );
       int number2 = Integer.parseInt( secondNumber );
       int opcao = Integer.parseInt( op );
           
       if (opcao == 1){  
           int sum = number1 + number2;
           JOptionPane.showMessageDialog( null, "O resultado da " + sum, "soma de dois números inteiros é ", JOptionPane.PLAIN_MESSAGE );
       }
        if (opcao == 2){
           int sub = number1 - number2;
           JOptionPane.showMessageDialog( null, "O resultado da " + sub, "subtração de dois números inteiros é ", JOptionPane.PLAIN_MESSAGE );
        }
        if (opcao == 3){
            int mult = number1 * number2;
            JOptionPane.showMessageDialog(null, "O resultado da" + mult, "Multiplicação de dois números inteiros é ", JOptionPane.PLAIN_MESSAGE);
        }
        if (opcao ==4){
            int div = number1 / number2;
            JOptionPane.showMessageDialog(null, "O resultado da" + div, "Divisão de dois números inteiros é ", JOptionPane.PLAIN_MESSAGE);
        }
    }
}