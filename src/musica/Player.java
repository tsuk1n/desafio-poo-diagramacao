package musica;

public class Player implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo: " + musica);
    }

}
