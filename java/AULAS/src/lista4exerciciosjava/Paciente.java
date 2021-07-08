package lista4exerciciosjava;

public class Paciente {
	
	public String nome;
	public String doenca;
	public String situacao;
	public String tratamento;
	public boolean vivo = true;
	public boolean planoDeSaude = true;
	public int doseRemedio;
	public int vitaminas;
	
	
	
	public void tomarRemedio() {
		doseRemedio++;
	}
	
	public void tomarVitaminas() {
		vitaminas++;
	}

}
