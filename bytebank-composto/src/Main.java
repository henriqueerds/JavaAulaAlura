public class Main {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222-222-222-22";
        paulo.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(1000);
        contaDoPaulo.setNumero(123432);

        contaDoPaulo.titular = paulo;

        System.out.println("Titular da Conta: "+ contaDoPaulo.titular.nome);
        System.out.println("Número da Conta: "+ contaDoPaulo.getNumero());
        System.out.println("Saldo da Conta: "+contaDoPaulo.getSaldo());

    }
}