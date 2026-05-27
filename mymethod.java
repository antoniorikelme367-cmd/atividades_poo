
public class ContaBancaria {

    // Atributos privados
    private String numeroConta;
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setter apenas para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Método para depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Erro: o valor do depósito deve ser maior que zero.");
        }
    }

    // Método para saque
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do saque deve ser maior que zero.");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    // Método principal para teste
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("12345-6", "Rikelme");

        conta.depositar(500);
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacar(200);
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacar(400); // erro saldo insuficiente
    }
}