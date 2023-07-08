public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario henrique = new Funcionario();
        henrique.setNome("Henrique Erinaldo");
        henrique.setCpf("063.3434.3434-23");
        henrique.setSalario(2600.00);

        System.out.println(henrique.getNome());
        System.out.println(henrique.getBonificacao());

    }
}
