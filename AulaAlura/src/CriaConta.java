public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.deposita(50);
        primeiraConta.sacar(100);
        System.out.println(primeiraConta.saldo);
        System.out.println("Deposito Realizado");
        Conta segundaConta = new Conta();
        segundaConta.deposita(1000);
        primeiraConta.transferir(100, segundaConta);
        System.out.println("Conta 1: "+primeiraConta.saldo );
        System.out.println("Conta 2: "+ segundaConta.saldo);


    }
}
