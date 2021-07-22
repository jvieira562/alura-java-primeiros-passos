package exercicios;

public class TestaEscopo  {

	public static void main(String[] args) {
		System.out.println("Teste de condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 19 || acompanhado) {

			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Não pode entrar!");
		}

	}
}