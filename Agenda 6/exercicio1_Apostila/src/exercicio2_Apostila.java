import javax.swing.JOptionPane;

public class exercicio2_Apostila {
    public static void main(String[] args) {

        // Declaração de variável
        int opcao, submenu;

        // Entrada de dados com conversão de String para Inteiro
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada: " +
                "/n1 - Cadastrar usuário" +
                "/n2 - Alterar dados" +
                "/n3 - Excluir usuário"));

        // Processamento de dados + impressão de dados
        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Cadastrando o usuário");
                break;

            case 2:
                submenu = Integer.parseInt(JOptionPane.showInputDialog("Menu de alteração de dados" +
                        "/n1 - Alterar nome" +
                        "/n2 - Alterar endereço" +
                        "/n3 - Alterar telefone" +
                        "/n4 - Alterar RG"));
                // início do 2º switch
                switch (submenu) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Alterar nome");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Alterar endereço");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Alterar telefone");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Alterar RG");
                        break;
                } // fim do 2º switch
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }
}
