package br.senai.sp.jandira.model;

public class Conta {
	
	public String numero;
	public String tipoConta;
	public String cliente;
	public double saldo;
	
	public void transferir(double valorTransferir, Conta contaDestino ) {
		System.out.printf("...Transferindo %s na conta da(o) %s \n \n" , valorTransferir , cliente);
		
		boolean ocorreuSaque = sacar(valorTransferir);
		
		if (ocorreuSaque) {
			contaDestino.depositar(valorTransferir);
		} else { System.out.printf("Infelizmente não foi possível realizar a transferênia \n \n ");
		
		}
	}
		
	
	public void depositar(double valorDoDeposito) {
		System.out.printf("...Depositando %s na conta da(o) %s \n \n" , valorDoDeposito , cliente);
		saldo = saldo + valorDoDeposito;
	}
	
	public boolean sacar(double valorDoSaque) {
	
		if (saldo >= valorDoSaque) {
		saldo = saldo - valorDoSaque;
			return true;
		} else {
			System.out.printf("Infelizmente não há saldo suficiente \n \n");
				return false;
		}
		
	}
	
	public void exibirDadosDaConta() {
		System.out.printf("Número da conta: %s \n" , numero);
		System.out.printf("Nome do cliente: %s \n" , cliente);
		System.out.printf("Tipo da conta: %s \n" , tipoConta);
		System.out.printf("Saldo da conta: %s \n" , saldo);
		System.out.println("-------------------------------- \n ");
	}
	
	
	
	
	
	
}
