package EtapaFinal;

public class VehiculoGamaAlta extends Vehiculo {

	@Override
	public double getKilometraje() {
		return 0;
	}

	
	public VehiculoGamaAlta()
    {
        this.accionesDeSeguridad = new ConElementosDeSeguridad();
        this.combustible = new ConCombustible();
    }
	
}
