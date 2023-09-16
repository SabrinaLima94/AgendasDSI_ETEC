import javax.swing.JOptionPane;

public class exercicio1_Apostila {
    public static void main(String[] args) {

        // Declaração de variável
        int opcao;

        // Entrada de dados com conversão de String para Inteiro
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do produto: "));

        // Processamento de dados
        switch (opcao) {
            case 100:
                JOptionPane.showMessageDialog(null, "Lápis preto nº 2");
                break;

            case 150:
                JOptionPane.showMessageDialog(null, "Borracha branca");
                break;

            case 200:
                JOptionPane.showMessageDialog(null, "Caneta azul");
                break;

            case 230:
                JOptionPane.showMessageDialog(null, "Caneta vermelha");
                break;

            case 256:
                JOptionPane.showMessageDialog(null, "Giz de cera 12 und.");
                break;

            case 300:
                JOptionPane.showMessageDialog(null, "Cartolina branca");
                break;

            case 310:
                JOptionPane.showMessageDialog(null, "Resma de sulfite A4");
                break;

            case 400:
                JOptionPane.showMessageDialog(null, "Estojo escolar verde");
                break;

            case 470:
                JOptionPane.showMessageDialog(null, "Caderno universitário 100fls.");
                break;

            case 500:
                JOptionPane.showMessageDialog(null, "Caderno brochura 50 fls.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                break;
        }
    }
}
