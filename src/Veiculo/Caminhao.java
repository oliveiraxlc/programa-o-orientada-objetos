package Veiculo;

public class Caminhao extends Veiculo {

    // Atributos
    private double capacidadeCarga;
    private double cargaAtual;

    // Construtor

    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga, double cargaAtual) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.cargaAtual = 0.0;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + "kg");

    }

    @Override
    public double calcularSeguro() {
        double valor = (preco * 0.04) + (capacidadeCarga * 0.02);
        System.out.println("Seguro estimado do caminhão - R$: " + valor);
        return valor;
    }

    //Metodo exclusivo

    public void carregar(double peso){
        if(peso <= 0){
            System.out.println("Peso inválido para carregamento.");
        } else if (cargaAtual + peso > capacidadeCarga){
            System.out.println("A carga excede a capacidade máxima de " + capacidadeCarga + "kg.");
        } else{
            cargaAtual += peso;
            System.out.println("Carga atual: " + cargaAtual + "kg de " + capacidadeCarga + "kg.");
        }
    }

}