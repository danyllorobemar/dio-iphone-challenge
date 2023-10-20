package entities;

public class IPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet{
	
	@Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
    	System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica() {
    	System.out.println("Selecionando música...");
    }

    @Override
    public void ligar() {
    	System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
    	System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
    	System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
    	System.out.println("Exibindo página na internet...");
    }

    @Override
    public void adicionarNovaAba() {
    	System.out.println("Adicionando nova aba no navagador...");
    }

    @Override
    public void atualizarPagina() {
    	System.out.println("Atualizando página no navegador...");
    }
}
