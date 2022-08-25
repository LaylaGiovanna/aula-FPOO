package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class App {
	public static void main(String[] args) {

		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora IMC";
		tela.altura = 600;
		tela.largura = 600;
		tela.corDeFundoDaTela = new Color(196, 196, 255);
		tela.corDoBotao = new Color(0, 128, 192);
		tela.fonteDosLabels = new Font("Malgun Gothic", Font.PLAIN, 12);
		tela.fonteDoTitulo = new Font("Malgun Gothic", Font.BOLD, 16);
		tela.corDoTexto = new Color(0, 0, 0);
		tela.criarTela();

		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();

		System.out.println(ana);
		System.out.println(pedro);

		ana.nome = "Ana Maria Braga";
		ana.dataDeNascimento = LocalDate.of(2005, 10, 27);
		ana.peso = 60;
		ana.altura = 1.80;
		ana.getImc();
//		ou criar um double para guardar o getImc da ana
//		System.out.println(ana.getImc());
//		
//		String teste = ana.getStatus();
//		System.out.println(teste);
////		ou dessa forma
////		JOptionPane.showMessageDialog(null, teste);
//		
//		

//		
//		pedro.nome = "Pedro Dias";
//		pedro.dataDeNascimento = LocalDate.of(2000, 5, 24 );
//		pedro.peso = 80;
//		pedro.altura = 1.94;
//		pedro.getImc();
//		System.out.println(pedro.getImc());

	}
}



//ImageIcon icone = new ImageIcon("src/br/senai/sp/jandira/imagens/info24.png");
//JOptionPane.showMessageDialog(null, "Essa é outra mensagem", "Senai Jandira", JOptionPane.INFORMATION_MESSAGE, icone );
