package objetos;

public class carro {
	
	public String placa;
	public String nome;
	public String modelo;
	public String tipo;
	public int velocidade;
	
	public boolean ligado;
	
	
	public void ligarCarro() {
		ligado = true;
		System.out.println("THIHITHITHIIHIT  carro ligado");
	}
	
	public void desligarCarro() {
		
		if(velocidade == 0) {
			ligado = false;
			System.out.println("carro desligado");
		}
		else {
			System.out.println("Desacelerar o carro!");
		}
	}
	
	public void acelerar() {
		velocidade++;
	}
	

}
