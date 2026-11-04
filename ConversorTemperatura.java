import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConversorTemperatura {
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Conversor de Temperatura");
        janela.setSize(450,250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4,1,8,8));

       

        JLabel lblCelsius = new JLabel("Temperatura em Celsius: ");
        JTextField txtCelsius = new JTextField();

        JButton btnConverter = new JButton("Converter");
        JLabel lblResultado = new JLabel(
            "Fahrenheit: ",
            SwingConstants.CENTER
        );

        painel.add(lblCelsius);
        painel.add(txtCelsius);
        painel.add(btnConverter);
        painel.add(lblResultado);

        btnConverter.addActionListener(
            new ActionListener() {
                @Override 
                public void actionPerformed(ActionEvent e){
                    double celsius = Double.parseDouble(txtCelsius.getText());

                    double fahrenheit = (celsius * 9 / 5) + 32;

                    lblResultado.setText("Fahrenheit: "
                        + fahrenheit + "F"
                    );
                }
            
        });


        janela.add(painel);
        janela.setVisible(true);
    }
}
