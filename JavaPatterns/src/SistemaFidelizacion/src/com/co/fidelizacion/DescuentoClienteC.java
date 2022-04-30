package com.co.fidelizacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DescuentoClienteC implements IDescuentoCliente {

	@Override
	public double getDescuentoElectro() {
		return 1;
	}

	@Override
	public double getDescuentoViveres() {
		return 2;
	}

	@Override
	public double getDescuentoUtiles() {
		Calendar calendario = new GregorianCalendar();
		int mesActual = calendario.get(Calendar.MONTH);

		if (mesActual == 1 || mesActual == 2) {
			return 2;
		}		
		return 0;
	}

	@Override
	public double getDescuentoRopa() {
		return 1;
	}

	@Override
	public double getDescuentoFerreteria() {
		return 0;
	}

}
