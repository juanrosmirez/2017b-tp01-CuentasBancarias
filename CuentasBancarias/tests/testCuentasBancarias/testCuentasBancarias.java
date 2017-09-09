package testCuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

import cuentasBancarias.CuentasBancarias;

public class testCuentasBancarias {

	@Test
	public void haySaldoParaTransferencia() {
		
		CuentasBancarias cuentaOrigen = new CuentasBancarias(-50);
		CuentasBancarias cuentaDestino = new CuentasBancarias(0);
		
		assertEquals(1,cuentaOrigen.transferirMontoHacia(-5,cuentaDestino)); 
	}
	
	@Test
	public void transfiereAUnaMismaCuenta(){
		
		CuentasBancarias cuentaOrigen = new CuentasBancarias(20);
		assertEquals(0,cuentaOrigen.transferirMontoHacia(15,cuentaOrigen));
	}
	
	
	
}
