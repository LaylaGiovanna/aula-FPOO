package br.senai.sp.jandira.model;

public class Conta {
	
	public String numero;
	public String tipoConta;
	public String cliente;
	public double saldo;
	
	public void transferir() {
		
	}
	
	public void depositar(double valorDoDeposito) {
		
		System.out.printf("...Depositando %s na conta da(o) %s \n \n" , valorDoDeposito , cliente);
		saldo = saldo + valorDoDeposito;
	}
	
	public void sacar(double valorDoSaque) {
		if (saldo >= valorDoSaque) {
		saldo = saldo - valorDoSaque;
		} else {
			System.out.println("Infelizmente não há saldo suficiente");
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
