package ISP_SOLUCAO;

public interface ICadastroCliente {

    void cadastrarCliente(String nome, String email);

    String buscarClientePorEmail(String email);

}