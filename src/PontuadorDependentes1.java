// Strategy context do critério 2.1
public class PontuadorDependentes1 implements InterfacePontuadorDependentes {
	
	// polimorfismo de sobreposição
	@Override
	public int calcular(int dependentes, int pontos) {
		if (dependentes >= 3) {
			System.out.print(pontos);
			return pontos;
		}
		return 0;
	}

	

}
