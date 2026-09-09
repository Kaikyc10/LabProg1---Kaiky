import java.util.Scanner;

public class EscapeMaze {
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

        System.out.println("=== Escape Maze ===");
        System.out.println("Você está em uma sala escura...");
        System.out.println("Informe a direção: ");
        String direcao = teclado.nextLine();

        if (direcao.equalsIgnoreCase("direita")){
            System.out.println("Você avançou pelo corredor!");
        }else if (direcao.equalsIgnoreCase("esquerda")){
            System.out.println("Movimento bloqueado: Há uma parede");
        }else if (direcao.equalsIgnoreCase("cima") || 
        direcao.equalsIgnoreCase("baixo")){
            System.out.println("Você continua na mesma sala");
        }else{
            System.out.println("Direção inválida!!!");
        }

        teclado.close();
    }
}

