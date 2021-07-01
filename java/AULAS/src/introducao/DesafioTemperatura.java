package introducao;

public class DesafioTemperatura {

	public static void main(String[] args) {
		
		String  nome = "Marlon";
		int temperatura = 75, temperaturaConversao;
		double  temperaturaKelvin;
		
		temperaturaConversao = (temperatura - 32)* 5/9 ;
		
		temperaturaKelvin = (temperatura -32)* 5/9 + 273.15; 
		
		System.out.println("Oi " + nome + " a temperatura atual de Farenheight para celsius é " + temperaturaConversao);
		System.out.println("Oi " + nome + " a temperatura atual de farenheight para Kelvin é " + temperaturaKelvin);
		
		
	}
}
