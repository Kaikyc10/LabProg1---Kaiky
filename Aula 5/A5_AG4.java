import java.util.Scanner;

public class A5_AG4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double total = 0;
        double maior = 0;

        for (int i = 1; i<=5; i++){
            System.out.println("Digite o valor da venda: ("+i+"):");
            double valor = teclado.nextDouble();
            total+=valor;


            maior = (valor > maior) ? valor : maior;
            /* 
            if (valor > maior){
                maior = valor;
            }
            */
        }
        double media = total/5;
        System.out.println("Total vendido: " + total);
        System.out.println("Média: "+media);
        System.out.println("Maior venda: "+maior);
        //System.out.println("teste");
        teclado.close();
    }
}
