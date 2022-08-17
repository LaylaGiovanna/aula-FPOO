package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		Conta contaDaLayla = new Conta();
		Conta contaDoJoao = new Conta();
		Conta contaDoCelso = new Conta();
		
		//dados das contas
		contaDaLayla.numero = "001-8";
		contaDaLayla.cliente = "Layla Giovanna";
		contaDaLayla.tipoConta = "Corrente";
		contaDaLayla.saldo = 2000;
		
		contaDoJoao.numero = "002-4";
		contaDoJoao.cliente = "João Sousa";
		contaDoJoao.tipoConta = "Poupança";
		contaDoJoao.saldo = 90;
		
		
		//mensagem para o cliente
//		System.out.print("Qual o nome do cliente?:");
//		contaDoCelso.cliente = leitor.next();
//		
//		System.out.print("Qual o número da conta?:");
//		contaDoCelso.numero = leitor.next();
//		
//		System.out.print("Qual o tipo da conta?:");
//		contaDoCelso.tipoConta = leitor.next();
//		
//		System.out.print("Qual o saldo da conta?: \n");
//		contaDoCelso.saldo = leitor.nextDouble();
		
		
		//exibindo os dados das contas
		contaDaLayla.exibirDadosDaConta();
		contaDoJoao.exibirDadosDaConta();
		contaDoCelso.exibirDadosDaConta();
		
		//depositando na conta
		contaDaLayla.depositar(500);
		contaDaLayla.exibirDadosDaConta();
		
		contaDaLayla.depositar(25);
		contaDaLayla.exibirDadosDaConta();
		
		contaDaLayla.depositar(500);
		contaDaLayla.exibirDadosDaConta();
		
		contaDaLayla.sacar(100);
		contaDaLayla.exibirDadosDaConta();
		
		contaDaLayla.sacar(2930);
		contaDaLayla.exibirDadosDaConta();

	}

}
