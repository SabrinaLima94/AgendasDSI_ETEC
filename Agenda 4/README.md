## Agenda 4 - Desenvolvimento de Sistemas.

##### Comando Escreva
Quando desejamos exibir uma mensagem na tela do usuário utilizando o pseudocódigo, utilizamos o comando: `Escreva`. Em Java, por ser uma linguagem de programação, devemos indicar o caminho completo da operação, no caso: `System.out.printl(mensagem);`.

- `System`: Biblioteca responsável pela interação com o Sistema Operacional;
- `out`: Indica que o comando a ser utilizado será uma saída de dados do sistema;
- `println`: Indica que a saída de dados será feita na tela do usuário. Pode ser substituído pelo comando `print`. 

###### Diferenças entre `println` e `print`
- O comando `println` pulará uma linha na tela, ao final da escrita da mensagem, já o comando `print` escreverá a mensagem na tela sem efetuar nenhuma modificação. Portanto, o seu uso deve ser avaliado para cada situação. 

##### Declarando uma variável
-  Para utilizar uma variável, devemos primeiro declará-la no texto do programa, ou seja, criar um espaço na memória para receber este valor posteriormente. Esta variável deve ter um **nome** e ser vinculada a um tipo (***inteiro, texto, real, etc***).

<div align="center">

<img src="img/declaracao variaveis.png">

</div>

- **A linguagem Java é _case sensitive_, ou seja, um sistema que diferencia caracteres em caixa alta (maiúsculo) e em caixa baixa (minúsculo).**

_Exemplo de aplicação:_
```
//Declaração de variáveis:
    String nome;
    int idade;
    double altura;
```

- Para garantir uma melhor compreensão, as variáveis devem ser nomeadas de forma objetiva. E devemos seguir as seguintes regras:

**1. As variáveis nunca podem conter um espaço em seu nome;**
    Errado: nome do aluno  | Correto: nomeAluno
    
**2. As variáveis nunca podem conter caracteres especiais em seu nome**
    Errado: masculino/feminino  |  Correto: sexo
    
Entende-se por caracteres especiais os seguintes sinais: !, @, #, $, %, \ , /, ], [, (, ), {, }, e todos os caracteres não alfanuméricos.
    
**3. Nomes de variáveis não podem receber acentuação**
    Errado: preço  |  Correto: preco

**4. Nomes de variáveis não podem ser iniciados por números**
    Errado: 1nota  |  Correto: nota1

##### Comando Leia
Este é o comando responsável por receber os dados inseridos pelo usuário. 
Em geral, estes dados são inseridos por meio do teclado, podendo ser numérico ou caractere dependendo do tipo de dados para que a variável - que receberá o valor - estiver configurada.
Em Java, um programa inicial envolve a exibição de mensagens no monitor, operações básicas de processamento de dados e a utilização de variáveis.

Para otimizar o espaço em disco e reduzir o tamanho do aplicativo, é importante importar bibliotecas de classes apenas quando necessário. Essas bibliotecas fornecem as instruções necessárias para que o Java possa trabalhar com novas funcionalidades conforme a necessidade do programador. Importar bibliotecas desnecessárias pode prejudicar o desempenho do aplicativo, portanto, é recomendável importá-las somente quando forem utilizadas.

Para importar uma biblioteca, devemos utilizar o comando:
`import java.util.Scanner;`

Onde:
`java`--> biblioteca básica do Java;
`util`--> pacote de utilitários do Java;
`Scanner`--> ferramenta para leitura de dados;

- O comando `import java.util.Scanner;` deve ser inserido na primeira linha de código, antes mesmo de todos os códigos gerados automaticamente pela IDE;

Após a importação da ferramenta Scanner, precisamos "criá-la" dentro do nosso programa, utilizando o comando: `Scanner leitor = newScanner(System.in);`, onde:

`Scanner`--> nome da ferramenta;
`leitor`--> apelido para o uso corrente (este poderá ser alterado);
`new Scanner`--> indicação que o leitor terá como base a ferramenta Scanner;
`System.in`--> indica que o Scanner será utilizado como entrada de dados do sistema;

- O comando para criar o leitor dentro do programa chama-se **instância**;

##### Leitura de dados com a ferramenta Scanner

Para que a ferramenta Scanner consiga ler adequadamente os dados, devemos adotar uma leitura específica para cada tipo de variável, conforme tabela a seguir:

<div align="center">

<img src="img/tabela Scanner tipo variavel.png">

</div>

##### Exemplo prático de um programa
Passo 1 - Definir a sequência lógica do programa *(entrada - processamento - saída)*;
Passo 2 - Definir quais serão as variáveis necessárias para o programa;
Passo 3 - Construir o fluxograma;
Passo 4 - Construir o Pseudocódigo para "traduzir" a simbologia do fluxograma;
Passo 5 - Construir o programa em Java;
Passo 6 - Executar o programa (teste);

###### Considerações:
- Para inserir comentários em Java utilizamos `//` para comentários de uma linha e `/*`para comentários de múltiplas linhas;
- Todo comando feito em Java deve ser finalizado com o ponto e vírgula;
- Caso o texto digitado fique sublinhado em vermelho no Netbeans significa que está com erro;
- Comandos sublinhados em amarelo são recomendações ou aviso de variáveis declaradas, mas não utilizadas;
- Se passar o mouse em cima das palavras sublinhadas, a IDE apontará recomendações para correção do problema. Mas atenção: nem sempre a IDE acertará o palpite!