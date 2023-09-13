
import java.util.Scanner;

public class SPCar {

    public static void main(String[] args) {

        // Declaração das variáveis
        String modeloCarro;
        double valorDiaria;
        int quantidadeDias;
        double quantidadeKm;
        double valorTotal;

        Scanner sc = new Scanner(System.in);

        // Apresentação do programa
        System.out.println("Este programa irá calcular o preço total a pagar no serviço de locação de veículo da loja SPCar");

        // Entrada de dados
        System.out.println("Digite o modelo do carro alugado: ");
        modeloCarro = sc.next();

        System.out.println("Digite o valor da diária para locação (em R$): ");
        valorDiaria = sc.nextDouble();

        System.out.println("Digite a quantidade de dias de locação: ");
        quantidadeDias = sc.nextInt();

        System.out.println("Digite a quantidade de quilômetros percorridos: ");
        quantidadeKm = sc.nextDouble();

        // Cálculo 
        valorTotal = valorDiaria * quantidadeDias + 0.20 * quantidadeKm;

        // Saída de dados
        System.out.println("Modelo do carro: " + modeloCarro);
        System.out.println("Valor total a pagar: R$ " + valorTotal);
    }
}
