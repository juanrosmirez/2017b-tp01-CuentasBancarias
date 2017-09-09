package cuentasBancarias;

public class CuentasBancarias {
	
	private double saldo;
	private boolean estado;
	
	public CuentasBancarias(){
		this.saldo=0;
		this.estado=true;
	}
	
	public CuentasBancarias(double saldo) {
		if(saldo<0)
			this.saldo=0;
		else
			this.saldo=saldo;
		this.estado=true;
	}

	public int transferirMontoHacia(double monto, CuentasBancarias cuentaDestino) {
		if(monto<=saldo && monto>=0 && this!=cuentaDestino && estado==true && cuentaDestino.estado==true){
			cuentaDestino.saldo+=monto;
			this.saldo-=saldo;
			return 1;
		}
		return 0;
			
	}
	
	
}
