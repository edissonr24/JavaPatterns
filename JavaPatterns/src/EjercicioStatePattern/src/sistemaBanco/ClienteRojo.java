package sistemaBanco;

import javax.swing.JOptionPane;

public class ClienteRojo extends Cliente {

	double limiteInf = -200000;
	double limiteSup = 0;
	
	// Constructor clase Rojo
	public ClienteRojo(Cuenta newCuenta) {
		super(newCuenta);
		chequearCambio(newCuenta);
		
	}

	// Metodo que calcula el valor de los intereses
	@Override
	public double pagarIntereses(double valorSaldo) {
		// Los gold tienen 0% de interes
		return 0;
	}

	/* Metodo que deacuerdo al saldo de la cuenta chequea si se encuentra en el rango especifico,
	 de lo contrario delega la responsabilidad al constructor de otra clase */
	@Override
	public void chequearCambio(Cuenta cuenta) {
		if (cuenta.saldo > limiteInf && cuenta.saldo < limiteSup) {
			JOptionPane.showMessageDialog(null, "El cliente es Rojo, " + "Saldo actual = $" + cuenta.saldo);
		} else {
			cuenta.tipoCliente = new ClienteGold(cuenta);
		}
	}

}
