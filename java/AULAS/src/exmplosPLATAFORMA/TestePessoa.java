package exmplosPLATAFORMA;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Pessoas ed = new Pessoas("Ednilson", 1234);
		Funcionario jess = new Funcionario("J�ssica",999,"TI");
		Pessoas marlon = new Funcionario("Marlon", 777, "TI");
		Pessoas jose = new Coordenador("Jos�", 000, "Dev Fullstack");
		
		System.out.println(ed.getMatricula());
		System.out.println(jess.getDepartamento());
		System.out.println(marlon.getMatricula());
		System.out.println(jose.getNome());

	}

}
