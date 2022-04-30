package EtapaFinal;

public abstract class Vehiculo {

	protected IAccionesDeSeguridad accionesDeSeguridad;
	protected ICombustible combustible;
	
	
	
	public Coordenada getUbicacion() {
		//Consulta señal de GP y Se cálcula coordenada
        Coordenada coo = new Coordenada();
//        coo.x = 0;
//        coo.y = 0;
        return coo;
	}
	
	
	 public void dibujarEnMapa()      {
         //Dibuja la ubicación del vehículo utilizando un mapa.
         System.out.println("Dibuja la ubicación del vehículo utilizando un mapa");
     }
	
	 
	 public abstract double getKilometraje();
	 
	 
	 public double getCantidadDeCombustible() {
		 return combustible.getCantidadDeCombustible();
	 }
	 
	 
	 public void inmovilizarVehiculo() {
		 accionesDeSeguridad.inmovilizarVehiculo();
	 }
	 
	 public void bloquearPuertas() {
		 accionesDeSeguridad.bloquearPuertas();
	 }
	
}
