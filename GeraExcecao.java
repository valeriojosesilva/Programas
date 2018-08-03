import java.awt.*;
import java.awt.event.*;
import MessageBox;
class GeraExcecao extends Frame implements ActionListener{
int resultado;
int a;
int b;
MessageBox Message;
TextField numero1;
TextField numero2;
Button btnOk;
GeraExcecao (){
setLayout (null);
setSize(400,400);
Message= new MessageBox();
numero1 = new TextField();
numero1.setBounds(60,40,80,30);
add(numero1);
numero2 = new TextField();
numero2.setBounds(60,100,80,30);
add(numero2);
btnOk = new Button("Execute!!");
btnOk.setBounds(160,100,70,30);
add(btnOk);
btnOk.addActionListener(this);
}
public void teste(){
try {
a = Integer.valueOf(numero1.getText()).intValue();
b = Integer.valueOf(numero2.getText()).intValue();
resultado = a / b;
if (b < 0)
throw new Exception();
Message.texto("Este é o resultado:"+ resultado);
Message.setVisible(true);
} catch (ArithmeticException e){
Message.texto("Gerou uma exceção Aritmetica - Divisão por zero");
Message.setVisible(true);
}catch (NumberFormatException e){
Message.texto("Gerou uma exceção no Numero da divisão");
Message.setVisible(true);
}catch (Exception e){
Message.texto("Gerou uma exceção Geral:"+ e);
Message.setVisible(true);
}
}
public void actionPerformed(ActionEvent e){
if (e.getSource() == btnOk){
teste();
}
}
public static void main (String args[]){
GeraExcecao form = new GeraExcecao();
form.setVisible(true);
}
}//Fechamento da classe