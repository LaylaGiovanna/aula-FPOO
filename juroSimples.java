package br.senai.sp.jandira;

import java.util.Scanner;

public class juroSimples {

	public static void main(String[] args) {
		
		double juros, capital, taxa, tempo;
		Scanner leitor;
		
		leitor = new Scanner(System.in);
		
		System.out.print("Qual é o capital? ");
		capital = leitor.nextDouble();
		
		System.out.print("Qual é a taxa de juros? ");
		taxa = leitor.nextDouble();
		
		System.out.print("Qual é o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = capital * taxa / 100 * tempo; //j = c . i . t
		
		System.out.println("O valor do juros é de: " + juros );
		
		System.out.printf("Ao final do período você terá R$%s" , juros + capital);
		 
	}

}
