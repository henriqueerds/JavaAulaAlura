public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta (int agencia, int numero) {
        if (agencia <= 0 & numero <= 0) {
            System.out.println("Não pode valor negativo para agência");
            return;
        }
        this.agencia = agencia;
        this.numero = numero;
    }
    public void deposita(double valor) {
        this.saldo += valor;
    }
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >=valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo () {
        return this.saldo;
    }
    public int getNumero () {
        return this.numero;
    }
    public int getAgencia () {
        return this.agencia;
    }
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular (Cliente titular) {
        this.titular = titular;
    }

}
