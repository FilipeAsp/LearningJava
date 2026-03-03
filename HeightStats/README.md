# 👥 Sistema de Estatísticas de Pessoas (Vetores)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console em **Java** que utiliza vetores para armazenar objetos da classe `Person`. O objetivo é realizar o processamento de dados biométricos e etários de um grupo de pessoas.

---

## 🎯 Objetivo do Projeto
O programa lê os dados de `N` pessoas (nome, idade e altura), armazena-os em um vetor e gera um relatório contendo:
1. A **altura média** do grupo.
2. A **porcentagem** de pessoas com menos de 16 anos.
3. A **listagem dos nomes** dessas pessoas menores de idade.

## ✨ Funcionalidades
- [x] **Armazenamento Estruturado:** Uso de vetor de objetos para gerenciar múltiplos atributos (`name`, `age`, `height`).
- [x] **Cálculo de Média:** Processamento da somatória de alturas via loop.
- [x] **Análise Condicional:** Filtro de idade para identificar indivíduos menores de 16 anos.
- [x] **Cálculo de Porcentagem:** Lógica matemática para exibir a proporção do grupo que atende ao critério de idade.
- [x] **Manipulação de Buffer:** Limpeza de buffer com `sc.nextLine()` para evitar erros na leitura de strings após inteiros.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Média de Altura** | Média aritmética simples | `avg_Height = sum_Height/vect.length`  |
| **Filtro de Idade** | Identifica menores de 16 | `if (vect[i].getAge() < 16)` |
| **Porcentagem** | Proporção de menores | `menores*100.0/vect.length` |
| **Listagem** | Exibe nomes específicos | Loop adicional para imprimir nomes filtrados |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java          # Fluxo principal e cálculos estatísticos
 └── entities/
     └── Person.java       # Classe com atributos: name, age e height
```

## 📝 Exemplo de Execução no Terminal
```Text
Quantas pessoas serao digitadas? 3
Dados da pessoa 1a pessoa: 
Nome: Joao
Idade: 15
Altura: 1.82
Dados da pessoa 2a pessoa: 
Nome: Maria
Idade: 16
Altura: 1.60
Dados da pessoa 3a pessoa: 
Nome: Jose
Idade: 14
Altura: 1.70

Altura media: 1.71
Pessoas menores de 16 anos: 66.7%
Joao
Jose
```