public class A4_AG2_DescontoCompra {
    public static void main(String[] args) {
        double valorCompra = 650.00;
        double desconto = 0.0;

        if(valorCompra >= 500){
            desconto = 0.20;
        }else if (valorCompra >= 300){
            desconto = 0.10;
        }else if (valorCompra >= 75){
            desconto = 0.05;
        }else{
            desconto = 0;
        }

        double valorFinal = valorCompra - (valorCompra * desconto);
        System.out.println("Valor final: R$" + valorFinal);
    }
}
