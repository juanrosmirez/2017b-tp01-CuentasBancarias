package cuentasBancarias;

public class CuentasBancarias {
	
	private double saldo;
	
	public CuentasBancarias(double saldo) {
		this.saldo=saldo;
	}

	public int transferirMontoHacia(double monto, CuentasBancarias cuentaDestino) {
		if(monto<=saldo){
			cuentaDestino.saldo+=monto;
			this.saldo-=saldo;
			return 1;
		}
		return 0;
			
	}
	
	
}
