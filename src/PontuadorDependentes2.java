// Strategy context do critério 2.2
public class PontuadorDependentes2 implements InterfacePontuadorDependentes{
	
	// Sobreposição aqui também
	@Override
	public int calcular(int dependentes, int pontos) {
		if (dependentes < 3 && dependentes > 0) {
			System.out.print(pontos);
			return pontos;
		}
		return 0;
	}

}
