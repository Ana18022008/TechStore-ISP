package ISP_SOLUCAO;

public class Main {

    public static void main(String[] args) {

        // Cliente comum
        ClienteComumService clienteComum = new ClienteComumService();

        clienteComum.cadastrarCliente("Ana", "ana@email.com");
        System.out.println(clienteComum.buscarClientePorEmail("ana@email.com"));


        System.out.println("-------------------");


        // Cliente VIP
        ClienteVIPService clienteVIP = new ClienteVIPService();

        clienteVIP.cadastrarCliente("Carlos", "carlos@email.com");
        System.out.println(clienteVIP.buscarClientePorEmail("carlos@email.com"));
        clienteVIP.enviarNotificacao("carlos@email.com", "Promoção exclusiva!");
        clienteVIP.aplicarDescontoVIP("carlos@email.com", 20);

    }

}