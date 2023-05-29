import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCalculadora extends JFrame {
    public JPanel panelMain;
    private JTextField textValor1;
    private JTextField textValor2;
    private JButton somarButton;
    private JTextField textResultado;
    private JButton dividirButton;
    private JButton ceButton;
    private JButton diminuirButton;
    private JButton multiplicarButton;

    public FormCalculadora() {
    somarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Integer valor1 = Integer.valueOf(textValor1.getText());
            Integer valor2 = Integer.valueOf(textValor2.getText());

            Integer soma = valor1 + valor2;

            textResultado.setText(soma.toString());

            }

    });

        diminuirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer valor1 = Integer.valueOf(textValor1.getText());
                Integer valor2 = Integer.valueOf(textValor2.getText());

                Integer soma = valor1 - valor2;

                textResultado.setText(soma.toString());

            }

        });

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer valor1 = Integer.valueOf(textValor1.getText());
                Integer valor2 = Integer.valueOf(textValor2.getText());

                Integer soma = valor1 / valor2;

                textResultado.setText(soma.toString());

            }

        });

        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer valor1 = Integer.valueOf(textValor1.getText());
                Integer valor2 = Integer.valueOf(textValor2.getText());

                Integer soma = valor1 * valor2;

                textResultado.setText(soma.toString());

            }

        });

        ceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textResultado.setText("");

            }

        });

   }

}
