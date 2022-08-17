package br.senai.sp.jandira;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestJOptionPane {

	public static void main(String[] args) {
		
		//caixas de diálogo para mensagem somente
//		JOptionPane.showMessageDialog(null, "Olá isso é uma mensagem");
//		JOptionPane.showMessageDialog(null, "Essa é outra mensagem", "Senai Jandira", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Essa é outra mensagem", "Senai Jandira", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Essa é outra mensagem", "Senai Jandira", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Essa é outra mensagem", "Senai Jandira", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Essa é outra mensagem", "Senai Jandira", JOptionPane.PLAIN_MESSAGE);
		
		ImageIcon icone = new ImageIcon("src/br/senai/sp/jandira/imagens/info24.png");
		JOptionPane.showMessageDialog(null, "Essa é outra mensagem", "Senai Jandira", JOptionPane.INFORMATION_MESSAGE, icone );
		
		ImageIcon laylinha = new ImageIcon("src/br/senai/sp/jandira/imagens/layla.png");
		JOptionPane.showMessageDialog(null, "Essa é outra mensagem", "Senai Jandira", JOptionPane.INFORMATION_MESSAGE, laylinha);
		

	}

}
