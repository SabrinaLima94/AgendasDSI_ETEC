
import java.util.Scanner;

public class atividadeApostila {

    public static void main(String[] args) {

        // Declaração de variáveis
        int numero1;
        int numero2;
        int soma;

        // Scanner
        Scanner leitor = new Scanner(System.in);

        // Apresentação do programa
        System.out.println("Programa soma - Este programa calculará a soma entre dois números.");

        // Entrada de dados
        System.out.println("Digite o PRIMEIRO valor: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o SEGUNDO valor: ");
        numero2 = leitor.nextInt();

        // Calculo
        soma = numero1 + numero2;

        System.out.println("O resultado da soma é: " + soma);

        leitor.close();

    }

}
