// Strategy context do critério 1.1
public class PontuadorRenda1 implements InterfacePontuadorRenda {
	
	// Sobreposição do método abstrato da interface
	@Override
	public int calcular(float renda, int pontos) {
		if (renda <= 900f) {
			System.out.print(pontos);
			return pontos;
		}
		return 0;
	}

}
