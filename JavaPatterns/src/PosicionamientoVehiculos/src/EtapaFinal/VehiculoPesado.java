package EtapaFinal;

public class VehiculoPesado extends Vehiculo {

	@Override
	public double getKilometraje() {
		return 200;
	}

	
	public VehiculoPesado()
    {
        this.accionesDeSeguridad = new SinElementosDeSeguridad();
        this.combustible = new ConCombustible();
    }
	
}
