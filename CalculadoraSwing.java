import javax.swing.*;
import java.awt.*;
public class CalculadoraSwing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> criarInterface());
        
    }

    public static void criarInterface(){
        JFrame janela = new JFrame("Calculadora Swing");

        janela.setSize(520,430);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        JPanel painelPrincipal = new JPanel(
            new BorderLayout(10,15)
        );

        painelPrincipal.setBorder(
            BorderFactory.createEmptyBorder(20,20,20,20));

        JLabel lblTitulo = new JLabel(
            "Calculadora", SwingConstants.CENTER);

        lblTitulo.setFont(new Font("Arial",Font.BOLD,26));
        
        painelPrincipal.add(lblTitulo,BorderLayout.NORTH);

        JPanel painelFormulario = new JPanel(new GridLayout(3,2,10,15));

        JLabel lblPrimeiroValor = new JLabel("Primeiro Valor: ");
        JTextField txtPrimeiroValor = new JTextField();

        JLabel lblSegundoValor = new JLabel("Primeiro Valor: ");
        JTextField txtSegundoValor = new JTextField();

        JLabel lblOperacao = new JLabel("Operação: ");

        String[] operacoes = {
            "Adição (+)",
            "Subtração (-)",
            "Multiplicação(*)",
            "Divisão (/)"
        };


        janela.add(painelPrincipal);
        janela.setVisible(true);
    }
    
}
