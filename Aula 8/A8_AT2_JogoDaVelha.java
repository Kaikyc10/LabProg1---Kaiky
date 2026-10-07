import java.util.Random;
import java.util.Scanner;

public class A8_AT2_JogoDaVelha {
    static final char VAZIO = ' ';
    static final char JOGADOR_X = 'X';
    static final char JOGADOR_0 = 'O';

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Random aleatorio = new Random();

        char[][] tabuleiro = new char[3][3];

        inicializarTabuleiro(tabuleiro);

        System.out.println("===========================");
        System.out.println("     Jogo da Velha    ");
        System.out.println("1 - Humano x Humano");
        System.out.println("2 - Humano x IA");

        int modo;

        do{
            System.out.print("Escolha o modo de jogo: ");
            modo = tec.nextInt();

            if(modo != 1 && modo!= 2){
                System.out.println("Opção inválida, digite 1 ou 2");
            }

        }while(modo !=1 && modo !=2);

        char jogadorAtual = JOGADOR_X;
        boolean jogoTerminou = false;

        while(!jogoTerminou){
            exibirTabuleiro(tabuleiro);

            if(modo == 2 && jogadorAtual == JOGADOR_0){
                System.out.println("\nVez do computador");
                realizarJogadaComputador(tabuleiro, aleatorio);
            }else {
                realizarJogadaHumano(tabuleiro, jogadorAtual, tec);
            }
        }

        if(verificarVitoria(tabuleiro, jogadorAtual)){
            exibirTabuleiro(tabuleiro);

            if(modo ==2 && jogadorAtual == JOGADOR_0){
                System.out.println("\nO computador venceu!");
            }else{
                System.out.println("\nO jogador"+jogadorAtual+"venceu!");
            }

            jogoTerminou = true;
        }else if(verificarEmpate(tabuleiro)){
            exibirTabuleiro(tabuleiro);
            System.out.println("\nO jogo terminou empatado");
            jogoTerminou = true;
        } else{
            jogadorAtual = trocarJogador(jogadorAtual);
        }
        tec.close();
    }


    public static void inicializarTabuleiro(char[][] tabuleiro){
        for(int linha = 0; linha<tabuleiro.length; linha++){
            for(int coluna = 0; coluna<tabuleiro[linha].length; coluna++){
                tabuleiro[linha][coluna] = VAZIO;
            }
        }
    }
    public static void exibirTabuleiro(char[][] tabuleiro){
        System.out.println("\n    0   1   2");
        System.out.println("  +---+---+---+");

        for(int lin = 0; lin<tabuleiro.length; lin++){
            System.out.println(lin+ " | ");
            for(int col = 0; col < tabuleiro[lin].length; col++){
                System.out.println(" " + tabuleiro[lin][col] + " | ");

            }
            System.out.println();
            System.out.println("  +---+---+---+");
        }
    }

    public static void realizarJogadaHumano(char [][] tabuleiro, char jogador, Scanner tec){
        int linha;
        int coluna;
        boolean jogadaValida = false;

        while(!jogadaValida){
            System.out.println("\nVez do jogador "+jogador+".");

            System.out.print("Digite a linha: ");
            linha = tec.nextInt();

            System.out.print("Digite a coluna: ");
            coluna = tec.nextInt();

            if(!posicaoLivre(tabuleiro, linha, coluna)){
                System.out.println("Essa posição já está ocupada!");
            }else{
                tabuleiro[linha][coluna] = jogador;
                jogadaValida = true;
            }
        }
    }


    public static boolean posicaoValida(int linha, int coluna){
        return linha >=0 && linha <3 && linha >=0 && linha<3;
    }

    public static boolean posicaoLivre (char[][] tabuleiro, int linha, int coluna){
        return tabuleiro[linha][coluna] == VAZIO;
    }

    public static char trocarJogador(char jogadorAtual){
        if(jogadorAtual == JOGADOR_X){
            return JOGADOR_0;
        }
        return JOGADOR_X;
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char jogador){
        for (int lin = 0; lin< tabuleiro.length; lin++){
            if(tabuleiro[lin][0] == jogador && tabuleiro[lin][1] == jogador && tabuleiro[lin][2] == jogador){
                return true;
            }
        }
        for (int coluna = 0; coluna < tabuleiro[0].length; coluna++){
            if(tabuleiro[0][coluna]==jogador && tabuleiro [1][coluna]== jogador && tabuleiro[2][coluna]==jogador){
                return true;
            }
        }
        
    }
}
