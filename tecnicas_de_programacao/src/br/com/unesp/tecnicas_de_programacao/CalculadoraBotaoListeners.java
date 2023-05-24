package br.com.unesp.tecnicas_de_programacao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CalculadoraBotaoListeners extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2902601883864674381L;
	private JTextField operando1, operando2;
    private JLabel resultado;

    CalculadoraBotaoListeners() {
        super("Calculadora");
        setLayout(new BorderLayout());

        operando1 = new JTextField(20);
        add(operando1, BorderLayout.WEST);

        JPanel painelCentral = new JPanel(new GridLayout(4, 1));
        JButton somaButton = new JButton("Soma");
        somaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("+");
            }
        });
        painelCentral.add(somaButton);

        JButton subtraiButton = new JButton("Subtrai");
        subtraiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("-");
            }
        });
        painelCentral.add(subtraiButton);

        JButton multiplicaButton = new JButton("Multiplica");
        multiplicaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("*");
            }
        });
        painelCentral.add(multiplicaButton);

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("/");
            }
        });
        painelCentral.add(divideButton);

        add(painelCentral, BorderLayout.CENTER);

        operando2 = new JTextField(20);
        add(operando2, BorderLayout.EAST);

        resultado = new JLabel("       = 0");
        add(resultado, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void calcular(String operador) {
        try {
            double num1 = Double.parseDouble(operando1.getText());
            double num2 = Double.parseDouble(operando2.getText());
            double resultadoCalculo = 0;

            switch (operador) {
                case "+":
                    resultadoCalculo = num1 + num2;
                    break;
                case "-":
                    resultadoCalculo = num1 - num2;
                    break;
                case "*":
                    resultadoCalculo = num1 * num2;
                    break;
                case "/":
                    resultadoCalculo = num1 / num2;
                    break;
            }

            resultado.setText(String.format("       = %.2f", resultadoCalculo));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira números válidos nos operandos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculadoraBotaoListeners();
    }
}