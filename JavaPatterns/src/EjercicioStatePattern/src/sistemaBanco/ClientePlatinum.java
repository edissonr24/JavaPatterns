package sistemaBanco;

import javax.swing.JOptionPane;

public class ClientePlatinum extends Cliente {
	
	double limiteSup = 10000000;
	double interes   = 0.01;

	// Constructor clase Platinum
	public ClientePlatinum(Cuenta newCuenta) {
		super(newCuenta);
		chequearCambio(newCuenta);
		
	}

	// Metodo que calcula el valor de los intereses
	@Override
	public double pagarIntereses(double valorSaldo) {
		// Los platinum tienen 1% de interes
		return valorSaldo * interes;
	}

	/* Metodo que deacuerdo al saldo de la cuenta chequea si se encuentra en el rango especifico,
	 de lo contrario delega la responsabilidad al constructor de otra clase */
	@Override
	public void chequearCambio(Cuenta cuenta) {
		if (cuenta.saldo >= limiteSup) {
			JOptionPane.showMessageDialog(null, "La cuenta es Platinum, " + "Saldo actual = $" + cuenta.saldo);
		} else {
			cuenta.tipoCliente = new ClienteSilver(cuenta);
		}
	}

}
