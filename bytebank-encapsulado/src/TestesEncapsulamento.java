
public class TestesEncapsulamento {

	public static void main(String[] args) {

		Conta conta = new Conta(123,456);
		Cliente paulo = new Cliente();
		
		Conta conta2 = new Conta(123,-457);
		Cliente ana = new Cliente();
		
//		Conta paulo
		paulo.setNome("paulo");
		paulo.setCpf("222.222.222-22");
		paulo.setProfissao("cozinheiro");
		
		System.out.println(paulo.getNome());
		System.out.println(paulo.getCpf());
		System.out.println(paulo.getProfissao());
		
		conta.setTitular(paulo);
		
		
		conta.depositar(200);		
		System.out.println(conta.getSaldo());
		
		conta.sacar(80);
		System.out.println(conta.getSaldo());
		
		System.out.println();
		
//		Conta Ana
		ana.setNome("ana");
		ana.setCpf("333.333.333-22");
		ana.setProfissao("professora");
		
		System.out.println(ana.getNome());
		System.out.println(ana.getCpf());
		System.out.println(ana.getProfissao());
		
		
		conta2.setTitular(ana);
		
		
		conta2.depositar(1000);		
		System.out.println(conta2.getSaldo());
		
		conta2.sacar(200);
		System.out.println(conta2.getSaldo());
		
		conta2.transfere(400, conta);
		System.out.println(conta2.getSaldo());
		
		System.out.println();
		System.out.println("Paulo tem " +conta.getSaldo());
		
		System.out.println(Conta.getTotal());
	}

}
