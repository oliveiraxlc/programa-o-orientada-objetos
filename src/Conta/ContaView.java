package Conta;

import java.util.Scanner;


public class ContaView {
    private Scanner sc = new Scanner(System.in);
    
    public int exibirMenu(){

        System.out.println("");
        System.out.println("=== Banco POO ===");
        System.out.println("1- Criar conta");
        System.out.println("2- Depositar");
        System.out.println("3- sacar");
        System.out.println("4- Emitir Extrato");
        System.out.println("5- Listar Contas");
        System.out.println("0- Sair");
        System.out.println("-EScolha Uma Opção ");
        return sc.nextInt();

    }

    public int escolherTipoConta(){
        System.out.println("1- Conta Corrente");
        System.out.println("2- Conta Poupança");
        System.out.println("Tipo de Conta");
        return sc.nextInt();
    }

    public int lerInteiro( String rotulo){
        System.out.println(rotulo);
        return sc.nextInt();
        
    }

    public double lerValor(String rotulo){
        System.out.println(rotulo);
        return sc.nextDouble();
    }

    public String lerTexto(String titular){
        System.out.println(titular);
        return sc.nextLine();
    }

    public void exibirMensagem(String mensagem){
        System.out.println(mensagem);

    }

    public void listarContas(ContaBancaria[] contas, int total){
        if(total == 0){
            System.out.println("nenhuma conta cadastrada");
            return;
        }
        System.out.println("=== Contas Cadastradas ===");
        for(int i = 0; i < total; i++) {
            ContaBancaria conta = contas[i];
            System.out.printf("N° %d | %s | Titular: %s | Saldo R$ %.2 | Status: $s%n",
            conta.getNumeroConta(),
            conta.getClass().getSimpleName(),
            conta.getTitular(),
            conta.getSaldo(),
            conta.getTitular());
    };

    }
}
