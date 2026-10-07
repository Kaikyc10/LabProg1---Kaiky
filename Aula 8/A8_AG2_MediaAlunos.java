import java.util.Scanner;

public class A8_AG2_MediaAlunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[][] notas = new double[3][4];

        //Entradas das notas
        for(int lin = 0; lin<notas.length; lin++){
            System.out.println("\nAluno "+ (lin+1));
            System.out.println("Digitação das notas do aluno");

            for(int col = 0; col< notas[lin].length; col++){
                System.out.print("Informe a nota "+(col+1)+":");
                notas [lin][col] = teclado.nextDouble();
            }
        }

        System.out.println("\n=== Médias ===");
        double mediaGeral = 0;

        for(int lin = 0; lin<notas.length; lin++){
            double media = 0;
            for(int col = 0; col <notas[lin].length; col++){
                media += notas[lin][col];
            }

            media = (media / notas[lin].length);
            mediaGeral += media;
            System.out.printf("Aluno %d -> Média = %.2f%n", lin+1, media);
        }

        mediaGeral = mediaGeral/ notas.length;
        System.out.printf("\n\nMédia Geral -> %.2f", mediaGeral);


        teclado.close();
    }
}
