package bytebank;

public class CriarConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segunadaConta = new Conta();
		segunadaConta.saldo = 50;
		
		System.out.println("Primeira conta tem: " +primeiraConta.saldo);
		System.out.println("Segunda conta tem: " +segunadaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segunadaConta);

	}

}
