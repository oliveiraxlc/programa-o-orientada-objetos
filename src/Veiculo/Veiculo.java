package Veiculo;

public abstract class Veiculo {

    // Atributos
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;
    protected boolean ligado;
    protected double velocidadeAtual;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.ligado = false;
        this.velocidadeAtual = 0.0;
    }

    // Métodos
    public void ligar() {
        if (ligado) {
            System.out.println(modelo + " já está ligado.");
        } else {
            ligado = true;
            System.out.println(modelo + " foi ligado.");
        }

    }

    public void desligar() {
        if (!ligado) {
            System.out.println(modelo + " já está desligado.");
        } else {
            ligado = false;
            velocidadeAtual = 0.0;
            System.out.println(modelo + " foi desligado.");
        }
    }

    public void acelerar(double incremento){
        if(!ligado){
            System.out.println(modelo + " está desligado. Ligue o veículo.");
        } else if (incremento <= 0) {
            System.out.println("O incremento deve ser positivo.");
        } else {
            velocidadeAtual += incremento;
            System.out.println(modelo + " acelerou para " + velocidadeAtual + " km/h.");
        }
    }

    public void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    //Metodo abstrato
    public abstract double calcularSeguro();


}