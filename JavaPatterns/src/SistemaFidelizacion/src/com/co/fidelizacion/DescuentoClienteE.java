package com.co.fidelizacion;

public class DescuentoClienteE implements IDescuentoCliente {

	@Override
	public double getDescuentoElectro() {
		return 4;
	}

	@Override
	public double getDescuentoViveres() {
		return 4;
	}

	@Override
	public double getDescuentoUtiles() {
		return 4;
	}

	@Override
	public double getDescuentoRopa() {
		return 4;
	}

	@Override
	public double getDescuentoFerreteria() {
		return 3;
	}

}
