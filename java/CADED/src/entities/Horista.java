package entities;

public class Horista {
	
	private String cpf;
	private double horas;
	private double valohora;
	
	
	public Horista(String cpf, double horas, double valohora) {
		super();
		this.cpf = cpf;
		this.horas = horas;
		this.valohora = valohora;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getValohora() {
		return valohora;
	}
	public void setValohora(double valohora) {
		this.valohora = valohora;
	}
	
	

}
