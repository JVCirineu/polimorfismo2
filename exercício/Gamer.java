package exercício;

public class Gamer implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("O jogo está ligado.");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("O jogo está reiniciando.");
	}
	
	@Override
	public void desligar() {
		System.out.println("O jogo está desligando.");
	}
	
	@Override
	public void carregandoSis() {
		System.out.println("O jogo está carregando.");
	}
}
