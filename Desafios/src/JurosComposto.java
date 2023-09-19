import java.util.Scanner;
import java.text.DecimalFormat;

public class JurosComposto {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for (int i = 0; i < periodo; i++) {
            valorFinal = valorFinal * (1 + taxaJuros);
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }   
}
