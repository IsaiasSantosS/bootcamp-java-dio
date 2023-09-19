import contratos.Navegador;

public class Edge implements Navegador{

    String url;


    public Edge(String url) {
        this.url = url;
    }

    @Override
    public void exibirPagina() {
        System.out.println("Carregando página..." + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página..." + url);
    }
    
}
