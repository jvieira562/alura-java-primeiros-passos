package exercicios;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Teste de condicionais");

		int idade = 18;
		int quantidadePessoas = 2;

		if (idade >= 18) {

			System.out.println("Maior idade \n");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Menor idade, mas pode entrar, " + "pois está acompanhado(a)");
			} else {

				System.out.println("Infelizmente voce nao pode entrar!");
			}

		}
	}
}