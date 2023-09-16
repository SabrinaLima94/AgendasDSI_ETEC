/*código desenvolvido para atividade da agenda 6 da matéria de desenvolvimento de sistemas I
aluna: Sabrina de Fontes Carneiro de Lima - turma CUB*/

import javax.swing.JOptionPane;

public class sabrinaLima_Ag6_DS_I {

    public static void main(String[] args) {

        // declaração de variáveis
        int finalPlaca = 0;

        // apresentação do programa ao usuáriosd
        JOptionPane.showMessageDialog(null, "Este programa informa aos clientes do"
                + " escritório de Despachante Vale Card, o mês de vencimento do IPVA de seus veículos");

        /*
         * entrada de dados e conversão da variável para int
         * utilizado tratamento de dados com try-catch conforme aprendido em
         * "ampliando horizontes" da agenda 6
         */
        try {
            finalPlaca = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final da placa do veículo: "));

            // processamento e saída de dados
            switch (finalPlaca) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Pagamento até 30/04");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/05");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Pagamento até 30/06");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/07");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/08");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Pagamento até 30/09");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/10");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Pagamento até 30/11");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/12");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/12");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "O valor informado está incorreto. "
                            + "Insira o número final da Placa (de 0 a 9).",
                            "Alerta", JOptionPane.WARNING_MESSAGE);
                    break;
            } // fim do switch
        } // fim do try
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entre somente com um número inteiro (de 0 a 9).",
                    "E R R O", JOptionPane.ERROR_MESSAGE);
        } // fim do catch
    }// fim do main
}// fim da class
