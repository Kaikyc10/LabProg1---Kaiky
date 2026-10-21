import javax.swing.*;
import java.awt.*;

public class A9_AG5_CadastroParticipante {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Cadastro de Participante");

        janela.setSize(560,420);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10,10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        janela.add(painelPrincipal);

        JLabel lblTitulo = new JLabel("Cadastro p/ Eventos de Tecnologia", SwingConstants.CENTER);

        lblTitulo.setFont(new Font("Arial", Font.BOLD,22));


        painelPrincipal.add(lblTitulo, BorderLayout.NORTH);

        janela.setVisible(true);

        
    }
}
