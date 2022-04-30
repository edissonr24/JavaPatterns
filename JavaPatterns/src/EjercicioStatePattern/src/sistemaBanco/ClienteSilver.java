package sistemaBanco;

import javax.swing.JOptionPane;

public class ClienteSilver extends Cliente {

	double limiteInf =  0;
	double limiteSup = 2000000;
	double interes   = 0.005;
	
	// Constructor clase Silver
	public ClienteSilver(Cuenta newCuenta) {
		super(newCuenta);
		chequearCambio(newCuenta);
		
	}

	// Metodo que calcula el valor de los intereses
	@Override
	public double pagarIntereses(double valorSaldo) {
		// Los silver tienen 0.5% de interes
		return valorSaldo * interes;
	}

	/* Metodo que deacuerdo al saldo de la cuenta chequea si se encuentra en el rango especifico,
	 de lo contrario delega la responsabilidad al constructor de otra clase */
	@Override
	public void chequearCambio(Cuenta cuenta) {
		if (cuenta.saldo >= limiteInf && cuenta.saldo < limiteSup) {
			JOptionPane.showMessageDialog(null, "La cuenta es Silver, " + "Saldo actual = $" + cuenta.saldo);
		} else {
			cuenta.tipoCliente = new ClienteRojo(cuenta);
		}
	}

}
