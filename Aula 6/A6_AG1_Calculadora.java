import java.util.Scanner;

public class A6_AG1_Calculadora {

    public int somar (int a, int b){
        return a+b;
    }

    public int subtrair(int a, int b){
        return a-b;
    }

    public int multiplicar (int a, int b){
        return a * b;
    }

    public double dividir (int a, int b){
        return (double) a/b;
    }

    public void mostrarMenu(){
        System.out.println("\n===Calculadora===");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção:");
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        A6_AG1_Calculadora calculadora = new A6_AG1_Calculadora();
        int opcao;

        do{
            calculadora.mostrarMenu();
            opcao = entrada.nextInt();

            if(opcao ==0){
                System.out.println("Calculadora encerrada.");
                break;
            }
            if (opcao <1 || opcao >4){
                System.out.println("Opção inválida");
                continue;
            }

            System.out.print("Digite o 1o número: ");
            int numero1 = entrada.nextInt();

            System.out.println("Digite o 2o número: ");
            int numero2 = entrada.nextInt();

            double resultado = 0;

            switch(opcao){
                case 1:
                    resultado = calculadora.somar(numero1,numero2);
                    break;
                case 2:
                    resultado = calculadora.subtrair(numero1, numero2);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(numero1, numero2);
                    break;
                case 4:
                    if(numero2==0){
                        System.out.println("No.2 deve ser diferente de 0");
                        continue;
                    }
                    resultado = calculadora.dividir(numero1, numero2);
                    break;
            }
            System.out.println("Resultado: " + resultado);
        }while(opcao != 0);
        entrada.close();
    }
}
