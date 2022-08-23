package br.senai.sp.jandira.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCalculoImc {
	
	public String titulo;
	public int largura;
	public int altura;
	
	
	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
//		obter a instância do oainel de conteúdo (container)
		Container painel = tela.getContentPane();
		
//		criar os componentes da tela e colocar no painel (container)
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 0, 30, 30);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 40, 100, 30);
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 70, 300, 30);
		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(200, 500, 150, 30);
		
//		adicionar componentes ao painel (container)
		painel.add(labelImc);
		painel.add(buttonCalcular);
		painel.add(labelNome);
		painel.add(textFieldNome);
		
		
		
		
		
		tela.setVisible(true);
		
	}

}
