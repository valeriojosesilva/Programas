// programa imprimir numeros de 150 a 300
import java.util.*;
import javax.swing.JOptionPane;
class ImprimirNumeros150Ate300{
	public static void main (String[] args) {
	//int k,l;
	
	String k = JOptionPane.showInputDialog("valor de k : ");
	String l = JOptionPane.showInputDialog("valor de l : ");
	int kk = Integer.parseInt(k);
	int ll = Integer.parseInt(l);
	
	for (int i=kk ; i<=ll ; i=i+1){
		String str = Integer.toString(i);
		System.out.println(i);
	
	}
	
	}
	}
	
