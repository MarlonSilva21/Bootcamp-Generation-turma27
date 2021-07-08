package lista4exerciciosjava;

public class ContaBancaria {
	
	public String numero;
	public String agencia;
	public String banco;
	public String titular;
	public double saldo;
	public double limite;
	public int cheques;
	public boolean credito;
	public boolean statusConta = true;
	
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	
	
	

}
