package cuentasBancarias;

public class CuentasBancarias {
	
	private double saldo;
	private boolean estado;
	
	public CuentasBancarias(){
		this.saldo=0;
		this.estado=true;
	}
	
	public CuentasBancarias(double saldo) {
		this.saldo=saldo;
		this.estado=true;
	}

	public int transferirMontoHacia(double monto, CuentasBancarias cuentaDestino) {
		if(monto<=saldo && estado==true && cuentaDestino.estado==true){
			cuentaDestino.saldo+=monto;
			this.saldo-=saldo;
			return 1;
		}
		return 0;
			
	}
	
	
}
