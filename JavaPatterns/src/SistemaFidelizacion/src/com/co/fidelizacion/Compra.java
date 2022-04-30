package com.co.fidelizacion;

import javax.swing.JOptionPane;

public class Compra {

	double valorCompra;
	int mesCompra;
	
	
	
	public Compra(double valorCompra, int mesCompraActual) {
		
		this.valorCompra = valorCompra;
		this.mesCompra = mesCompraActual;
		
	}
	
	
	public Cliente clasificarCliente(double promedioUltMeses) {
		
		Cliente cliente;
		
		if (promedioUltMeses < 100000) {
			cliente = new ClienteA();
			
		} else if (promedioUltMeses >= 100000 && promedioUltMeses < 500000 ) {
			cliente = new ClienteB();
			
		} else if (promedioUltMeses >= 500000 && promedioUltMeses < 1000000 ) {
			cliente = new ClienteC();
			
		} else if (promedioUltMeses >= 1000000 && promedioUltMeses < 2000000 ) {
			cliente = new ClienteD();
			
		} else {
			cliente = new ClienteE();
			
		}
		
		return cliente;
	}
	
	
	public double calcularPromedioUltMeses(String idCliente) {
		
		double promedioCompras = Double.parseDouble(JOptionPane.showInputDialog("Promedio de compras de los ultimos 3 meses" +
				"para el cliente con identificacion " + idCliente));
		
		return promedioCompras;
	}
	
	
	public void registrarCompra(Cliente cliente) {
		
		JOptionPane.showMessageDialog(null, "Compra registrada con exito para el cliente " + cliente.nombreCliente);
		
	}
	
	
}
