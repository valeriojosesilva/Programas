package estruturas;
import javax.swing.JOptionPane;
public class ExJavaValerio3{
public static void main (String[] args){
int n1,n2;
n1 = integer.parseInt(JOptionPane.showInputDialog("primeiro"));
n2 = integer.parseInt(JOptionPane.showInputDialog("segundo"));
if (n1>n2)
System.out.println (n1 + " maior que " + n2);
else if (n2>n1)
System.out.println (n2 + " maior que " + n1);
else
System.out.println (n1 + " igual a " + n2);
System.exit(0);
}
}