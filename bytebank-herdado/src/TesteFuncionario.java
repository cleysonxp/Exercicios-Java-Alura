
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente f1 = new Gerente();
		f1.setNome("Paulo");
		f1.setCpf("111.111.111-11");
		f1.setSalario(2590.80);

		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());

	}

}
