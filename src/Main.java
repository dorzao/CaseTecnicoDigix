// Classe destinada a testes
public class Main {

	public static void main(String[] args) {
		
		// testando 2 familias de cada tipo / prioridade
		new Familia("22233344455", 6, 4, 850f);
		new Familia("22233344545", 6, 5, 890f);
		new Familia("99988877766", 3, 1, 870f);
		new Familia("99985877646", 5, 2, 870f);
		new Familia("98788877766", 5, 4, 901f);
		new Familia("98788877766", 6, 5, 1499f);
		new Familia("98782267766", 6, 1, 1498f);
		new Familia("98782255266", 3, 1, 1238f);
		new Familia("98782247766", 2, 0, 901f);
		new Familia("98782237766", 6, 5, 1501f);
		new Familia("98782276766", 2, 1, 1502f);
		new Familia("98782277666", 3, 1, 1503f);
		new Familia("98782277699", 3, 0, 1504f);
		new Familia("98782277688", 3, 0, 1505f);
		
		// Cadastrando duas familia manualmente
		new Familia(null, 6, 5, 890f);
		new Familia("99999999988", 0, 5, 890f);
		
		// Saída da lista final de teste
		new ListaFinal().geral();
				
	}

}
