import java.util.Scanner;

public class A4_AG2_SistemaNotas {
    public static void main(String[] args) {

        try{
            String os = System.getProperty("os.name");
            if(os.contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls")
                .inheritIO()
                .start()
                .waitFor();
            } else{
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e){
            //tratamento de erros
        }


        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a 1a Nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a 2a Nota: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 +nota2)/2;

        System.out.println("================");
        System.out.printf("\nAluno %s - Média: %.2f\n", nome, media);
        //System.out.printf("\nMédia: %.2f", media);

        String situacao = "Situação: ";
        if(media >= 6){
            situacao += "APROVADO";
        } else if (media >=4){
            situacao += "RECUPERAÇÃO";;
        } else{
            situacao += "REPROVADO";;
        }
        System.out.println(situacao);

        teclado.close();
    }   
}
