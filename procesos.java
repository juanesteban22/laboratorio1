package poo;

import javax.swing.JOptionPane;

public class procesos {
	public double ladoA;
	public double ladoB;
	public void ingresaDatos() {
		
		/*un objeto tiene 3 caracteristicas 
		 * Estado : Caracteristicas del objeto
		 * Comportamiento : acciones que el onjeto realiza
		 * Identidad : lo que lo hace unico y diferente
		 * int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
		
		int suma = x + y;
		
	    System.out.println("el resultado es "+suma);
		 * */
		
		String cadena;
		
		cadena = JOptionPane.showInputDialog("ingrese la longitud de lado A");
		ladoA = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog("ingrese la longitud de lado B");
		ladoB = Double.parseDouble(cadena);
	}
	
	public void calcularArea() {
		double reltado;
		
		reltado = ladoA * ladoB;
		
		JOptionPane.showInputDialog(null,"el resulto es: "+ reltado);
	}
}
