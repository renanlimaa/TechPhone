package iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Je t'aime mon amour");
        meuIphone.tocar();
        meuIphone.volume(88);
        meuIphone.pausar();

        System.out.println("\n----------------------------\n");

        meuIphone.ligar("(85) 93284-5688");
        meuIphone.atender();
        meuIphone.iniciarCorreio();

        System.out.println("\n----------------------------\n");

        meuIphone.exibirPagina("https://github.com/renanlimaa");
        meuIphone.adicionarAba();
        meuIphone.atualizarPagina();
    }
}
