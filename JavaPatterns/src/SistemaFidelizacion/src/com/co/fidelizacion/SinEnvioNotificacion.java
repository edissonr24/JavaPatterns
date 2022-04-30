package com.co.fidelizacion;

public class SinEnvioNotificacion implements IEnvioNotificacion {

	@Override
	public String getEnvioNotificacion() {
		return "No recibe notificación";
	}

}
