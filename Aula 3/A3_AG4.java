import java.util.ArrayList;
import java.util.List;

public class A3_AG4 {
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

        System.out.println("AG4 - Atividades em Sala");

        /*
            Parte 1 - Tipos primitivos
        */

        int idade = 20;
        double salario = 2500.50;
        boolean ativo = true;

        System.out.println("=== Tipos Primitivos ===");
        System.out.println("Idade: "+ idade);
        System.out.println("Salário: "+ salario);
        System.out.println("Ativo: "+ ativo);
        System.out.println("-----------------------");

        //Parte 2 - Declaração por Referência

        int [] numeros = {1,2,3,4,5};


        List<String> nomes = new ArrayList<>();
        nomes.add("Bonnie");
        nomes.add("Popó");
        nomes.add("Pretinho");

        System.out.println("==== Tipos por Preferência ====");

        for(int numero: numeros){
            System.out.println(numero);
        }

        for(String nome: nomes){
            System.out.println(nome);
        }


        //Parte 3 - Operadores Aritméticos
        double nota1 = 6.5;
        double nota2 = 7.0;

        double soma = nota1 + nota2;
        double media = soma/2;

        System.out.println("Nota 1: "+ nota1 + 
                           "\nNota 2: "+ nota2 +
                           "\nSoma: "+ soma +
                           "\nMédia:"+media
                        );
        media += 0.5;
        media -= 0.2;
        media *= 1;
        media /= 1;

        int faltas = 9;
        faltas++;
        faltas--;

        int restoFaltas = faltas % 2;

        //Parte 4 - Operadores relacionais

        boolean mediaSuficidente = media>=7.0;
        boolean poucasFaltas = faltas <10;
        boolean faltasExatas = faltas == 10;
        boolean faltasDiferentes = faltas!=5;

        //parte 5 - Operadores Lógicos: && || !

        boolean aprovadoDireto = mediaSuficidente && poucasFaltas;
        boolean fazerExame = media>=5.00 && media <7.0 && faltas < 15;
        boolean dp = media <5.0 || faltas > 15;

        //Parte 6 - Operador ternário

        String resultadoFinal = aprovadoDireto ? "Aluno Aprovado" : "Depende...";

        System.out.println("===================");
        System.out.println("Média final: "+media);
        System.out.println("Faltas: " + faltas);
        System.out.println("Resto das faltas: "+ restoFaltas);
        System.out.println("Aprovado direto?" + aprovadoDireto);
        System.out.println("Resultado final:" + resultadoFinal);


    }
}
