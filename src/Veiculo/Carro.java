package Veiculo;

public class Carro extends Veiculo {

    private int passageiros;

    public Carro(String marca, String modelo, int ano, double preco, int passageiros) {
        super(marca, modelo, ano, preco);
        this.passageiros = passageiros;
    }

    //Herdado da superclasse e sobrescrito
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Passageiros " + passageiros);

    }

    //Metodo exclusivo
    public void abrirPortaMalas(){
        System.out.println("Porta-malas do " + modelo + "aberto.");
    }

    //Herdado e deve ser implementado
    @Override
    public double calcularSeguro(){
        double valor = preco *0.03;
        System.out.println("Seguro estimado do carro - R$ " + valor);
        return valor;
    }

    

}