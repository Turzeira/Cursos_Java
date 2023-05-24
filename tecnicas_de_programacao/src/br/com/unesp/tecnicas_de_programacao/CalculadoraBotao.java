package br.com.unesp.tecnicas_de_programacao;

import java.awt.*;
import javax.swing.*;

class CalculadoraBotao extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6396618263160570090L;
	JTextField operando1, operando2;
	JLabel resultado;

	CalculadoraBotao() {
		super("Calculadora");
		setLayout(new FlowLayout());
		add(operando1 = new JTextField(20), BorderLayout.WEST);
		JPanel painelCentral = new JPanel(new GridLayout(4, 1));
		painelCentral.add(new JButton("Soma"));
		painelCentral.add(new JButton("Subtrai"));
		painelCentral.add(new JButton("Multiplica"));
		painelCentral.add(new JButton("Divide"));
		add(painelCentral, BorderLayout.CENTER);
		add(operando2 = new JTextField(20), BorderLayout.EAST);
		add(resultado = new JLabel("= 0"));
		pack();
		setVisible(true);
	}

	static public void main(String[] args) {
		new CalculadoraBotao();
	}
}
