package ISP_SOLUCAO;

public class ClienteComumService implements ICadastroCliente {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("COMUM: Cadastrando " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "COMUM: Encontrado cliente com email " + email;
    }

}