package internet;

public class Safari implements NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("Acessando: " + url);
    }

    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}
