package lista4exerciciosjava;

import java.util.Scanner;

public class Conta {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char op;
		double auxValor;
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.numero = "1892473745";
		conta.agencia = "0001";
		conta.banco = "BanZZai";
		conta.titular = "Marlon Silva";
		conta.saldo = 0.0;
		conta.limite = 5000.0;
		
		System.out.println("----- CONTA BANCÁRIA -----");
		
		System.out.println("\nTitular : " +conta.titular);
		System.out.println("Banco : "+conta.banco);
		System.out.println("Número : "+conta.numero);
		System.out.println("Agencia : "+ conta.agencia);
		System.out.println("\nSaldo Atual: "+conta.saldo + " | Limite disponivel : "+conta.limite);
		
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite D para deposito ou S para saque: ");
			op = leia.next().toUpperCase().charAt(0);
			
			if(op == 'D') {
				
				System.out.println("Informe o valor para depósito: ");
				auxValor = leia.nextDouble();
				
				conta.depositar(auxValor);
				
			}
			else if(op == 'S') {
				
				System.out.println("Informe o valor para saque: ");
				auxValor = leia.nextDouble();
				
				conta.sacar(auxValor);
			}
			System.out.println("\nSaldo Atual: "+conta.saldo);
		}
			
		leia.close();
		
	}

}
