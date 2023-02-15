
public class PontuadorRenda2 implements InterfacePontuadorRenda {

	@Override
	public int calcular(float renda, int pontos) {
		if (renda > 900f && renda < 1500f) {
			System.out.print(pontos);
			return pontos;
		}
		
		return 0;
	}

}
