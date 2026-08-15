package Veiculo;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Carro("Chevrolet", "Onix", 2020, 75000.0, 5);
        veiculos[1] = new Caminhao("Scania", "XYZ", 2023, 210000.0, 40000.0, 0.0);
        

        System.out.println("Herança e polimorfismo");
        for(Veiculo v : veiculos){
            v.ligar();
            v.acelerar(60.0);
            v.exibirInfo();
            v.calcularSeguro();
            v.desligar();
            System.out.println();
        }
    }

}