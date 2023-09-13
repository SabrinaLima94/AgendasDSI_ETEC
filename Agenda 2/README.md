## Agenda 2 - Desenvolvimento de Sistemas. 

#### Constante:
   - Um valor que não muda durante a execução de um programa.
   - Usada para representar informações que não devem ser alteradas depois de definidas.
   - São geralmente usadas para armazenar valores como números fixos, informações de configuração que não devem ser modificadas ou valores que são conhecidos antecipadamente.

#### Variável:
   - Um local de armazenamento que pode conter dados que podem variar ou serem alterados durante a execução de um programa.
   - Usadas para representar valores que podem ser calculados, atualizados ou modificados ao longo do tempo.
   - São declaradas com um nome e um tipo de dado (em linguagens de tipagem estática) e podem ser inicializadas com um valor.
   - O valor de uma variável pode ser alterado durante a execução do programa, tornando-as flexíveis para trabalhar 
com dados dinâmicos.

#### Operadores Aritméticos
Desenvolvem uma operação matemática utilizando pseudocódigo ou uma linguagem de programação;

<div align="center">

<img src="img/operadores aritmeticos.png">

</div>

#### Operadores Relacionais
São os responsáveis por efetuar comparações entre dados, com o objetivo de mostrar ao programa como proceder dependendo da situação apresentada

<div align="center">

<img src="img/operadores relacionais.png">

</div>

#### Operadores Lógicos

Responsáveis pela elaboração de comparações especiais, possibilitando que uma única expressão de comparação receba mais de um operador relacional.

<div align="center">

<img src="img/operadores lógicos.png">

</div>

#### Tabela Verdade
 Com ela podemos prever e entender melhor o funcionamento dos Operadores Lógicos. 
 
##### Operador E
 A saída será verdadeira somente se todas as entradas forem verdadeiras, caso contrário a saída será falsa.
 
| Entrada 1 | Entrada 2 | Saída |
| --- | --- | --- |
| V  | V  | V  |
| V  | F  | F  |
| F  | V  | F  |
| F  | F  | F  |

##### Operador OU
Se tivermos uma entrada verdadeira, a saída será verdadeira. A saída será falsa somente quando todas as entradas também forem falsas.

| Entrada 1 | Entrada 2 | Saída |
| --- | --- | --- |
| V  | V  | V  |
| V  | F  | V  |
| F  | V  | V  |
| F  | F  | F  |

##### Operador NÃO
O resultado da expressão é apenas invertido.

 | Entrada | Saída |
| --- | --- |
| V  | F  |
| F  | V  | 

- Para expressão em Pseudocódigo e em Java:

*operador NÃO (!)*
| Expressão em Pseudocódigo | Expressão em Java | Resultado |
| --- | --- | --- |
| NAO V  | ! V  | FALSO  |
| NAO F  | ! F  | VERDADEIRO  |

*operador E (&&)*
| Expressão em Pseudocódigo | Expressão em Java | Resultado |
| --- | --- | --- |
| V E V  | V && V | VERDADEIRO |
| V E F  | V && F | FALSO |
| F E V  | F && V | FALSO |
| F E F  | F && F | FALSO |

*operador OU (||)*
| Expressão em Pseudocódigo | Expressão em Java | Resultado |
| --- | --- | --- |
| V OU V  | V \|\| V | VERDADEIRO |
| V OU F  | V \|\| F | VERDADEIRO |
| F OU V  | F \|\| V | VERDADEIRO |
| F OU F  | F \|\| F | FALSO |

---

##### Exercícios de fixação

| [Atividade](https://github.com/SabrinaLima94/AgendasDSI_ETEC/blob/main/Agenda%202/atividade_agenda2.pdf) |
| ----------------------- |
