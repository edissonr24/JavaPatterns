package com.co.fidelizacion;

public class DescuentoClienteD implements IDescuentoCliente {

	@Override
	public double getDescuentoElectro() {
		return 2;
	}

	@Override
	public double getDescuentoViveres() {
		return 3;
	}

	@Override
	public double getDescuentoUtiles() {
		return 2;
	}

	@Override
	public double getDescuentoRopa() {
		return 2;
	}

	@Override
	public double getDescuentoFerreteria() {
		return 1;
	}

}
