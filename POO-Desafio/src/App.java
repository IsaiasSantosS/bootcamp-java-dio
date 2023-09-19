import contratos.Navegador;
import contratos.ReprodutorMidia;

public class App {
    public static void main(String[] args) throws Exception {
        ReprodutorMidia rm = new PlayerMusica();

        rm.tocar();
        rm.pausar();
        rm.selecionarMusica("Teste");

        Navegador navegador = new Edge("http://teste.com.br");
        navegador.adicionarNovaAba();
        navegador.exibirPagina();
        navegador.atualizarPagina();

    }
}
