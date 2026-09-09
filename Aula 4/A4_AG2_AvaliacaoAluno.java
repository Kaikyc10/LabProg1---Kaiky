public class A4_AG2_AvaliacaoAluno {
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

        double nota = 6.99999999999999;

        if((int)nota>=7){
            System.out.println("Aluno aprovado! " + nota);

        }else if ((int)nota >=5){
            System.out.println("Aluno de recuperação " + ((int)nota));
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
