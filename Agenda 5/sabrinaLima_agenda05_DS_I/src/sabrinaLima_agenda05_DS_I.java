import javax.swing.JOptionPane;

public class sabrinaLima_agenda05_DS_I {
    public static void main(String[] args) {

        // Declaração de variáveis
        int idade;

        // Apresentação do programa
        JOptionPane.showMessageDialog(null,
                "Este programa solicita a idade do usuário e o encaminha para a fila comum, prioritária ou 80+ com base em sua idade, seguindo as diretrizes do Estatuto do Idoso");

        // Entrada de dados com conversão de tipo
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do usuário a ser atendido: "));

        // Processamento/Decisão
        if (idade < 60) {
            JOptionPane.showMessageDialog(null, "Usuário deve ser encaminhado para a fila comum.");
        } else if (idade <= 80) {
            JOptionPane.showMessageDialog(null, "Usuário deve ser encaminhado para a fila prioritária.");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário deve ser encaminhado para a fila 80+.");
        } // Fim do if-else
    } // Fim do main
} // Fim da classe