import java.util.Scanner;

public class A7_AG1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];
        
        System.out.println("=== Leitura De Números ===");
        for (int i = 0; i<numeros.length; i++){
            //System.out.printf("Digite o %do. número: ", (i+1));
            System.out.println("Digite o " + i + "o. num: ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("\n=== Valores Digitados ===");
        for (int i = 0; i<numeros.length; i++){
            System.out.printf("Posição %d valor digitado %d \n",i,numeros[i]);
        }
        teclado.close();
    }
}
