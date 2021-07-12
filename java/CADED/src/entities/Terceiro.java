package entities;

public class Terceiro extends Funcionario{
	
	private double adicional;
	
	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
		
	}

	public Terceiro(String matricula, double adicional) {
		super(matricula);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	@Override
	public double salario() {
		
		return (/*super.get*/horasTrabalhadas * /*super.get*/valorHora) + adicional;
	}
	

	
	
}
