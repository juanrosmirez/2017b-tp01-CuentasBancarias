package testCuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

import cuentasBancarias.CuentasBancarias;

public class testCuentasBancarias {

	@Test
	public void haySaldoParaTransferencia() {
		
		CuentasBancarias cuentaOrigen = new CuentasBancarias(20);
		CuentasBancarias cuentaDestino = new CuentasBancarias(0);
		
		assertEquals(1,cuentaOrigen.transferirMontoHacia(15,cuentaDestino)); 
	}

}
