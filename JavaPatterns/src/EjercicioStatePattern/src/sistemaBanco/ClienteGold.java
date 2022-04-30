package sistemaBanco;

import javax.swing.JOptionPane;

public class ClienteGold extends Cliente {

	double limiteInf = 2000000;
	double limiteSup = 10000000;
	double interes   = 0.008;
	
	// Constructor clase Gold
	public ClienteGold(Cuenta newCuenta) {
		super(newCuenta);
		chequearCambio(newCuenta);
		
	}

	// Metodo que calcula el valor de los intereses
	@Override
	public double pagarIntereses(double valorSaldo) {
		// Los gold tienen 0.8% de interes
		return valorSaldo * interes;
	}

	
	/* Metodo que deacuerdo al saldo de la cuenta chequea si se encuentra en el rango especifico,
	 de lo contrario delega la responsabilidad al constructor de otra clase */
	@Override
	public void chequearCambio(Cuenta cuenta) {
		if (cuenta.saldo >= limiteInf && cuenta.saldo < limiteSup) {
			JOptionPane.showMessageDialog(null, "El cliente es Gold, " + "Saldo actual = $" + cuenta.saldo);
		} else {
			cuenta.tipoCliente = new ClientePlatinum(cuenta);
		}
	}

}
