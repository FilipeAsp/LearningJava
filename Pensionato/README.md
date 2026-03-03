# 🏨 Sistema de Aluguel de Quartos (Pensionato)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Finalizado-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para praticar a manipulação de **Vetores (Arrays)** e a alocação de objetos na memória heap.

---

## 🎯 Objetivo do Projeto
Simular a reserva de quartos em um pensionato com 10 vagas. O desafio foca em organizar estudantes em quartos específicos, utilizando o número do quarto como índice do vetor para garantir acesso rápido e ordenado aos dados.

## ✨ Funcionalidades
- [x] **Reserva Dinâmica:** O usuário define quantos estudantes (1 a 10) serão registrados.
- [x] **Alocação por Índice:** O estudante é registrado exatamente no número do quarto escolhido (0 a 9).
- [x] **Relatório de Ocupação:** Listagem final mostrando apenas os quartos ocupados em ordem crescente.
- [x] **Tratamento de Entrada:** Gerenciamento do buffer do Scanner para leitura de nomes e e-mails.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Regra Aplicada |
| :--- | :--- | :--- |
| **Reserva** | Instancia um objeto `Rent` | Armazena no índice `[quarto]` do vetor |
| **Relatório** | Varredura do Array | Ignora posições `null` para exibir apenas quartos ocupados |
| **Identificação** | Armazena Nome e Email | Dados encapsulados na classe de entidade |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java        # Fluxo principal e controle de entrada/saída
 └── entities/
     └── Rent.java       # Entidade com atributos do estudante (Name, Email)
```

## 📝 Exemplo de Interação no Terminal
```text
How many rooms will be rented? 2

Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5

Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1

Busy rooms: 
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
```