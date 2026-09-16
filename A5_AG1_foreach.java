public class A5_AG1_foreach {
    public static void main(String[] args) {
        //Criando um array de numeros
        int[] numeros = {10,20,30,40};
        for(int numero : numeros){
            System.out.println(numero);
        }

        //for tradicional
        for(int i =0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
