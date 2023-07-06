public class Main {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("065.566.564-34");
        paulo.setProfissao("Analista");

        Conta contaDoPaulo = new Conta(132, 123432);
        contaDoPaulo.deposita(1000);
        contaDoPaulo.setTitular(paulo);

        System.out.println("Titular da Conta: "+ contaDoPaulo.getTitular().getNome());
        System.out.println("CPF: "+ contaDoPaulo.getTitular().getCpf());
        System.out.println("Profissão: "+ contaDoPaulo.getTitular().getProfissao());
        System.out.println("Agencia: "+ contaDoPaulo.getAgencia());
        System.out.println("Número da Conta: "+ contaDoPaulo.getNumero());
        System.out.println("Saldo da Conta: "+contaDoPaulo.getSaldo());
    }
}