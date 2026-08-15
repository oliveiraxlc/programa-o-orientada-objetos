package Veiculo;

public class MainVeiculo {
    public static void main(String[] args) {
        // Criando um objeto da classe Veiculo
        Veiculo carro = new Carro("Toyota", "Corolla", 2020, 90000.00, 5);
        Veiculo honda = new Carro("Honda", "HR-V", 2024, 180000.0,5);

        // Exibindo informações do veículo
        carro.exibirInfo();

        System.out.println();
        honda.exibirInfo();

        // Ligando o veículo
        carro.ligar();
        honda.ligar();

        // Acelerando o veículo
        carro.acelerar(20);
        System.out.println();
        honda.acelerar(30);

        // Desligando o veículo
        carro.desligar();
        System.out.println();
        honda.desligar();


    }

}