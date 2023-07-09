public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario henrique = new Funcionario();
        henrique.setNome("Henrique Erinaldo");
        henrique.setCpf("063.3434.3434-23");
        henrique.setSalario(2600.00);

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        ControleBonif controle = new ControleBonif();
        controle.registra(g1);
        controle.registra(henrique);

        System.out.println(henrique.getNome());
        System.out.println(henrique.getBonificacao());

        System.out.println(controle.getSoma());

    }
}
