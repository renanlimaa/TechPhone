package iphone;

import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.ReprodutorMusical;
import iphone.interfaces.AjustarVolume;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical, AjustarVolume {

    private int volume = 50;

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreio() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void volume(int novoVolume) {
        if (novoVolume < 0) {
            volume = 0;
        } else if (novoVolume > 100) {
            volume = 100;
        } else {
            volume = novoVolume;
        }
        System.out.println("Volume ajustado para: " + volume);
    }
}
