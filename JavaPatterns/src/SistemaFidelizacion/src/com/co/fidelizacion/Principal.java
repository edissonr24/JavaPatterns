package com.co.fidelizacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Se pregunta por el cliente
		String idCliente = JOptionPane.showInputDialog("Numero de Identificación del Cliente");  
		
		// Se pregunta por el nombre
		String nombreCliente = JOptionPane.showInputDialog("Nombre del Cliente"); 
				
		// Se pregunta por el valor de la compra
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Valor de la Compra $"));  
		
		Calendar c2 = new GregorianCalendar();
		int mesCompra = c2.get(Calendar.MONTH);
		
		// Se pregunta por el saldo inicial
		Compra compra = new Compra(valorCompra, mesCompra);
		double promedioCompras = compra.calcularPromedioUltMeses(idCliente);
		Cliente cliente = compra.clasificarCliente(promedioCompras);
		cliente.setIdCliente(idCliente);
		cliente.setNombreCliente(nombreCliente);
		cliente.setEmail("");
		compra.registrarCompra(cliente);
		
		JOptionPane.showMessageDialog(null, cliente.getInfoCliente());
		
		System.out.println("Fin del proceso " + mesCompra);

	}
	
}
