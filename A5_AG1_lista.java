import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A5_AG1_lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");

        for(String lista_nome: nomes){
            System.out.println("Nome:" + lista_nome);
        }

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        nomes.add(nome);

        for (String lista_nome : nomes ){
            System.out.println("Nome: " + lista_nome);
        }

        teclado.close();
        



        //inicial minuscula - tipo
        //inicial maiuscula - classe(objeto)
    }
}
