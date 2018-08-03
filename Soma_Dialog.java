import javax.swing.JOptionPane;

    /*  O valores digitados no JOptionPane 
     *  por padrão estão no formato texto (String)
     *  para a realização de operações matemáticas 
     *  é preciso converte para inteiro
     */

public class Soma_Dialog {  
    
    // Autor: João Matheus Santos Assis            
    public static void main(String [] args){
        
        String num1, num2;
        int num_1, num_2, Soma;
        
        // A variável (num1) armazena o valor digitado        
        num1 = JOptionPane.showInputDialog("Valor de a:");
        // A variável é convertida de String para inteiro        
        num_1 = Integer.parseInt(num1);
        
        
        num2 = JOptionPane.showInputDialog("Valor de b:");
        num_2 = Integer.parseInt(num2);
        
        // Armazena a adição dos valores digitados        
        Soma = num_1 + num_2;        
        JOptionPane.showMessageDialog(null, num_1 + "+" + num_2 + "=" + Soma);
        
    }
    
}