## Agenda 6 - Desenvolvimento de Sistemas

##### Switch-case

- Se tivéssemos uma decisão a ser tomada entre **muitas opções**, o uso de apenas if-else em uma Estrutura de Decisão Aninhada seria uma forma muito confusa. Neste caso, temos uma opção mais adequada chamada de `Switch-case`(_do pseudocódigo: `selecione...caso...senão...fim_selecione"`_);
- A principal função dessa estrutura é **facilitar a escrita do algoritmo** quando se tem muitos caminhos a seguir a partir de uma decisão;
- Essa estrutura permite que seja feita uma seleção correta a partir da comparação entre o valor do conteúdo da variável e uma lista definida durante a programação;
- O comando `switch` **compara o valor armazenado na variável** em cada comando `case`;
- O comando `break`tem a finalidade de **parar a execução do comando `switch`**, uma vez que já foi executada a ação necessário (comparação verdadeira) e não há a necessidade de se continuar;

_Exemplo de aplicação:_

```
import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        // Variáveis
        int exemplo;
        
        // Entrada e conversão de dados
        exemplo = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
        
        // Processamento de dados
        switch (exemplo) {
            case 1:
                JOptionPane.showMessageDialog(null, "Você digitou 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você digitou 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você digitou 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Você digitou 4");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido!");
                break;
        } // Fim do switch-case
    } // Fim do método main
} // Fim da classe
```
***Importante deixar claro que a estrutura `switch-case` a variável de verificação pode ser somente dos tipos int ou char***

##### Try-Catch
- Quando o usuário insere algo errado no sistema, como, por exemplo, inserir caractere no lugar de número, se não tivermos o **tratamento de erro**, do ponto de vista do usuário, o programa simplesmente fecha. Do ponto de vista do desenvolvedor, uma mensagem de erro é gerada pela IDE;
- Para evitar que o usuário fique sem entender o que ocorreu, no Java existem várias técnicas e rotinas de tratamento de erros. Nesta agenda veremos o `Try-Catch`;
- O `Try-Catch` consiste em capturar erros na conversão de tipos de entrada de dados para os nossos programas, sendo sua sintaxe:

```
try{
    comando(s);
    } catch (NumberFormatException e) {
        comando(s);
        }
```

_Exemplo:_

```
import javax.swing.JOptionPane;
 
public class TryCatch{

   public static void main(String[] args){
      //declaração de variáveis
      int numero = 0;
      String aux;
 
      //entrada de dados
      try{
         aux = JOptionPane.showInputDialog("Entre com um número inteiro");
         numero = Integer.parseInt(aux);
         JOptionPane.showMessageDialog(null, "O número inserido foi "+ numero);
      } catch (NumberFormatException e){
         JOptionPane.showMessageDialog(null, "Entre somente com um número inteiro", 
            "E R R O", JOptionPane.ERROR_MESSAGE);
      }//fim do try-catch
   }//fim do método main
}//fim da classe
```
_Neste caso o comando `try` tenta executar os comandos que estão dentro das chaves `{}`, caso ele não consiga, ele executa a cláusula `catch (NumberFormatException e)` e os comandos dentro das chaves `{}`_

##### Caixa de diálogo (JOptionPane)

- A caixa de diálogo pode ser formatada de acordo com sua necessidade;
- O comando `"Alerta", JOptionPane.WARNING_MESSAGE);` inclui a formatação do título da janela ("Alerta"), e a parte `JOptionPane.WARNING_MESSAGE` altera o ícone para um alerta com ponto de exclamação, indicando aviso;
- O comando `  ,”E R R O”, JOptionPane.ERROR_MESSAGE);` no exemplo anterior inclui a formatação com uma parte em **vermelho** ("E R R O") como título da janela, e a parte `JOptionPane.ERROR_MESSAGE` altera o ícone para uma cruz vermelha, indicando erro;

###### Exercícios de fixação

[Atividade 1 - apostila](https://github.com/SabrinaLima94/AgendasDSI_ETEC/blob/main/Agenda%206/exercicio1_Apostila/src/exercicio1_Apostila.java) 

[Atividade 2 - apostila](https://github.com/SabrinaLima94/AgendasDSI_ETEC/blob/main/Agenda%206/exercicio1_Apostila/src/exercicio2_Apostila.java) 

[Atividade 3 - apostila](https://github.com/SabrinaLima94/AgendasDSI_ETEC/blob/main/Agenda%206/exercicio1_Apostila/src/exercicio3_Apostila.java) 

[Atividade Fichário](https://github.com/SabrinaLima94/AgendasDSI_ETEC/blob/main/Agenda%206/sabrinaLima_Ag6_DS_I/src/sabrinaLima_Ag6_DS_I.java)

[Fluxograma](https://github.com/SabrinaLima94/AgendasDSI_ETEC/blob/main/Agenda%206/fluxograma_agenda6_DS_I.jpg) 