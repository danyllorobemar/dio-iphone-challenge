package application;

import entities.IPhone;

public class Program {
	
	public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
