public class Administrador extends FauncionarioComSenha{

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.9;
    }

}
