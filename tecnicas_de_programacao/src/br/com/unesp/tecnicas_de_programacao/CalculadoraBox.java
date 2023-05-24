package br.com.unesp.tecnicas_de_programacao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CalculadoraBox extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5005284978724348932L;
	JTextField operando1, operando2;
	JLabel resultado;

	CalculadoraBox() {
		super("Calculadora");
		JComboBox<String> operacao = new JComboBox<String>();
		operacao.addItem("Soma");
		operacao.addItem("Subtrai");
		operacao.addItem("Multiplica");
		operacao.addItem("Divide");
		JPanel painelSuperior = new JPanel(new FlowLayout());
		painelSuperior.add(operando1 = new JTextField(20));
		painelSuperior.add(operacao);
		painelSuperior.add(operando2 = new JTextField(20));
		painelSuperior.add(resultado = new JLabel("= 0"));
		add(painelSuperior, BorderLayout.NORTH);
		JPanel painelInferior = new JPanel(new BorderLayout());
		painelInferior.add(new JButton("Calcular"));
		add(painelInferior, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}

	static public void main(String[] args) {
		new CalculadoraBox();
	}
}
