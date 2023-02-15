
public class PontuadorRenda1 implements InterfacePontuadorRenda {

	@Override
	public int calcular(float renda, int pontos) {
		if (renda <= 900f) {
			System.out.print(pontos);
			return pontos;
		}
		return 0;
	}

}
