package br.com.unesp.tecnicas_de_programacao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CalculadoraBoxListeners extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3261561904691191779L;
	private JTextField operando1, operando2;
    private JLabel resultado;
    private JComboBox<String> operacao;

    CalculadoraBoxListeners() {
        super("Calculadora");

        operacao = new JComboBox<>();
        operacao.addItem("Soma");
        operacao.addItem("Subtrai");
        operacao.addItem("Multiplica");
        operacao.addItem("Divide");

        JPanel painelSuperior = new JPanel(new FlowLayout());
        painelSuperior.add(operando1 = new JTextField(20));
        painelSuperior.add(operacao);
        painelSuperior.add(operando2 = new JTextField(20));
        painelSuperior.add(resultado = new JLabel("       = 0"));
        add(painelSuperior, BorderLayout.NORTH);

        JPanel painelInferior = new JPanel(new BorderLayout());
        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
        painelInferior.add(calcularButton);
        add(painelInferior, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void calcular() {
        try {
            double num1 = Double.parseDouble(operando1.getText());
            double num2 = Double.parseDouble(operando2.getText());
            double resultadoCalculo = 0;

            String operacaoSelecionada = (String) operacao.getSelectedItem();
            switch (operacaoSelecionada) {
                case "Soma":
                    resultadoCalculo = num1 + num2;
                    break;
                case "Subtrai":
                    resultadoCalculo = num1 - num2;
                    break;
                case "Multiplica":
                    resultadoCalculo = num1 * num2;
                    break;
                case "Divide":
                    resultadoCalculo = num1 / num2;
                    break;
            }

            resultado.setText(String.format("       = %.2f", resultadoCalculo));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira números válidos nos operandos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculadoraBoxListeners();
    }
}