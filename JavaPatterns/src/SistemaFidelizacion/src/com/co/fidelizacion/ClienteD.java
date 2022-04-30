package com.co.fidelizacion;

public class ClienteD extends Cliente {

	IDescuentoCliente descuento = new DescuentoClienteD();	
	
	public String getInfoCliente() {
		
		// Informacion Cliente D
		String info = "Cliente D \n" + 
					  "Descuento Electrodomesticos: " + descuento.getDescuentoElectro() + "%\n" +
					  "Descuento Viveres: " + descuento.getDescuentoViveres() + "%\n" +
					  "Descuento Utiles: " + descuento.getDescuentoUtiles() + "%\n" +
					  "Descuento Ropa: " + descuento.getDescuentoRopa() + "%\n" +
					  "Descuento Ferreteria: " + descuento.getDescuentoFerreteria() + "%\n\n";
		
		// No tiene envio de regalo
		this.envioRegalo = new SinEnvioRegalo();
		info += envioRegalo.getEnvioRegalo() + "\n\n";
		
		// Si tiene envio de notificacion
		this.envioNotificacion = new ConEnvioNotificacion();
		info += envioNotificacion.getEnvioNotificacion();
				
		return info;
		
	}	
	
}
