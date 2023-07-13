package Q7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ContaCorrente {
    private int numero;
    private double saldo;
    private List<Movimentacao> movimentacoes;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.movimentacoes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void adicionarMovimentacao(Movimentacao movimentacao) {
        movimentacoes.add(movimentacao);
    }

    // Outros métodos da conta corrente, como saque, depósito, emissão de saldo, etc.
}

class Movimentacao {
    private String descricao;
    private double valor;
    private boolean credito;

    public Movimentacao(String descricao, double valor, boolean credito) {
        this.descricao = descricao;
        this.valor = valor;
        this.credito = credito;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isCredito() {
        return credito;
    }
}

class Banco {
    private List<ContaCorrente> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public List<ContaCorrente> getContas() {
        return contas;
    }

    public void criarConta(int numero, double saldo) {
        ContaCorrente conta = new ContaCorrente(numero, saldo);
        contas.add(conta);
    }

    public void excluirConta(ContaCorrente conta) {
        contas.remove(conta);
    }

    public void realizarSaque(ContaCorrente conta, double valor) {
        if (valor <= conta.getSaldo()) {
            conta.adicionarMovimentacao(new Movimentacao("Saque", valor, false));
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void realizarDeposito(ContaCorrente conta, double valor) {
        conta.adicionarMovimentacao(new Movimentacao("Depósito", valor, true));
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso.");
    }

    public void emitirSaldo(ContaCorrente conta) {
        System.out.println("Saldo da conta " + conta.getNumero() + ": " + conta.getSaldo());
    }

    public void emitirExtrato(ContaCorrente conta) {
        System.out.println("Extrato da conta " + conta.getNumero() + ":");
        for (Movimentacao movimentacao : conta.getMovimentacoes()) {
            String tipoMovimentacao = movimentacao.isCredito() ? "Crédito" : "Débito";
            System.out.println(movimentacao.getDescricao() + " - " + tipoMovimentacao + ": " + movimentacao.getValor());
        }
    }

    public void realizarTransferencia(ContaCorrente contaOrigem, ContaCorrente contaDestino, double valor) {
        if (valor <= contaOrigem.getSaldo()) {
            contaOrigem.adicionarMovimentacao(new Movimentacao("Transferência enviada para conta " + contaDestino.getNumero(), valor, false));
            contaDestino.adicionarMovimentacao(new Movimentacao("Transferência recebida da conta " + contaOrigem.getNumero(), valor, true));
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
}

public class Bank {
    static Scanner scan = new Scanner(System.in);
    boolean quit = false;
    public void bank() {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número da conta:");
                    int numeroConta = scanner.nextInt();
                    System.out.println("Digite o saldo inicial da conta:");
                    double saldoInicial = scanner.nextDouble();
                    banco.criarConta(numeroConta, saldoInicial);
                    System.out.println("Conta criada com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o número da conta que deseja excluir:");
                    int numeroContaExcluir = scanner.nextInt();
                    ContaCorrente contaExcluir = encontrarConta(banco, numeroContaExcluir);
                    if (contaExcluir != null) {
                        banco.excluirConta(contaExcluir);
                        System.out.println("Conta excluída com sucesso.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da conta:");
                    int numeroContaSaque = scanner.nextInt();
                    ContaCorrente contaSaque = encontrarConta(banco, numeroContaSaque);
                    if (contaSaque != null) {
                        System.out.println("Digite o valor do saque:");
                        double valorSaque = scanner.nextDouble();
                        banco.realizarSaque(contaSaque, valorSaque);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da conta:");
                    int numeroContaDeposito = scanner.nextInt();
                    ContaCorrente contaDeposito = encontrarConta(banco, numeroContaDeposito);
                    if (contaDeposito != null) {
                        System.out.println("Digite o valor do depósito:");
                        double valorDeposito = scanner.nextDouble();
                        banco.realizarDeposito(contaDeposito, valorDeposito);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 5:
                    System.out.println("Digite o número da conta:");
                    int numeroContaSaldo = scanner.nextInt();
                    ContaCorrente contaSaldo = encontrarConta(banco, numeroContaSaldo);
                    if (contaSaldo != null) {
                        banco.emitirSaldo(contaSaldo);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 6:
                    System.out.println("Digite o número da conta:");
                    int numeroContaExtrato = scanner.nextInt();
                    ContaCorrente contaExtrato = encontrarConta(banco, numeroContaExtrato);
                    if (contaExtrato != null) {
                        banco.emitirExtrato(contaExtrato);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 7:
                    System.out.println("Digite o número da conta de origem:");
                    int numeroContaOrigem = scanner.nextInt();
                    ContaCorrente contaOrigem = encontrarConta(banco, numeroContaOrigem);
                    if (contaOrigem != null) {
                        System.out.println("Digite o número da conta de destino:");
                        int numeroContaDestino = scanner.nextInt();
                        ContaCorrente contaDestino = encontrarConta(banco, numeroContaDestino);
                        if (contaDestino != null) {
                            System.out.println("Digite o valor da transferência:");
                            double valorTransferencia = scanner.nextDouble();
                            banco.realizarTransferencia(contaOrigem, contaDestino, valorTransferencia);
                        } else {
                            System.out.println("Conta de destino não encontrada.");
                        }
                    } else {
                        System.out.println("Conta de origem não encontrada.");
                    }
                    break;
                case 8: quit = true;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }



            System.out.print("\nAperter 'Enter' para continuar: ");
            scan.nextLine();
            if ( quit ) break;
        }

    }

    private static void exibirMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Criar conta");
        System.out.println("2. Excluir conta");
        System.out.println("3. Realizar saque");
        System.out.println("4. Realizar depósito");
        System.out.println("5. Emitir saldo");
        System.out.println("6. Emitir extrato");
        System.out.println("7. Realizar transferência");
        System.out.println("8. Sair");
        System.out.println("Digite a opção desejada:");
    }

    private static ContaCorrente encontrarConta(Banco banco, int numeroConta) {
        for (ContaCorrente conta : banco.getContas()) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
