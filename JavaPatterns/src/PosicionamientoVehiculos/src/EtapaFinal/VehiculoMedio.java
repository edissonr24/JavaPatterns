package EtapaFinal;

public class VehiculoMedio extends Vehiculo {

	@Override
	public double getKilometraje() {
		return 100;
	}

	
	public VehiculoMedio()
    {
        this.accionesDeSeguridad = new SinElementosDeSeguridad();
        this.combustible = new ConCombustible();
    }
	
	
}
