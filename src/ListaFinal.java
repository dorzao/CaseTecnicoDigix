import java.util.ArrayList;

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
		this.individual(Prioridade.p[0].prioridade);
		System.out.println(Prioridade.p[0].prioridade.size()+"\n\n\n\n\n\n\n\n");
		/*System.out.println("===============");
		System.out.println("   Prioridade "+1);
		System.out.println("===============");
		for (int c = 0; c < Prioridade.pontuacoes.length -1; c++) {
			
		}
			
		System.out.println("===============");
		System.out.println("======FIM======"); */
		
	}
}
