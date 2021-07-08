package entidades;

public class ContaPoupanca extends Conta{
	
	private int diaAniversarioConta;

	public ContaPoupanca(int numero, String nomeCliente, int diaAniversarioConta) {
		super(numero, nomeCliente);
		this.diaAniversarioConta = diaAniversarioConta;
		
	}

	public int getDiaAniversarioConta() {
		return diaAniversarioConta;
	}

	public void setDiaAniversarioConta(int diaAniversarioConta) {
		this.diaAniversarioConta = diaAniversarioConta;
	}
	
	

}
