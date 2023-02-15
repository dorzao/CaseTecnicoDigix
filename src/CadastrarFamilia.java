import java.util.Scanner;

// Classe destinada a cadastrar alguns exemplos para teste
public class CadastrarFamilia {
	
	// divisória de organização
	public void divisoria() {
		System.out.println("===================================");
	}
	
	// Construtor de modelo de cadastro
	public CadastrarFamilia (Familia familia) {
		
		// Declaração dos scanners para coleta de dados no terminal
		Scanner numeros = new Scanner(System.in);
		Scanner palavras = new Scanner(System.in);
		this.divisoria();
		System.out.println("       Systema de cadastro");
		this.divisoria();
		System.out.print("\n Qual o nis da familia? ");
		familia.setNis(palavras.nextLine());
		System.out.print("\n Quantos membros na familia? ");
		familia.setMembros(numeros.nextInt());
		System.out.print("\n Dos "+familia.getMembros()+" membros da familia, quantos tem menos de 18? ");
		int dp = numeros.nextInt();
		if (dp < familia.getMembros()) {
			familia.setDependentes(dp);
		}
		System.out.print("\n Qual a renda total da familia por mês? R$ ");
		familia.setRenda(numeros.nextFloat());
		this.divisoria();
		System.out.println("Cadastro finalizado");
		this.divisoria();
		
	}
}
