// Estratégia concreta do critério 1 (renda)
public class CriterioRenda {
	public CriterioRenda (Familia familia) {
		familia.setPontuacao(familia.getPontuacao() + new PontuadorRenda1().calcular(familia.getRenda(), 5)); 
		familia.setPontuacao(familia.getPontuacao() + new PontuadorRenda2().calcular(familia.getRenda(), 3)); 
		
		// Saída para teste
		if (familia.getPontuacao() > 0) {
			System.out.println(" pontos no critério renda obteve a familia "+familia.getNis());
		}
	}
}
