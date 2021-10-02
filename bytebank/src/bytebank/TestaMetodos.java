package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {

		Conta contaPaulo = new Conta();
		contaPaulo.depositar(100);
		System.out.println("Paulo, você tem " + contaPaulo.saldo + " reais em sua conta");
		contaPaulo.sacar(20);
		System.out.println("Paulo, você tem " + contaPaulo.saldo + " reais em sua conta");

		Conta contaAna = new Conta();
		System.out.println("Ana, você tem "+contaAna.saldo+" reais em sua conta");
		
		contaPaulo.transfere(50, contaAna);
		System.out.println("Paulo, você tem " + contaPaulo.saldo + " reais em sua conta");
		System.out.println("Ana, você tem "+contaAna.saldo+" reais em sua conta");
	}

}
