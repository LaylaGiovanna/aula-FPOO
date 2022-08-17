package br.senai.sp.jandira;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
//calculo IMC/ Qual o seu peso? /qual o sua altura? /resultado  /valor do imc-> voce esta no peso ideal/ peso
//imc= peso * (altura * altura)
		
		Scanner leitor = new Scanner(System.in);
		
		double peso;
		System.out.printf("Qual o seu peso?\n");
		peso = leitor.nextDouble();
		
		double altura;
		System.out.printf("Qual a sua altura?\n");
		altura = leitor.nextDouble();
		
		double imc = peso / (altura * altura);		
		System.out.printf("Seu IMC é de %s \n" , imc);
		
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso ideal.");
		}
		
		if (imc >= 18.5 && imc < 25.0) {
			System.out.println("Parabéns! Você está no peso ideal.");
			
		}
		
		if (imc >= 25.0 && imc < 30.0) {
			System.out.println("Você está levemente acima do peso.");
		}
		
		if (imc >= 30.0 && imc < 35.0) {
			System.out.println("Você está com obesidade grau I");
		}
		
		if (imc >= 35.0 && imc < 40.0) {
			System.out.println("Você está com obesidade grau II (severa)");
		}
		
		if (imc > 40) {
			System.out.println("Você está com obesidade grau III (mórbida)");
		}
		
		
		
		
	}

}
