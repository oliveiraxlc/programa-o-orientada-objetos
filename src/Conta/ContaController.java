package Conta;

public class ContaController {

    private ContaBancaria[] contas = new ContaBancaria[10];
    private int total = 0;
    private ContaView view = new ContaView();

    public void iniciar() {
        int opcao;
        do {

            opcao = view.exibirMenu();
            switch (opcao) {
                case 1 -> criarConta();
                case 2 -> depositar();
                case 3 -> sacar();
                case 4 -> emitirExtrato();
                case 5 -> view.listarContas(contas, total);
                case 0 -> view.exibirMensagem("Encerrando...");
                default -> view.exibirMensagem("opção invalida");

            }

        } while (opcao != 0);
    }

    private void criarConta(){
        if(total == contas.length){
            view.exibirMensagem("limite de contas atingido");
            return;
        }

        int tipo = view.escolherTipoConta();
        String titular = view.lerTexto("titular");
        int agencia = view.lerInteiro("agencia");
        double saldoInicial = view.lerValor("saldo inicial: R$");
        int numeroConta = 1000 + total;

        switch (tipo) {
            case 1 ->{
                double limite = view.lerValor("limite do cheque especial: R$");
                contas[total] = new ContaCorrente(titular, agencia, numeroConta, saldoInicial, limite);
                }

            case 2  -> {
                double taxaJuros = view.lerValor("Taxa juros (ex.: 0.005 para 0.5%)");
                contas[total] = new ContaPoupanca(titular , agencia, numeroConta, saldoInicial, taxaJuros);
            }
            default ->{
                view.exibirMensagem("tipo de conta inválida ");
                return;
            }
                
        }
        total++;
        view.exibirMensagem("conta criada com sucesso numero:" + numeroConta);
    }

    private void depositar() {
        ContaBancaria conta = selecionarConta();
        if (conta == null) {
            return;
        }
        double valor = view.lerValor("valor para deposito");
        conta.depositar(valor);

    }

    private void sacar() {
        ContaBancaria conta = selecionarConta();
        if (conta == null) {
            return;
        }
        double valor = view.lerValor("valor para saque");
        conta.sacar(valor);
    }

    private void emitirExtrato() {
        ContaBancaria conta = selecionarConta();
        if (conta == null) {
            return;
        }
        conta.emitirExtrato();

    }

    private ContaBancaria selecionarConta() {
        if (total == 0) {
            view.exibirMensagem("Nenhuma conta cadastrada");
            return null;
        }

        int numeroConta = view.lerInteiro("numero da conta: ");
        for (int i = 0; i < total; i++) {
            if (contas[i].getNumeroConta() == numeroConta) {
                return contas[i];
            }
        }
        view.exibirMensagem("conta nao cadastrada");
        return null;
    }
}
