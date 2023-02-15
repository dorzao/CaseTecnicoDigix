
public class CriterioDepentendes {
	public CriterioDepentendes (Familia familia) {
		
		// Para implementar novos critério de pontuação por meio de dependentes
		familia.setPontuacao(familia.getPontuacao() + new PontuadorDependentes1().calcular(familia.getDependentes(), 3)) ;
		familia.setPontuacao(familia.getPontuacao() + new PontuadorDependentes2().calcular(familia.getDependentes(), 2)) ;
		
		// Saída para testes
		if (familia.getPontuacao() > 0) {
			System.out.println(" pontos no critério dependentes obteve a familia "+familia.getNis());
		}
	}
	
}
