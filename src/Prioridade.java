import java.util.ArrayList;
public class Prioridade {
	
	// Para fácil implementação de pontuações
	static int[] pontuacoes = {8, 7, 6, 5, 3, 2, 0};
	
	// Vetor de Prioridades
	public static Prioridade[] p = new Prioridade[pontuacoes.length];
	
	// Lista para cada prioridade
	public static ArrayList<Familia> prioridade = new ArrayList<Familia>();
	
	public Prioridade (Familia familia) {
		
		// um for básico para organizar as prioridades
		for (int i = 0; i < pontuacoes.length; i++) {
			if (familia.getPontuacao() == pontuacoes[i]) {
				this.p[i].prioridade.add(familia);
				
				// Saída de teste
				System.out.println("A família "+familia.getNis()+" foi inserida no grupo Prioridade "+(i + 1));
			}
			
		}
		
		
	}
		
}
