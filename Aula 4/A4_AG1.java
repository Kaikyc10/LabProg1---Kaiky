
import java.util.Scanner;

public class A4_AG1 {
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


        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Idade: ");
        int idade = teclado.nextInt();

        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        System.out.println();
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);

        teclado.close();
    }
}
