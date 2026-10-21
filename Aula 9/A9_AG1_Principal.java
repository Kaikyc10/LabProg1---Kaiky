import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class A9_AG1_Principal {

    public static void main(String[] args) {
        JFrame janela = new JFrame();

        janela.setTitle("Minha Primeira Janela");
        janela.setSize(600,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        JLabel lblNome = new JLabel("Nome: ");
        JTextField txtNome = new JTextField(20);
        JButton btnSalvar = new JButton("Salvar");

        janela.add(lblNome);
        janela.add(txtNome);
        janela.add(btnSalvar);
        

        janela.setVisible(true);



        

        btnSalvar.addActionListener(
            e -> {
                JOptionPane.showMessageDialog(null, "Olá, você clicou no botão");
            }
        );
    }
    
}
