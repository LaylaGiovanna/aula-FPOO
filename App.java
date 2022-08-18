package br.senai.sp.jandira;

import java.time.LocalDate;

import br.senai.sp.jandira.model.Cliente;

public class App {
	public static void main(String[] args) {
	
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
		System.out.println(ana);
		System.out.println(pedro);
		
		ana.nome = "Ana Maria Braga";
		ana.dataDeNascimento = LocalDate.of(2005,10,27);
		ana.peso = 60;
		ana.altura = 1.80;
		
		
		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2000, 5, 24 );
		pedro.peso = 80;
		pedro.altura = 1.94;
		
		
	}
}
