public class A4_AG2_ClassificacaoIdade {

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

        int idade = 17;

        if(idade <12){
        System.out.println("Você é menó");
        }else if (idade < 18){
            System.out.println("Você não é tão menó");
        }else if (idade <60){
            System.out.println("Você é drake");
        }else{
            System.out.println("Tu és ancião");
        }
    }
}