package lista4exerciciosjava;

public class Patinete {
	
	public String tipo;
	public int rodas;
	public String materialFeito;
	public boolean motorizado;
	public int velocidade;
	
	
	public void acelerar() {
		velocidade++;
	}
	
	public void desacelerar() {
		velocidade--;
	}

}
