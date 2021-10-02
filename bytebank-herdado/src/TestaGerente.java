
public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Anna");
		g1.setCpf("222.222.222-22");
		g1.setSalario(5000.00);
		g1.setSenha(2222);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(2222));

	}

}
