public class SistemaInterno {
    private int senha = 2222;
    public void autentica (FauncionarioComSenha g) {
        boolean autenticou = g.autentica(this.senha);
        if (autenticou) {
            System.out.println("Sistema entrado com sucesso");
        } else {
            System.out.println("Senha incorreta");
        }
    }
}
