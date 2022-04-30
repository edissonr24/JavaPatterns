package sistemaBanco;

public abstract class Cliente {

	Cuenta cuentaActual;
	double prueba;
	
	
	
	public double getPrueba() {
		return prueba;
	}

	public void setPrueba(double prueba) {
		this.prueba = prueba;
	}

	public Cliente(Cuenta newCuenta) {
		cuentaActual = newCuenta;
	}
	
	public abstract double pagarIntereses(double valorSaldo);
	public abstract void chequearCambio(Cuenta cuenta);
	
}
