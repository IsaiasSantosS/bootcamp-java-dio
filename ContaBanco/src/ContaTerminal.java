import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;
        boolean contaAberta = false;

        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Digite o número da conta: ");
                numero = sc.nextInt();

                System.out.print("Digite o número da agência: ");
                agencia = sc.next();

                //Limpar o buffer do teclado
                sc.nextLine();

                System.out.print("Digite o nome do cliente: ");
                nomeCliente = sc.nextLine();

                System.out.print("Digite o valor do saldo da conta: ");
                saldo = sc.nextDouble();

                System.out.println(
                        "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                                +
                                ",conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

                System.out.print("Deseja abrir outra conta: [1] Sim e [2] Não ");
                contaAberta = sc.nextInt() == 1 ? false : true;

                //Limpar o buffer do teclado
                sc.nextLine();

            } catch (Exception e) {
                System.err.println("Algum valor informado incorretamente, tente novamente");
                //Limpar o buffer do teclado
                sc.nextLine();
            }
        } while (contaAberta == false);

    }
}
