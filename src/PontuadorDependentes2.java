
public class PontuadorDependentes2 implements InterfacePontuadorDependentes{

	@Override
	public int calcular(int dependentes, int pontos) {
		if (dependentes < 3 && dependentes > 0) {
			System.out.print(pontos);
			return pontos;
		}
		return 0;
	}

}
