import java.util.Scanner;

public class A8_AG1_Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("=== Preenchendo a Matriz ===");

        for (int linha = 0; linha<matriz.length; linha++){
            for(int coluna = 0; coluna<matriz[linha].length; coluna++){
                System.out.print("Digite o valor ["+linha+"] ["+coluna+"]: ");
                matriz[linha][coluna] = teclado.nextInt();
            }
            
        }

        System.out.println("\n=== Exibindo a Matriz ===");
        
        for (int linha = 0; linha<matriz.length; linha++){
            for (int coluna = 0; coluna<matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        teclado.close();
        

        

    }
}
