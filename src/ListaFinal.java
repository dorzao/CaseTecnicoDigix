import java.util.ArrayList;
// Classe para imprimir o resultado da(s) lista(s) gerada(a) de acordo com a prioridade
public class ListaFinal {
	public void individual(ArrayList<Familia> lista) {
	
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("===============");
			System.out.println((i+1)+"º lugar");
			System.out.println("===============");
			System.out.println("Nis: "+lista.get(i).getNis());
			System.out.println("Pontuação: "+lista.get(i).getPontuacao());
			System.out.println("Dependentes: "+lista.get(i).getDependentes());
			System.out.println("Renda: R$ "+lista.get(i).getRenda());
			System.out.println("===============\n\n");
			
		}
		
	
	}
	
	public void geral() {
		System.out.println("========================================");
		System.out.println("     Lista final de "+Prioridade.p[0].prioridade.size()+" participantes");
		System.out.println("========================================");
		this.individual(Prioridade.p[0].prioridade);
				
	}
}
