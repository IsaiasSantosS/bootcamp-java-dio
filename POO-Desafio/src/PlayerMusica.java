import java.util.ArrayList;

import contratos.ReprodutorMidia;

public class PlayerMusica implements ReprodutorMidia{

    ArrayList<String> musicas = new ArrayList<>();

    @Override
    public void tocar() {
        System.out.println("Em reprodução...");
    }

    @Override
    public void pausar() {
        System.out.println("Em pausa.");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Play na música " + nomeMusica);
    }
    
}
