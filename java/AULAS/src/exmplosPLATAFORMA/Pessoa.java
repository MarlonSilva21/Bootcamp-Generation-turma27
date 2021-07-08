package exmplosPLATAFORMA;

public class Pessoa {
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	public Pessoa(String primeiro, String meio, String ultimo) {
		
		primeiroNome = primeiro;
		nomesDoMeio = meio;
		ultimoNome = ultimo;
	}
	
	public String getNomeCompleto() {
		
		String nomeCompleto = primeiroNome +"  "+nomesDoMeio +"  "+ ultimoNome;
		return nomeCompleto;
	}

}
