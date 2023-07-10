public class Administrador extends Funcionario implements SenhaDoSistema{
    private int senha;
    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.9;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;

    }
}
