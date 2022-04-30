package com.co.fidelizacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClienteE extends Cliente {

	IDescuentoCliente descuento = new DescuentoClienteE();	
	
		
	public String getInfoCliente() {
		
		// Informacion Cliente E
		String info = "Cliente E \n" + 
					  "Descuento Electrodomesticos: " + descuento.getDescuentoElectro() + "%\n" +
					  "Descuento Viveres: " + descuento.getDescuentoViveres() + "%\n" +
					  "Descuento Utiles: " + descuento.getDescuentoUtiles() + "%\n" +
					  "Descuento Ropa: " + descuento.getDescuentoRopa() + "%\n" +
					  "Descuento Ferreteria: " + descuento.getDescuentoFerreteria() + "%\n\n";
		
		
		Calendar calendario = new GregorianCalendar();
		int mesActual = calendario.get(Calendar.MONTH);

		if (mesActual == 12) {
			this.envioRegalo = new ConEnvioRegalo();
		} else {
			this.envioRegalo = new SinEnvioRegalo();
		}
		info += envioRegalo.getEnvioRegalo() + "\n\n";
		
		// Si tiene envio de notificacion
		this.envioNotificacion = new ConEnvioNotificacion();
		info += envioNotificacion.getEnvioNotificacion();
		
		return info;
		
	}
	
		

}
