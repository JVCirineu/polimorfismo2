package exercicio2;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada(1, "David", "(15)99889-0990", 1, "Rua dos Bobos");
		System.out.println(jornada.calculaSalario(100, 10));
				
		Horista horista = new Horista(2, "Luiz", "(15)99889-0990", 2, "Rua dos Bobos");
		System.out.println(horista.calculaSalario(150, 10));
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica(3, "Julia", "(15)99889-0990", 3, "Rua dos Bobos");
		System.out.println(pessoaJuridica.calculaSalario(5000, 1000));
	}
}
