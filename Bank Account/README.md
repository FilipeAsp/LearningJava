# 🏦 Sistema de Gerenciamento de Conta Bancária

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-green)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para praticar os pilares da Programação Orientada a Objetos (POO), especificamente **Encapsulamento** e **Construtores**.

---

## 🎯 Objetivo do Projeto
Simular o comportamento real de uma conta bancária, permitindo a abertura de conta, depósitos e saques, garantindo que o saldo seja alterado apenas através de métodos seguros.

## ✨ Funcionalidades
- [x] **Cadastro de Conta:** Registro de número e titular da conta.
- [x] **Depósito Inicial Opcional:** O sistema pergunta se o usuário deseja iniciar com um valor em conta.
- [x] **Operações Financeiras:** Métodos de depósito e saque com atualização em tempo real.
- [x] **Proteção de Dados:** Uso de modificadores de acesso para proteger o saldo da conta.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Regra Aplicada |
| :--- | :--- | :--- |
| **Depósito** | Adiciona valor ao saldo | Incrementa o saldo total |
| **Saque** | Retira valor do saldo | Pode incluir uma taxa de operação (ex: $ 5.00) |
---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │    └── App.java        # Classe principal com o fluxo do usuário
 └── entities/
      └── Account.java    # Entidade com a lógica e atributos
```
---

## 📝 Exemplo de Interação no Terminal

```text
Enter account number: 8532
Enter account holder: Alex Green
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00

Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00
```