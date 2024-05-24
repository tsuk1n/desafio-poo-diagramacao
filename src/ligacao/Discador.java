package ligacao;

public class Discador implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void ateder() {
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
