# 📊 Localizador de Elementos (Matrizes)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para exercitar a manipulação de **Matrizes (Arrays Bidimensionais)**, focando na navegação por índices, lógica de busca e verificação de adjacências na memória.

---

## 🎯 Objetivo do Projeto
O sistema permite que o usuário dimensione uma matriz $M \times N$, preencha-a com valores inteiros e realize a busca por um número $X$. Ao encontrar o valor, o programa deve mapear e exibir os elementos vizinhos (acima, abaixo, esquerda e direita), respeitando os limites das bordas.



## ✨ Funcionalidades
- [x] **Dimensionamento Dinâmico:** Leitura das dimensões de linha e coluna em tempo de execução.
- [x] **Navegação Bidimensional:** Uso de laços `for` aninhados para percorrer a estrutura de dados.
- [x] **Tratamento de Bordas:** Verificação de índices para evitar erros de `ArrayIndexOutOfBounds`.
- [x] **Identificação de Vizinhos:** Lógica posicional para localizar elementos adjacentes ao alvo.
- [x] **Configuração Regional:** Uso de `Locale.US` para garantir o padrão de entrada e saída.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Criação da Matriz** | Define linhas e colunas | `int[][] mat = new int[n][m]` |
| **Busca de Valor** | Localiza o número X | `if(mat[i][j] == x)` |
| **Vizinho Esquerdo** | Verifica se existe coluna anterior | `if(j > 0)` |
| **Vizinho Direito** | Verifica se existe próxima coluna | `if(j < mat[i].length - 1)` |
| **Vizinho Superior** | Verifica se existe linha acima | `if(i > 0)` |
| **Vizinho Inferior** | Verifica se existe linha abaixo | `if(i < mat.length - 1)` |

---

## 📂 Estrutura de Pastas

```text
src/
 └── application/
     └── App.java      # Classe principal com lógica de matrizes e busca
```

## 📝 Exemplo de Execução no Terminal
```text
3 4
10 8 15 12
21 11 23 8
14 5 13 19

Localizar o valor: 8

Position 0,1:
Left: 10 
Right: 15 
Down: 11 

Position 1,3:
Left: 23 
Up: 12 
Down: 19 
```