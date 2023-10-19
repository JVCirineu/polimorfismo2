package exercício;

public class Home implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("\nO computador está ligando.");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("O computador está reiniciando.");
	}
	
	@Override
	public void desligar() {
		System.out.println("O computador está desligando.");
	}
	
	@Override
	public void carregandoSis() {
		System.out.println("O computador está carregando.");
	}
}
