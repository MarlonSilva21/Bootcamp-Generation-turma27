package lista4exerciciosjava;

public class Aviao {
	
	//atributos
	
	
	public int rodas;
	public String modelo;
	public String tipo;
	public boolean noAr;
	public int velocidade;
	public boolean ligado;
	
	
	
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
	public void decolando() {
		for(int i = 1; i <= 10; i++) {
			aumentarVelocidade();
		}
		
		noAr = true;
	}
	
	public void pousar() {
		for(int i = 1; i <= 10; i++) {
			diminuirVelocidade();
		}
		
		noAr = false;
	}
	
	public void aumentarVelocidade() {
		velocidade++;
	}
	
	public void aumentarVelocidade(int acrescimo) {
		velocidade = velocidade + acrescimo;
	}
	
	public void diminuirVelocidade() {
		velocidade--;
	}
	
	public void diminuirVelocidade(int decrescimo) {
		velocidade -= decrescimo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public int turbinas;
	public int assentos;
	public  String combustivel;
	public String modelo;
	public String tipo;
	public int velocidade;
	
	public boolean ligado;
	
	
	public void ligarAviao() {
		ligado = true;
		System.out.println("Avi�o ligado");
	}
	
	public void desligarAviao() {
		
		if(velocidade == 0) {
			ligado = false;
			System.out.println("Avi�o desligado");
		}
		else {
			System.out.println("Desacelerar o avi�o!");
		}
	}
	
	public void voar() {
		System.out.println("Avi�o est� em voo");
	}
	public void aterrissar() {
		System.out.println("Este avi�o est� pousado");
	}
	
*/

}
