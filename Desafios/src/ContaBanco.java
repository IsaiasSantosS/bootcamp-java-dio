import java.util.Scanner;

public class ContaBanco {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    ContaBancaria contaBancaria = new ContaBancaria();
    contaBancaria.Bancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    System.out.println("Conta: " + contaBancaria.numero);
    System.out.println("Titular: " + contaBancaria.titular);
    System.out.format("Saldo: R$ %.1f", contaBancaria.saldo);
    System.out.println();
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public void Bancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}
