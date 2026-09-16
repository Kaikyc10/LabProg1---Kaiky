import java.util.Scanner;

public class A5_AG3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            opcao = teclado.nextInt();
        }while (opcao !=0);

        System.out.println("Última opção digitada: " + opcao);
        teclado.close();
    }
}
