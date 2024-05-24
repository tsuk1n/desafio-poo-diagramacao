package celular;

import internet.NavegadorInternet;
import internet.Safari;
import ligacao.AparelhoTelefonico;
import ligacao.Discador;
import musica.Player;
import musica.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        NavegadorInternet navegador = new Safari();
        AparelhoTelefonico discador = new Discador();
        ReprodutorMusical player = new Player();

        navegador.abrirNovaAba();
        navegador.exibirPagina("www.google.com");
        navegador.atualizarPagina();

        System.out.println();

        discador.ligar("9987452136");
        discador.ateder();
        discador.iniciarCorreioVoz();

        System.out.println();

        player.selecionarMusica("Smooth Criminal");
        player.tocar();
        player.pausar();
    }
}
