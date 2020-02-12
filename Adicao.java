package projetosoma;

import javax.swing.JOptionPane;
public class Adicao{
    public static void main (String[] args){
        //obtém a entrada de usuário a partir dos diálogos de entrada JOptionPane
        String primeironum = JOptionPane.showInputDialog (" digite o primeiro numero");
        String segundonum = JOptionPane.showInputDialog (" digite o segundo numero");
        //converter String em valores int para utilização em um cálculo
        int num1 = Integer.parseInt( primeironum );
        int num2 = Integer.parseInt( segundonum );
        int soma = num1 +num2; //soma os numeros
        //exibe o resultado em um diálogo de msg JOptionPane
        JOptionPane.showInputDialog ( null, "a soma é" + soma, "soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
    }
}