import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nBem vindo ao nosso Banco!!");
		System.out.println("\nPor favor, digite o número de sua Agência !");
		String agencia = scanner.next();
		System.out.println("Por favor, digite o número de sua Conta !");
		int conta = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Por favor, digite o seu nome !");
		String cliente = scanner.next();
		System.out.println("Por favor, informe o seu saldo !");
		double saldo = scanner.nextFloat();

		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco," + " sua agência é "
				+ agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
		scanner.close();
	}
}
