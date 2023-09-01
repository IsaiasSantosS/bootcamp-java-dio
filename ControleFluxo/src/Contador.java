import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean continuar = false;

        do {
            try {

                System.out.println("Digite o primeiro valor");
                int valorInicial = sc.nextInt();

                System.out.println("Digite o segundo valor");
                int valorFinal = sc.nextInt();


                //chamando o método contendo a lógica de contagem
                contar(valorInicial, valorFinal);
            
            } catch (InputMismatchException exception) {
                System.err.println("Valor informado é inválido");
            } catch (ParametrosInvalidosException exception) {
                System.err.println(" O segundo parâmetro deve ser maior que o primeiro");
            } finally {
                sc.nextLine(); //limpar buffer teclado
                try{
                    System.out.print("Deseja executar novamente: [1] Sim e [2] Não ");
                    continuar = sc.nextInt() == 1 ? true : false;
                } catch (InputMismatchException exception) {
                   sc.nextLine();
                    System.out.println("Tente novamente o processo.");
                    System.out.println("----------------------------");
                    continuar = true;
                }
                
            }

        } while (continuar);
		
		
	}

    static void contar(int valorInicial, int valorFinal) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (valorInicial > valorFinal) {
            throw new ParametrosInvalidosException();
        }

        int contagem = valorFinal - valorInicial;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }

}
