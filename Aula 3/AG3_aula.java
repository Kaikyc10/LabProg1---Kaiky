public class AG3_aula{


    public static void main(String[] args) {
        System.out.println("Laboratório Java iniciado!");
        //Declarou a variável robo1 do tipo Robo
        //Depois a gente instanciou a variável robo1
        //isso é igual = OBJETO
        Robo robo1 = new Robo();
        robo1.setNome( "Atom");
        robo1.setModelo("RX-1");
        robo1.setEnergia(70);
    

        Robo robo2 = new Robo();
        robo2.setNome( "Mockujina");
        robo2.setModelo( "NX-0");
        robo2.setEnergia(  40);

        System.out.println("ROBÔ 1: " + robo1.getNome());
        System.out.println("ROBÔ 2: " + robo2.getNome());
        System.out.println("------------------------------------");
        robo1.apresentar();
        System.out.println();
        robo2.apresentar();
    }
}