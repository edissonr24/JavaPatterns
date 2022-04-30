package sistemaBanco;

import javax.swing.JOptionPane;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		// Se pregunta por el cliente
		String cliente = JOptionPane.showInputDialog(
				null,
				"Ingrese nombre del cliente",
				JOptionPane.QUESTION_MESSAGE);  
		
		// Se pregunta por el saldo inicial
		double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Ingrese saldo inicial",
				JOptionPane.QUESTION_MESSAGE));  
		
		
		// Se instancia la nueva cuenta        
		Cuenta cuentaNueva = new Cuenta(saldoInicial, cliente);
		
		
		// Se pregunta por la accion a realizar
		int valorSeleccion = JOptionPane.showOptionDialog(
				   null,
				   "Seleccione opcion", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   new Object[] { "Depositar", "Retirar", "Consultar Intereses" }, "opcion 1");
		
		// En caso de seleccionar depositar, se llama al metodo depositar de la clase Cuenta
		if (valorSeleccion == 0) {
			
			double valorConsigna = Double.parseDouble(JOptionPane.showInputDialog(
					null,
					"Valor a depositar",
					JOptionPane.QUESTION_MESSAGE));  
			        
			cuentaNueva.depositar(valorConsigna);
			
		} else if (valorSeleccion == 1) {
			// En caso de seleccionar retirar, se llama al metodo retirar de la clase Cuenta
			double valorRetira = Double.parseDouble(JOptionPane.showInputDialog(
					null,
					"Valor a retirar",
					JOptionPane.QUESTION_MESSAGE)); 
			        
			cuentaNueva.retirar(valorRetira);
			
		} else {
			// En caso de seleccionar retirar, se llama al metodo retirar de la clase Cuenta			        
			double intereses = cuentaNueva.tipoCliente.pagarIntereses(saldoInicial);
			JOptionPane.showMessageDialog(null, "Intereses = $" + intereses);
			
		}
		
		System.out.println("Fin del proceso");
			

	}

}
