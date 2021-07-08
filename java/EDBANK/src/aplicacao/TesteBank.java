package aplicacao;

import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class TesteBank {
	
	public static void main(String[] args) {
		
		Conta cl1 = new Conta(51, "Ednilson");
		
		ContaPoupanca cp1 = new ContaPoupanca(5, "Marlon", 15);
		ContaEspecial cc1 = new ContaEspecial(113, "maria",5000);
		
		System.out.println("Cliente : "+ cl1.getNomeCliente());
		System.out.println("Saldo atual : "+ cl1.getSaldo());
		
		
		System.out.println("Cliente : "+ cp1.getNomeCliente());
		System.out.println("Saldo atual : "+ cp1.getSaldo());
		
		cp1.deposito(100);
		cl1.deposito(100);
		System.out.println("Saldo atual : "+ cl1.getSaldo());
		System.out.println("Saldo atual : "+ cp1.getSaldo());
		
		cp1.saque(30);
		cl1.saque(25);
		
		System.out.println("Saldo atual : "+ cl1.getSaldo());
		System.out.println("Saldo atual : "+ cp1.getSaldo());
		
		
	}
	
	
	
	

}
