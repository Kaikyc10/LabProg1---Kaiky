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

        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(new GridLayout(4,2,10,15));

        JLabel lblNome = new JLabel("Nome: ");
        JTextField txtNome = new JTextField();

        painelFormulario.add(lblNome);
        painelFormulario.add(txtNome);

        
        JLabel lblIdade = new JLabel("Idade: ");
        JTextField txtIdade = new JTextField();

        painelFormulario.add(lblIdade);
        painelFormulario.add(txtIdade);

        JLabel lblCurso = new JLabel("Curso: ");
        String[] cursos = {
            "Selecione...",
            "Engenharia de Computação",
            "Análise e Desenvolvimento de Sistemas",
            "Ciência da Computação",
            "Sistemas de Informação"
        };
        JComboBox<String> cmbCurso = new JComboBox<>(cursos);

        painelFormulario.add(lblCurso);
        painelFormulario.add(cmbCurso);

        JCheckBox chkParticipacao = new JCheckBox("Confirmo minha participação no evento");

        painelFormulario.add(new JLabel(""));
        painelFormulario.add(chkParticipacao);

        painelPrincipal.add(painelFormulario,BorderLayout.CENTER);

        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnLimpar = new JButton("Limpar");

        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnLimpar);

        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

    
        janela.setVisible(true);

        btnCadastrar.addActionListener(
            evento -> {
                String nome = txtNome.getText().trim();
                String idadeTexto = txtIdade.getText().trim();
                String curso = (String) cmbCurso.getSelectedItem();


                if(nome.isEmpty()){
                    JOptionPane.showMessageDialog(
                        janela,
                        "Informe o nome do participante",
                        "Campo obrigatório.",
                        JOptionPane.WARNING_MESSAGE
                    );

                    txtNome.requestFocus();
                    return;
                }

                if(idadeTexto.isEmpty()){
                    JOptionPane.showMessageDialog(
                        janela,
                        "Informe a Idade.",
                        "Campo Obrigatório.",
                        JOptionPane.WARNING_MESSAGE
                    );

                    txtIdade.requestFocus();
                    return;
                }

                int idade;

                try{
                    idade = Integer.parseInt(idadeTexto);
                } catch(NumberFormatException erro){
                    JOptionPane.showMessageDialog(
                        janela,
                        "A idade deve ser um número inteiro",
                        "Valor inválido",
                        JOptionPane.ERROR_MESSAGE
                    );
                    txtIdade.requestFocus();
                    return;
                }

                if (idade <=15 || idade >=120){
                    JOptionPane.showMessageDialog(
                        janela,
                        "Informe uma idade > 15 e < 120",
                        "Valor invalido",
                        JOptionPane.ERROR_MESSAGE
                    );
                    txtIdade.requestFocus();
                    return;
                }

                if(cmbCurso.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(
                        janela,
                        "Selecione um curso",
                        "Campo obrigatório",
                        JOptionPane.WARNING_MESSAGE
                    );
                    cmbCurso.requestFocus();
                    return;
                }

                if(!chkParticipacao.isSelected()){
                    JOptionPane.showMessageDialog(
                        janela,
                        "É necessário confirmar a participação",
                        "Confirmação necessária.",
                        JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }

                String mensagem = "Cadastro realizado com sucesso!" +
                "\n\n"+
                "Nome: " + nome + "\n" +
                "Idade: "+ idade+ "\n" +
                "Curso: " + curso + "\n"+
                "Participação confirmada: Sim";
                
                JOptionPane.showMessageDialog(
                    janela,
                    mensagem,
                    "Cadastro concluído",
                    JOptionPane.INFORMATION_MESSAGE
                );
                   
            }
        );

        btnLimpar.addActionListener(
            evento -> {
                txtNome.setText("");
                txtIdade.setText("");
                cmbCurso.setSelectedIndex(0);
                chkParticipacao.setSelected(false);
                txtNome.requestFocus();
            }
        );

        
    }
}
