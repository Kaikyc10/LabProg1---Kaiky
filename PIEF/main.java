import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Calculadora calculadora = new Calculadora(); 

        System.out.println("===== CALCULADORA ESTATÍSTICA =====");

        System.out.println("Bem - vindo(a) á Calculadora Estatística!");
        System.out.println();
        System.out.print("Pra começarmos, quantos valores você deseja inserir? : ");

        int qtde = teclado.nextInt();

        double[] numeros = new double[qtde];

        System.out.println("Certo, vamos trabalhar com " + qtde + " números!");

        for (int i = 0; i<numeros.length; i++){
            System.out.print("Digite o valor nº" + (i+1) + ":");
            numeros[i] = teclado.nextDouble();
        }

        System.out.println("Números registrados!");
        System.out.println(Arrays.toString(numeros));
        System.out.println();
        

        boolean continuar = true;

        while(continuar){
        System.out.println("===== OPERAÇÕES ESTATÍSTICAS =====");
        System.out.println("1 - Moda");
        System.out.println("2 - Média");
        System.out.println("3 - Mediana");
        System.out.println("4 - Quartis");
        System.out.println("5 - Percentis");
        System.out.println("6 - Variância");
        System.out.println("7 - Desvio-Padrão");
        System.out.println("8 - Sair");
        System.out.println("====================================");

        System.out.print("Digite a operação desejada: ");
        int opcao = teclado.nextInt();

        while(opcao!= 1 && opcao!=2 && opcao!=3 && opcao!=4 && opcao!=5 && opcao!=6 && opcao!=7 && opcao!=8){
            System.out.print("Opção inválida, digite novamente: ");
            opcao = teclado.nextInt();
        }

        switch (opcao) {
            case 1:
                System.out.println("A Moda é: "+ calculadora.moda(numeros));
                break;
        
            case 2:
                System.out.println("A Média é: " + calculadora.media(numeros));
                break;
            case 3:
                System.out.println("A mediana é: " + calculadora.mediana(numeros));
                break;
            case 4:
                System.out.print("Digite 1 p/Q1 ou 3 p/Q3: ");
                int q = teclado.nextInt();

                while(q!= 1 && q!=3){
                    System.out.println("Numero inválido, digite novamente.");
                    System.out.print("Digite 1 p/Q1 ou 3 p/Q3: ");
                    q = teclado.nextInt();
                }

                if(q == 1){
                    System.out.println("O valor de Q1 é: " + calculadora.q1(numeros));
                }else{
                    if(q == 3){
                        System.out.println("O valor de Q3 é: " + calculadora.q3(numeros));
                    }
                }
                break;
            case 5:
                System.out.print("Qual o percentil desejado? : ");
                int p = teclado.nextInt();

                while(p<0 || p>100){
                    System.out.print("Valor inválido. Digite novamente: ");
                    p = teclado.nextInt();
                }

                System.out.println("O valor é: " + calculadora.percentil(p, numeros));
                break;
            case 6:
                System.out.println("A Variância é: " + calculadora.variancia(numeros));
                break;
            case 7:
                System.out.println("O Desvio-Padrão é: "+ calculadora.desvioPadrao(calculadora.variancia(numeros)));
                break;
            case 8:
                System.out.println("Obrigado por usar a Calculadora Estatística!");
                continuar = false;
                break;
            default:
                System.out.println("Opção inválida");
                break;
            }

        }
        teclado.close();
    }
    
}
