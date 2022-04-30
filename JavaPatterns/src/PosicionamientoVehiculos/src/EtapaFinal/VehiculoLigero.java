package EtapaFinal;

public class VehiculoLigero extends Vehiculo {

	@Override
	public double getKilometraje() {
		// TODO Auto-generated method stub
		return 80;
	}
	
	
	public VehiculoLigero() {
		this.accionesDeSeguridad = new SinElementosDeSeguridad();
		this.combustible         = new SinCombustible();
	}

}
