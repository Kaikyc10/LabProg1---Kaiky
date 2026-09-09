import java.util.Scanner;

public class A3_AG5 {
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

        double num1,num2;

        System.out.print("Digite o 1o número: ");
        num1 = teclado.nextDouble();

        System.out.print("Digite o 2o número: ");
        num2 = teclado.nextDouble();

        System.out.println("Soma: " + (num1+num2));
        System.out.println("Subtração: "+ (num1-num2));
        System.out.println("Multiplicação: "+(num1*num2));
        System.out.println("Divisão: "+(num1/num2));

        teclado.close();
    }
}
