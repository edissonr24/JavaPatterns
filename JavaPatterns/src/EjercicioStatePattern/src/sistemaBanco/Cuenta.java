package sistemaBanco;

public class Cuenta {

	double saldo;
	String propietario;
	Cliente tipoCliente;

	// Constructor
	public Cuenta(double saldo, String propietario) {
		
		this.propietario = propietario;
		this.saldo  = saldo;
		tipoCliente = new ClienteSilver(this);
		
	}
	
	// Metodo encargado de hacer un deposito en una cuenta
	public double depositar(double valorDeposito) {
		
		saldo += valorDeposito;
		chequearEstado();
		return saldo;
	}
	
	// Metodo encargado de hacer un retiro en una cuenta
	public double retirar(double valorRetiro) {
		
		saldo -= valorRetiro;
		chequearEstado();
		return saldo;
	}
	
	// Metodo encargado de chequear el estado en que se encuentra una cuenta
	public void chequearEstado() {
		
		tipoCliente.chequearCambio(tipoCliente.cuentaActual);
	}
	
	
}
