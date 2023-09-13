## Agenda 5 - Desenvolvimento de Sistemas.

##### Estrutura de decisão

- As estruturas de decisão nos permitem executar um conjunto diferente de comandos dependendo do resultado de um teste utilizando operadores relacionais;

<div align="center">

<img src="img/estrutura decisao.png">

</div>

_Exemplo: Um programa que saiba identificar se a pessoa tem mais que 18 anos (maior de idade)_
```
import java.util.Scanner; 
public class IfSimples {  
    public static void main(String[] args) { 
        //Declaraçao de variáveis 
        int idade; 
        
        //Armazena a idade 
        Scanner leitor = new Scanner(System.in);  
        
        //Entrada de dados 
        System.out.println("Entre com a sua idade"); 
        idade = leitor.nextInt(); 
        
        //Decisão 
        if (idade >=18) { System.out.println("Maior de Idade"); 
        }//fim do if 
    }//fim do main  
    
}//fim da classe 
```
_Explicando:_
O comando de decisão `if (idade >= 18)` executa o que estiver dentro das chaves `{}`, se o valor da variável idade for menor que 18 o programa não executará nenhum comando adicional e será encerrado.

##### If/else

- Em Java utilizamos o comando if-else para que uma ação seja tomada caso o teste condicional seja verdadeiro ou falso;

<div align="center">

<img src="img/estrutura decisao if-else.png">

</div>

- Caso o teste lógico condicional resulte em falso, temos o comando ou grupo de comandos a serem executados (else);

Se alterarmos o exemplo anterior para que retorne um valor caso a idade da pessoa seja menor que 18, teremos:

```
import java.util.Scanner; 
public class IfSimples {  
    public static void main(String[] args) { 
        //Declaraçao de variáveis 
        int idade; 
        
        //Armazena a idade 
        Scanner leitor = new Scanner(System.in);  
        
        //Entrada de dados 
        System.out.println("Entre com a sua idade"); 
        idade = leitor.nextInt(); 
        
        //Decisão 
        if (idade >=18) { 
        //comandos se a condição for verdadeira
        System.out.println("Maior de Idade"); 
        } else {
        //comandos se a condição for falsa
         System.out.println("Menor de Idade"); 
        }//fim do if-else
    }//fim do main  
    
}//fim da classe 
```

##### Estruturas de Decisão Aninhadas

- As vezes necessitamos de uma saída de dados com mais de duas alternativas. Neste caso usamos as estruturas de decisão aninhadas, que consistem em utilizar um comando `SE` **encadeado** no inteior de outro.

_Retornando ao exemplo anterior, digamos que também precise verificar se a idade é IGUAL a 18 anos. Neste caso, ao executar a tomada de decisão `if (idade >= 18)`, em caso verdadeiro devemos vericar se **idade = 18**. Então, o resultado da nossa programação seria:

```
import java.util.Scanner; 
public class IfSimples {  
    public static void main(String[] args) { 
        //Declaraçao de variáveis 
        int idade; 
        
        //Armazena a idade 
        Scanner leitor = new Scanner(System.in);  
        
        //Entrada de dados 
        System.out.println("Entre com a sua idade"); 
        idade = leitor.nextInt(); 
        
        //Decisão 
        if (idade >=18) { //primeiro if 
        //comandos se a condição for verdadeira
            if (idade == 18) { //segundo if
            System.out.println("Igual a 18");
            } else {
            System.out.println("Maior de 18");
            } // fim do segundo if
        } else {
        //comandos se a condição for falsa
         System.out.println("Menor de Idade"); 
        }//fim do primeiro if
    }//fim do main 
    
}//fim da classe 
```

##### JOptionPane (Entrada de dados)
- Devemos sempre tentar desenvolver uma interface com o usuário que seja simples de ser utilizada. Contudo, essa interface deve ser visualmente agradável ao usuário final;
- Para realizarmos a entrada de dados para um programa, de forma mais elegante que o console, podemos utilizar o comando `JOptionPane` do Java, sendo sua sintaxe: `JOptionPane.showInputDialog(mensagem);`, onde:

`JOptionPane`--> biblioteca responsável pela interação com o SO (Sistema Operacional);
`showInputDialog`--> indica que o comando a ser utilizado será uma entrada de dados do sistema;
`(mensagem)`--> mensagem a ser exibida para o usuário;

_Um exemplo de aplicação para este comando:_
```
import javax.swing.JOptionPane;

public class JoptionPane { 
    public static void main(String args[]) {

    //Declaração de variáveis
    String entrada; 

    //Entrada
    entrada = JOptionPane.showInputdialog(“Entre com um nome”);
    } // fim do main
    
} // fim da classe
```

- Neste exemplo é declarada a variável `entrada` do tipo String que armazenará o conteúdo inserido pelo usuário;
- A variável `entrada` recebe o conteúdo do comando `JOptionPane.showInputdialog("Entre com um nome");`

##### JOptionPane (Saída de dados)
- Para realizarmos a saída de dados de um programa também com o comando `JOptionPane`, seguimos com a sintaxe: `JOptionPane.showMessageDialog(null, mensagem);`, onde:

`JOptionPane`--> biblioteca responsável pela interação com o SO (Sistema Operacional);
`showMessageDialog`--> indica que o comando a ser utilizado será uma saída de dados do sistema;
`(mensagem)`--> mensagem a ser exibida para o usuário;

_O **null** entra como valor de primeiro argumento, pois, por enquanto, não há dependência de outras janelas em nosso programa_

_Um exemplo de aplicação para este comando:_
```
import javax.swing.JOptionPane;

public class JoptionPane { 
    public static void main(String args[]) {
    JOptionPane.showMessageDialog(null,"Saída de dados");    
    } // fim do main
    
} // fim da classe
```

##### Conversão de tipos

- O comando `JOptionPane.showInputdialog`sempre gera uma saída de dados do tipo String (sequência de caracteres alfanuméricos). Portanto, se utilizarmos tipos de variáveis diferentes, como, por exemplo, inteiro, devemos fazer a conversão de tipos (_cast_ em Inglês) antes de armazenarmos na sua variável correspondente;
- As conversões são as seguintes:

    - Para int: `Integer.parseInt(variavel);`
    - Para double: `Double.parseDouble(variavel);`
    - Para float: `Float.parseFloat(variavel);`
    
- O comando `JOptionPane.showMessageDialog`não precisa ser convertido pois o Java converte automaticamente tipos numéricos para String antes de exibir a mensagem ao usuário;
- Existem mais formas de conversão de tipos, mas veremos apenas estas na agenda 5;

##### Comparações com String no Java
- Para realizarmos uma comparação de conteúdo de uma variável com uma String no Java, temos que utilizar um método especial chamado `equals()`.

_Exemplo de aplicação:_
`if (nome.equals("Jose")) {...}`
_Neste caso ele comparará se o valor armazenado na variável `nome` é igual a "Jose"._