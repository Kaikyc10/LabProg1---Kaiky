import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
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

        JComboBox<String> cmbOperacao = new JComboBox<>(operacoes);

        painelFormulario.add(lblPrimeiroValor);
        painelFormulario.add(txtPrimeiroValor);

        painelFormulario.add(lblSegundoValor);
        painelFormulario.add(txtSegundoValor);

        painelFormulario.add(lblOperacao);
        painelFormulario.add(cmbOperacao);

        JPanel painelCentro = new JPanel (new BorderLayout(10,20));

        painelCentro.add(painelFormulario, BorderLayout.NORTH);

        JLabel lblResultado = new JLabel ("Resultado: --",SwingConstants.CENTER);
        lblResultado.setFont(new Font("Arial",Font.BOLD,22));
        lblResultado.setOpaque(true);
        lblResultado.setBackground(new Color(232,245,233));

        lblResultado.setBorder(
            BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                new Color(62,160,71),2
                ),
            BorderFactory.createEmptyBorder(18,10,18,10)
            )
        );


        painelCentro.add(lblResultado,BorderLayout.CENTER);
        painelPrincipal.add(painelCentro, BorderLayout.CENTER);
        
        JButton btnCalcular = new JButton("Calcular");
        JButton btnLimpar = new JButton("Limpar");
        JPanel painelBotoes = new JPanel(
            new FlowLayout(FlowLayout.CENTER)
        );

        painelBotoes.setBackground(Color.ORANGE);
        painelBotoes.add(btnCalcular);
        painelBotoes.add(btnLimpar);
        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

        DecimalFormat formato = new DecimalFormat("#, ##0.00");

        btnCalcular.addActionListener(
            e ->{
                String primeiroTexto = txtPrimeiroValor.getText().trim().replace(",",".");
                String segundoTexto = txtSegundoValor.getText().trim().replace(",",".");

                if(primeiroTexto.isEmpty()){
                    JOptionPane.showMessageDialog(
                        janela, 
                        "Informe o primeiro valor",
                        "Campo obrigatório.",
                        JOptionPane.WARNING_MESSAGE
                    );
                    txtPrimeiroValor.requestFocus();
                    return;
                }

                if(segundoTexto.isEmpty()){
                    JOptionPane.showMessageDialog(
                        janela, 
                        "Informe o segundo valor",
                        "Campo obrigatório.",
                        JOptionPane.WARNING_MESSAGE
                    );
                    txtSegundoValor.requestFocus();
                    return;
                }

                double primeiroValor, segundoValor;

                try{
                    primeiroValor = Double.parseDouble(primeiroTexto);
                    segundoValor = Double.parseDouble(segundoTexto);
                }catch (NumberFormatException erro){
                    JOptionPane.showMessageDialog(
                        janela,
                        "Digite apenas valores numéricos",
                        "Valor inválido",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                int operacaoSelecionada = cmbOperacao.getSelectedIndex();

                double resultado;
                String simbolo;

                switch(operacaoSelecionada){
                    case 0:
                        resultado = primeiroValor + segundoValor;
                        simbolo = "+";
                        break;
                    case 1:
                        resultado = primeiroValor - segundoValor;
                        simbolo = "-";
                        break;
                    case 2:
                        resultado = primeiroValor * segundoValor;
                        simbolo = "*";
                        break;
                    case 3:
                        if(segundoValor == 0){
                            JOptionPane.showMessageDialog(
                                janela,
                                "Não é possível dividir por zero",
                                "Operação inválida",
                                JOptionPane.ERROR_MESSAGE
                            );
                            txtSegundoValor.requestFocus();
                            return;
                        }
                        resultado = primeiroValor / segundoValor;
                        simbolo = "/";
                        break;
                    default:
                        JOptionPane.showMessageDialog(
                            janela,
                            "Selecione uma operação válida",
                            "Operação inválida.",
                            JOptionPane.ERROR_MESSAGE
                        );
                        return;
                    
                }

                lblResultado.setText(
                    "Resultado: "
                    + formato.format(primeiroValor)
                    + " "
                    + simbolo
                    + " "
                    + formato.format(segundoValor)
                    + " = "
                    + formato.format(resultado)
                );

                
            }
        );

        btnLimpar.addActionListener(
            e -> {
                txtPrimeiroValor.setText("");
                txtSegundoValor.setText("");
                cmbOperacao.setSelectedIndex(0);
                lblResultado.setText("Resultado --");
                txtPrimeiroValor.requestFocus();
            }
        );

        janela.add(painelPrincipal);
        janela.setVisible(true);
    }
    
}
