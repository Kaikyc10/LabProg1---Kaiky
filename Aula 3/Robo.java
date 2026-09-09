public class Robo {

    //ATRIBUTOS - Qualidades ou qualificações da classe
    //          - Os nomes são substantivos
    //TIPOS PRIMITIVOS - int, char, boolean, decimal. float
    //String, Robo = Classes

    //VISIBILIDADE = public/private/protected/default
    private String nome;
    private String modelo;
    private int energia;


    //Encapsulamento

    //Criando um método - Ou seja, uma ação
    //                  - nome dos métodos são VERBOS

    public void apresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Energia: "+ this.energia);
    }

    public void recarregar(){
        this.energia = 100;
        System.out.println(nome + " Foi recarregado!");
    }

    //GETTERs (leio o valor) e SETTERs(altero o valor)

    public int getEnergia(){
        return this.energia;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

}
