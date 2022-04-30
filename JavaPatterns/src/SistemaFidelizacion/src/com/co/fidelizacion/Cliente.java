package com.co.fidelizacion;

public abstract class Cliente {

	protected IEnvioRegalo envioRegalo;
	protected IEnvioNotificacion envioNotificacion;
	
	String idCliente;
	String nombreCliente;	
	String email;
	String telefono;
	Compra nuevaCompra;
	

	public abstract String getInfoCliente();
	
	public String getEnvioRegalo() {
		return envioRegalo.getEnvioRegalo();
	}
	
	public String getEnvioNotificacion() {
		return envioNotificacion.getEnvioNotificacion();
	}
	


	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
			
}
