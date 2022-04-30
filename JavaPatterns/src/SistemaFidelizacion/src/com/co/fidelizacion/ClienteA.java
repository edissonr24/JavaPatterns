package com.co.fidelizacion;

public class ClienteA extends Cliente {

	IDescuentoCliente descuento = new DescuentoClienteA();	
		
	public String getInfoCliente() {
		
		// Informacion del Cliente A
		String info = "Cliente A \n" + 
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
