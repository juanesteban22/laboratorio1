package poo;

import javax.swing.JOptionPane;

public class proceso2 {
	//inicializo variable
int number;
int i , neg= 0, par = 0;


public void entrada() {
	//crear un for el cual se va arecorrer 5 veces
	for (i = 0; i < 5; i++) {
		number= Integer.parseInt(JOptionPane.showInputDialog("digite numero "+(1+i)));
		//hcaaemos una condicional el la cual decimos si el numero es modulo de 2 igual 0 es par en tonces le agregamos a el par el numero ingresa 
		if(number%2==0) {
			par++;
		}else if (number<0) {
			//hacemos una condicion la cual le decimos si los numeros son menores a 0 es por que son negativos por ende se lo agregamos a el neg
			neg ++;
		}
	}
	JOptionPane.showInputDialog(null,"el numero de numeros pares es: "+par+"\n"+" Y los numeros negativos son :"+neg);
}
public static int ingresarDatos(String mensaje) {
	String cadena;
	int valor;
	cadena = JOptionPane.showInputDialog(null,mensaje);
	valor = Integer.parseInt(cadena);
	return valor;
}
}
