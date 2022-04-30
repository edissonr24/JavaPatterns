package com.co.fidelizacion;

public class ClienteC extends Cliente {
	
	IDescuentoCliente descuento = new DescuentoClienteC();	

	public String getInfoCliente() {
		
		
		// Informacion del Cliente C
		String info = "Cliente C \n" + 
					  "Descuento Electrodomesticos: " + descuento.getDescuentoElectro() + "%\n" +
					  "Descuento Viveres: " + descuento.getDescuentoViveres() + "%\n" +
					  "Descuento Utiles: " + descuento.getDescuentoUtiles() + "%\n" +
					  "Descuento Ropa: " + descuento.getDescuentoRopa() + "%\n" +
					  "Descuento Ferreteria: " + descuento.getDescuentoFerreteria() + "%\n\n";
		
		// No tiene envio de regalo
		this.envioRegalo = new SinEnvioRegalo();
		info += envioRegalo.getEnvioRegalo() + "\n\n";
		
		// No tiene envio de notificacion
		this.envioNotificacion = new SinEnvioNotificacion();
		info += envioNotificacion.getEnvioNotificacion();
		
		return info;
		
	}

}
