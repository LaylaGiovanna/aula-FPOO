package br.senai.sp.jandira;

import java.util.Scanner;

public class DesviosCondicionais {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		System.out.printf("Qual a sua idade?");
		idade = leitor.nextInt();
		
		if (idade >= 18 && idade < 50) {
			System.out.println("Bem-vindo a festa!!");
		}
		
		if (idade < 18 || idade >= 50) {
			System.out.println("Vai para casa, entrada proíbida!");
		}
		

	}

}
