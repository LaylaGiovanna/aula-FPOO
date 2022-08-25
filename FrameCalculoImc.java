package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.nio.BufferUnderflowException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoBotao;
	public Color corDoTexto;
	public Font fonteDoTitulo;

	public void criarTela() {

// x, y, larg, alt

//		duas telas
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		JFrame tela2 = new JFrame();
		tela2.setTitle(titulo);
		tela2.setSize(largura, altura);
		tela2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela2.setLayout(null);

//		obter a instância do oainel de conteúdo (container)
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);

//		criar os componentes da tela e colocar no painel (container)
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 10, 30, 30);
		labelImc.setFont(fonteDoTitulo);
		labelImc.setForeground(new Color(255, 255, 255));

//		Nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 40, 100, 30);
		labelNome.setFont(fonteDosLabels);

		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 70, 300, 30);

//		Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 110, 300, 30);
		labelPeso.setFont(fonteDosLabels);

		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 140, 300, 30);

//		Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 180, 300, 30);
		labelAltura.setFont(fonteDosLabels);

		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 210, 300, 30);

//		Data de nascimento
		JLabel labelNascimento = new JLabel();
		labelNascimento.setText("Data de nascimento:");
		labelNascimento.setBounds(30, 250, 300, 30);
		labelNascimento.setFont(fonteDosLabels);

		JTextField textFieldNascimento = new JTextField();
		textFieldNascimento.setBounds(30, 280, 300, 30);

//		resultado imc
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText("Seu IMC é xxxx");
		labelResultadoImc.setBounds(30, 320, 300, 30);
		labelResultadoImc.setFont(fonteDosLabels);

		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Seu status de IMC é xxxx");
		labelStatusImc.setBounds(30, 360, 300, 30);
		labelStatusImc.setFont(fonteDosLabels);

//		botão
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(400, 280, 100, 30);
		buttonCalcular.setForeground(corDoTexto);
		buttonCalcular.setBackground(corDoBotao);

//		eventos de click ou de tecla
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());

				labelResultadoImc.setText(cliente.nome + ", seu IMC é: " + cliente.getImc());
				labelStatusImc.setText("Status IMC: " + cliente.getStatus());
			}
		});
		
		textFieldNome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		

//		adicionar componentes ao painel (container)
		painel.add(labelImc);
		painel.add(buttonCalcular);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelNascimento);
		painel.add(textFieldNascimento);
		painel.add(labelStatusImc);
		painel.add(labelResultadoImc);

		tela.setVisible(true);

	}

}
