package br.senai.sp.jandira.model;

import java.awt.Color;
import java.time.LocalDate;

public class Cliente {

	public String nome;
	public LocalDate dataDeNascimento;
	public String genero[] = { "Feminino", "Masculino", "outros" };
	public double peso, altura;
	public Color corDeFundoDaTela;

	public double getImc() {
		return peso / Math.pow(altura, 2);

	}

	public String getStatus() {

		if (getImc() <= 18.5) {
			return ("Você está abaixo do peso ideal.");
		} else if (getImc() >= 18.5 && getImc() < 25.0) {
			return ("Parabéns! Você está no peso ideal.");
		} else if (getImc() >= 25.0 && getImc() < 30.0) {
			return ("Você está levemente acima do peso.");
		} else if (getImc() >= 30.0 && getImc() < 35.0) {
			return ("Você está com obesidade grau I");
		} else if (getImc() >= 35.0 && getImc() < 40.0) {
			return ("Você está com obesidade grau II (severa)");
		} else {
			return ("Você está com obesidade grau III (mórbida)");
		}

	}
}
