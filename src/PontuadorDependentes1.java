
public class PontuadorDependentes1 implements InterfacePontuadorDependentes {

	@Override
	public int calcular(int dependentes, int pontos) {
		if (dependentes >= 3) {
			System.out.print(pontos);
			return pontos;
		}
		return 0;
	}

	

}
