
public class Familia {

	//Atributos
	private int dependentes, pontuacao, membros;
	private float renda;
	private String nis;
	
	// Construtor
	public Familia(String nis, int membros, int dependentes, float renda) {
		this.dependentes = dependentes;
		this.renda = renda;
		this.nis = nis;
		this.membros = membros;
		if (nis == null || membros == 0) {
			new CadastrarFamilia(this);
		}
		
		
		// Critério 1 de pontuação (de acordo com o númeor de dependentes)
		new CriterioDependentes(this);
		
		// Critério2 de pontuação (de acordo com a renda)
		new CriterioRenda(this);
		
		// Saída para teste de soma das pontuações
		if (this.pontuacao > 0) {
			System.out.println("Ao todo "+this.getPontuacao()+" pontos");
		}
		
		// Chamando o "concret" de organização de acordo com a pontuação
		new Prioridade(this);
						
	}
	
	// getters e setters
	public int getDependentes() {
		return dependentes;
		
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}
	
}
